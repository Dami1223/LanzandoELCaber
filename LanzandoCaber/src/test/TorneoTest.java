package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejecucion.Main;

@DisplayName("Lote de Prueba")
class TorneoTest {

	@Test
	@DisplayName("Caso00")
	void EnunciadoTest() throws NumberFormatException, IOException {
		String pathSalida = "podios.out";
		String pathSalidaEsperada = "podiosEsperados.out";

		Main.ejecutar("lanzadores.in", pathSalida);

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
