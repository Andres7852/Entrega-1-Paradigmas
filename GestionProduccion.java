import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class GestionProduccion {

	public static final BiConsumer<manufactura, Integer> agregarUnidades = (registro, adicionales) -> {
		registro.setCantidad(registro.getCantidad() + adicionales);
	};

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




