package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejecucion.Main;

@DisplayName("Lote de Prueba")
class TorneoTest {

	private final String rutaSalidaEsperada = "LoteDePrueba\\SalidaEsperada\\";
	private final String rutaSalida = "LoteDePrueba\\Salida\\";
	private final String rutaEntrada = "LoteDePrueba\\Entrada\\";

	@Test
	@DisplayName("Caso del Enunciado")
	void EnunciadoTest() throws NumberFormatException, IOException {
		String nombreCaso = "Caso00_Enunciado";
		String pathSalidaEsperada = rutaSalidaEsperada + nombreCaso + ".out";
		String pathEntrada = rutaEntrada + nombreCaso + ".in";
		String pathSalida = rutaSalida + nombreCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	private void compararArchivosSalida(String pathSalidaEsperada, String pathSalida)
			throws FileNotFoundException, IOException {
		BufferedReader brSalida = new BufferedReader(new FileReader(new File(pathSalida)));
		BufferedReader brSalidaEsperda = new BufferedReader(new FileReader(new File(pathSalidaEsperada)));

		String lineaEsperada;
		while ((lineaEsperada = brSalidaEsperda.readLine()) != null) {
			String lineaSalida = brSalida.readLine();
			assertNotNull(lineaSalida, "La salida tiene m�s lineas que la esperada");

			assertEquals(lineaEsperada, lineaSalida);
		}
		assertNull(brSalida.readLine(), "La salida tiene m�s lineas que la esperada");
	}

}
