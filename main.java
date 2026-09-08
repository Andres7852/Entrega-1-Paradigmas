
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class manufactura {

    private Integer CodigoProducto;
    private String Nombre;
    private String NombreLinea;
    private String LineaProduccion;
    private Integer Cantidad;
    private Integer CantidadDefectuosa;
    private Double CostoUnitario;
    private Double MinutosUtilizados;
    private Double KilogramosMateriaPrima;
    private Integer MetaProduccion;
    private Double CostoProduccion;

    public manufactura(
            Integer CodigoProducto,
            String Nombre,
            String NombreLinea,
            String LineaProduccion,
            Integer Cantidad,
            Integer CantidadDefectuosa,
            Double CostoUnitario,
            Double MinutosUtilizados,
            Double KilogramosMateriaPrima,
            Integer MetaProduccion,
            Double CostoProduccion) {

        this.CodigoProducto = CodigoProducto;
        this.Nombre = Nombre;
        this.NombreLinea = NombreLinea;
        this.LineaProduccion = LineaProduccion;
        this.Cantidad = Cantidad;
        this.CantidadDefectuosa = CantidadDefectuosa;
        this.CostoUnitario = CostoUnitario;
        this.MinutosUtilizados = MinutosUtilizados;
        this.KilogramosMateriaPrima = KilogramosMateriaPrima;
        this.MetaProduccion = MetaProduccion;
        this.CostoProduccion = CostoProduccion;
    }

    public Integer getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(Integer CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreLinea() {
        return NombreLinea;
    }

    public void setNombreLinea(String NombreLinea) {
        this.NombreLinea = NombreLinea;
    }

    public String getLineaProduccion() {
        return LineaProduccion;
    }

    public void setLineaProduccion(String LineaProduccion) {
        this.LineaProduccion = LineaProduccion;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Integer getCantidadDefectuosa() {
        return CantidadDefectuosa;
    }

    public void setCantidadDefectuosa(Integer CantidadDefectuosa) {
        this.CantidadDefectuosa = CantidadDefectuosa;
    }

    public Double getCostoUnitario() {
        return CostoUnitario;
    }

    public void setCostoUnitario(Double CostoUnitario) {
        this.CostoUnitario = CostoUnitario;
    }

    public Double getMinutosUtilizados() {
        return MinutosUtilizados;
    }

    public void setMinutosUtilizados(Double MinutosUtilizados) {
        this.MinutosUtilizados = MinutosUtilizados;
    }

    public Double getKilogramosMateriaPrima() {
        return KilogramosMateriaPrima;
    }

    public void setKilogramosMateriaPrima(Double KilogramosMateriaPrima) {
        this.KilogramosMateriaPrima = KilogramosMateriaPrima;
    }

    public Integer getMetaProduccion() {
        return MetaProduccion;
    }

    public void setMetaProduccion(Integer MetaProduccion) {
        this.MetaProduccion = MetaProduccion;
    }

    public Double getCostoProduccion() {
        return CostoProduccion;
    }

    public void setCostoProduccion(Double CostoProduccion) {
        this.CostoProduccion = CostoProduccion;
    }

    @Override
    public String toString() {
        return "[CodigoProducto=" + CodigoProducto +
                ", Nombre=" + Nombre +
                ", NombreLinea=" + NombreLinea +
                ", LineaProduccion=" + LineaProduccion +
                ", Cantidad=" + Cantidad +
                ", CantidadDefectuosa=" + CantidadDefectuosa +
                ", CostoUnitario=$" + CostoUnitario +
                ", MinutosUtilizados=" + MinutosUtilizados +
                ", KilogramosMateriaPrima=" + KilogramosMateriaPrima +
                ", MetaProduccion=" + MetaProduccion +
                ", CostoProduccion=$" + CostoProduccion +
                "]";
    }
}

public class main {

    public static void main(String[] args) {

        String flujoElectromecanico = "Recepcion de materia prima -> " +
                "Preparacion de componentes -> " +
                "Ensamble electromecanico -> " +
                "Pruebas funcionales -> " +
                "Control de calidad -> " +
                "Empaque y envio";

        String flujoElectrodomesticos = "Recepcion de materia prima -> " +
                "Preparacion de carcasa y componentes -> " +
                "Ensamble electrico y mecanico -> " +
                "Pruebas funcionales -> " +
                "Control de calidad -> " +
                "Empaque y envio";

        String flujoIluminacion = "Recepcion de materia prima -> " +
                "Preparacion de estructura -> " +
                "Ensamble electrico -> " +
                "Prueba de iluminacion -> " +
                "Control de calidad -> " +
                "Empaque y envio";

        List<manufactura> listaManufacturas = Arrays.asList(

                new manufactura(1, "Motor Industrial", "Electromecanica", flujoElectromecanico, 100, 7, 1500.00,
                        12000.0, 5500.0, 80, 950.00),

                new manufactura(2, "Aspiradora", "Electrodomesticos", flujoElectrodomesticos, 78, 34, 438.67,
                        3510.0, 624.0, 60, 270.00),

                new manufactura(3, "Lampara", "Iluminacion", flujoIluminacion, 340, 32, 133.00,
                        2720.0, 850.0, 400, 78.00),

                new manufactura(4, "Ventilador", "Electrodomesticos", flujoElectrodomesticos, 200, 12, 250.00,
                        7000.0, 1200.0, 250, 150.00),

                new manufactura(5, "Licuadora", "Electrodomesticos", flujoElectrodomesticos, 300, 15, 149.20,
                        9000.0, 1200.0, 350, 88.00),

                new manufactura(6, "Cafetera", "Electrodomesticos", flujoElectrodomesticos, 120, 5, 220.00,
                        4200.0, 540.0, 130, 130.00),

                new manufactura(7, "Calefactor", "Electrodomesticos", flujoElectrodomesticos, 180, 10, 125.00,
                        5400.0, 900.0, 200, 75.00),

                new manufactura(8, "Taladro", "Electromecanica", flujoElectromecanico, 150, 8, 211.10,
                        3750.0, 525.0, 180, 125.00),

                new manufactura(9, "Sierra Electrica", "Electromecanica", flujoElectromecanico, 90, 6, 550.76,
                        3150.0, 630.0, 100, 330.00),

                new manufactura(10, "Compresor de Aire", "Electromecanica", flujoElectromecanico, 50, 3, 800.00,
                        4500.0, 1250.0, 60, 520.00)

        );

        // ==========================================
        // 1. PRODUCTOS CON ALTO NIVEL DE DEFECTOS
        // ==========================================

        java.util.function.Predicate<manufactura> nivelAltoDefectos = p -> ((double) p.getCantidadDefectuosa()
                / p.getCantidad()) * 100 > 10;

        List<manufactura> productosAltoNivelDefectos = listaManufacturas.stream()
                .filter(nivelAltoDefectos)
                .collect(Collectors.toList());

        System.out.println("PRODUCTOS CON ALTO NIVEL DE DEFECTOS");

        productosAltoNivelDefectos.forEach(System.out::println);

        // ==========================================
        // 2. PRODUCTOS QUE CUMPLEN LA META
        // ==========================================

        java.util.function.Predicate<manufactura> cumpleMeta = p -> p.getCantidad() > p.getMetaProduccion();

        List<manufactura> productosCumplenMeta = listaManufacturas.stream()
                .filter(cumpleMeta)
                .collect(Collectors.toList());

        System.out.println("PRODUCTOS QUE SUPERAN LA META");

        productosCumplenMeta.forEach(System.out::println);

        // ==========================================
        // 3. COSTO TOTAL DE FABRICACION
        // ==========================================

        java.util.function.Function<manufactura, Double> calcularCostoTotal = p -> p.getCostoProduccion()
                * p.getCantidad();

        System.out.println("COSTO TOTAL DE FABRICACION");

        listaManufacturas.forEach(p -> {

            double costoTotal = calcularCostoTotal.apply(p);

            System.out.println(
                    p.getNombre()
                            + " -> Costo total: $" + costoTotal);
        });

        // ==========================================
        // 4. PERDIDAS ECONOMICAS POR PRODUCTOS
        // DEFECTUOSOS
        // ==========================================

        java.util.function.Function<manufactura, Double> calcularPerdida = p -> p.getCantidadDefectuosa()
                * p.getCostoProduccion();

        System.out.println("PERDIDAS ECONOMICAS POR DEFECTOS");

        listaManufacturas.forEach(p -> {

            double perdida = calcularPerdida.apply(p);

            System.out.println(
                    p.getNombre()
                            + " -> Perdida: $" + perdida);
        });

        // ==========================================
        // 5. DESEMPENO DE CADA LINEA DE PRODUCCION
        // ==========================================

        Map<String, List<manufactura>> productosPorLinea = listaManufacturas.stream()
                .collect(Collectors.groupingBy(
                        manufactura::getNombreLinea));

        System.out.println("DESEMPENO DE LAS LINEAS DE PRODUCCION");

        productosPorLinea.forEach((linea, productos) -> {

            int cantidadTotal = productos.stream()
                    .mapToInt(manufactura::getCantidad)
                    .sum();

            int defectuososTotal = productos.stream()
                    .mapToInt(manufactura::getCantidadDefectuosa)
                    .sum();

            double costoTotal = productos.stream()
                    .mapToDouble(p -> p.getCostoProduccion() * p.getCantidad())
                    .sum();

            double perdidasTotal = productos.stream()
                    .mapToDouble(p -> p.getCantidadDefectuosa()
                            * p.getCostoProduccion())
                    .sum();

            double porcentajeDefectos = ((double) defectuososTotal / cantidadTotal) * 100;

            System.out.println("LINEA DE PRODUCCION:");
            System.out.println(linea);

            System.out.println("Cantidad producida: "
                    + cantidadTotal);

            System.out.println("Cantidad defectuosa: "
                    + defectuososTotal);

            System.out.println("Porcentaje de defectos: "
                    + porcentajeDefectos + "%");

            System.out.println("Costo total de fabricacion: $"
                    + costoTotal);

            System.out.println("Perdidas por productos defectuosos: $"
                    + perdidasTotal);

        });

        // ==========================================
        // 6. ANALISIS Y METRICAS GLOBALES
        // ==========================================

        AnalisisProduccion.mostrarAnalisisGlobal(listaManufacturas);

        // ==========================================
        // 7. REPORTE FINAL
        // ==========================================

        System.out.println();
        System.out.println("REPORTE FINAL DE LA JORNADA");

        // Lineas existentes
        List<String> lineasExistentes = listaManufacturas.stream()
                .map(manufactura::getNombreLinea)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lineas existentes: " + lineasExistentes);

        // Total de unidades defectuosas
        int totalDefectuosas = listaManufacturas.stream()
                .mapToInt(manufactura::getCantidadDefectuosa)
                .sum();

        System.out.println("Total de unidades defectuosas: " + totalDefectuosas);

        // Costo total de produccion
        double costoTotalProduccion = listaManufacturas.stream()
                .mapToDouble(p -> p.getCostoProduccion() * p.getCantidad())
                .sum();

        System.out.println("Costo total de produccion: $" + costoTotalProduccion);

        // Perdidas economicas totales
        double perdidasTotales = listaManufacturas.stream()
                .mapToDouble(p -> p.getCantidadDefectuosa() * p.getCostoProduccion())
                .sum();

        System.out.println("Perdidas economicas totales: $" + perdidasTotales);

        // Producto con mayor perdida economica
        listaManufacturas.stream()
                .max(Comparator.comparingDouble(p -> p.getCantidadDefectuosa() * p.getCostoProduccion()))
                .ifPresent(p -> System.out.println("Producto con mayor perdida: " + p.getNombre()
                        + " ($" + (p.getCantidadDefectuosa() * p.getCostoProduccion()) + ")"));

        // Linea con mayor cantidad producida
        listaManufacturas.stream()
                .collect(Collectors.groupingBy(
                        manufactura::getNombreLinea,
                        Collectors.summingInt(manufactura::getCantidad)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println("Linea con mayor produccion: " + e.getKey()
                        + " (" + e.getValue() + " unidades)"));

        // ==========================================
        // 8. OPERACIONES DE TURNO
        // ==========================================

        System.out.println();
        System.out.println("OPERACIONES DE TURNO");

        // Supplier: registro de prueba generado automaticamente
        manufactura registroPrueba = GestionProduccion.generarRegistroPrueba();
        System.out.println("Registro de prueba: " + registroPrueba);

        // BiConsumer: reportar unidades adicionales
        manufactura registroAjustado = listaManufacturas.get(3);
        System.out.println("Ventilador antes: " + registroAjustado.getCantidad() + " uds");
        GestionProduccion.agregarUnidades.accept(registroAjustado, 60);
        System.out.println("Ventilador despues de reportar 60 uds: " + registroAjustado.getCantidad());

        // UnaryOperator: ajuste porcentual del -8%
        GestionProduccion.ajustarCantidadPorcentaje(-8).apply(registroAjustado);
        System.out.println("Ventilador tras ajuste del -8%: " + registroAjustado.getCantidad());

        // Cierre del turno
        System.out.println();
        GestionProduccion.cerrarTurno(listaManufacturas);
    }
}