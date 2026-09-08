import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalisisProduccion {

    // Cumplimiento minimo aceptable para una linea de produccion
    public static final double CUMPLIMIENTO_MINIMO = 90.0;

    // Function<T,R>: porcentaje de cumplimiento de la meta
    // El 100.0 con decimal evita que Java haga division entera
    public static final Function<manufactura, Double> porcentajeCumplimiento = registro ->
            registro.getMetaProduccion() == 0 ? 0.0
                    : registro.getCantidad() * 100.0 / registro.getMetaProduccion();

    // Function<T,R>: transforma el registro en informacion resumida para el supervisor
    public static final Function<manufactura, String> resumenSupervisor = registro ->
            "Codigo " + registro.getCodigoProducto()
            + " - " + registro.getNombre()
            + " | Linea: " + registro.getNombreLinea()
            + " | Producidas: " + registro.getCantidad()
            + " | Defectuosas: " + registro.getCantidadDefectuosa()
            + " | Meta: " + registro.getMetaProduccion()
            + " | Cumplimiento: " + String.format("%.2f", porcentajeCumplimiento.apply(registro)) + "%";

    // Transformacion resumida de todos los registros
    public static List<String> resumirRegistros(List<manufactura> registros) {
        return registros.stream()
                .map(resumenSupervisor)
                .collect(Collectors.toList());
    }

    // Producto de mayor desempeno segun cumplimiento de la meta
    public static Optional<manufactura> productoMayorDesempeno(List<manufactura> registros) {
        return registros.stream()
                .max(Comparator.comparingDouble(porcentajeCumplimiento::apply));
    }

    // Producto de menor desempeno segun cumplimiento de la meta
    public static Optional<manufactura> productoMenorDesempeno(List<manufactura> registros) {
        return registros.stream()
                .min(Comparator.comparingDouble(porcentajeCumplimiento::apply));
    }

    // Cumplimiento promedio de cada linea de produccion
    public static Map<String, Double> cumplimientoPorLinea(List<manufactura> registros) {
        return registros.stream()
                .collect(Collectors.groupingBy(
                        manufactura::getNombreLinea,
                        TreeMap::new,
                        Collectors.averagingDouble(porcentajeCumplimiento::apply)));
    }

    // Lineas que no alcanzan el cumplimiento minimo
    public static List<String> lineasBajoCumplimiento(List<manufactura> registros) {
        return cumplimientoPorLinea(registros).entrySet().stream()
                .filter(entrada -> entrada.getValue() < CUMPLIMIENTO_MINIMO)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Reporte de analisis y metricas globales
    public static void mostrarAnalisisGlobal(List<manufactura> registros) {

        System.out.println("RESUMEN PARA SUPERVISORES");
        resumirRegistros(registros).forEach(System.out::println);

        System.out.println();
        System.out.println("DESEMPENO DE PRODUCTOS");
        productoMayorDesempeno(registros).ifPresent(registro -> System.out.println(
                "Mayor desempeno: " + registro.getNombre() + " ("
                + String.format("%.2f", porcentajeCumplimiento.apply(registro)) + "%)"));
        productoMenorDesempeno(registros).ifPresent(registro -> System.out.println(
                "Menor desempeno: " + registro.getNombre() + " ("
                + String.format("%.2f", porcentajeCumplimiento.apply(registro)) + "%)"));

        System.out.println();
        System.out.println("CUMPLIMIENTO POR LINEA DE PRODUCCION");
        cumplimientoPorLinea(registros).forEach((linea, promedio) ->
                System.out.println(linea + " -> " + String.format("%.2f", promedio) + "%"));
        System.out.println("Lineas con bajo cumplimiento (menos de "
                + CUMPLIMIENTO_MINIMO + "%): " + lineasBajoCumplimiento(registros));

        System.out.println();
        System.out.println("METRICAS DE VOLUMEN E INVERSION");
        System.out.println("Cantidad total producida: "
                + GestionProduccion.cantidadTotalProducida(registros));
        System.out.println("Dinero invertido en produccion: $"
                + String.format("%.2f", GestionProduccion.dineroTotalInvertido(registros)));
    }
}