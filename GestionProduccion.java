import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class GestionProduccion {

    //metodo para modificar cantidades producidas
    public static final BiConsumer<manufactura, Integer> agregarUnidades = (registro, adicionales) -> {
		registro.setCantidad(registro.getCantidad() + adicionales);
	};

    //auditoria para el cierre de turno
	public static final Consumer<manufactura> auditoriaCierreTurno = registro -> {
		System.out.println("Cierre de turno - Codigo: " + registro.getCodigoProducto()
				+ ", Producto: " + registro.getNombre()
				+ ", Cantidad final: " + registro.getCantidad());
	};

	public static void cerrarTurno(List<manufactura> registros) {
		registros.forEach(auditoriaCierreTurno);
	}
    //calcular cantidad total producida
	public static int cantidadTotalProducida(List<manufactura> registros) {
		return registros.stream()
				.mapToInt(manufactura::getCantidad)
				.sum();
	}

    //dinero total invertido
	public static double dineroTotalInvertido(List<manufactura> registros) {
		return registros.stream()
				.mapToDouble(registro -> registro.getCostoProduccion() * registro.getCantidad())
				.sum();
	}

    //aplicar ajuste porcentual sobre un registro 
	public static UnaryOperator<manufactura> ajustarCantidadPorcentaje(double porcentaje) {
		return registro -> {
			double nuevaCantidad = registro.getCantidad() * (1 + porcentaje / 100);
			registro.setCantidad((int) Math.round(nuevaCantidad));
			return registro;
		};
	}


    //generar un registro de prduccion de prueba 
	public static manufactura generarRegistroPrueba() {
		Supplier<manufactura> registroPrueba = () -> new manufactura(
				11,
				"Pieza de prueba",
				"Linea de pruebas",
				25,
				1,
				75.00,
				300.0,
				40.0,
				20,
				45.00);

		return registroPrueba.get();
	}
}




