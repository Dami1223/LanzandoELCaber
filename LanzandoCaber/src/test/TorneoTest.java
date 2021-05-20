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

	private final String rutaSalidaEsperada = "LoteDePrueba\\SalidaEsperada\\podiosEsperados";
	private final String rutaSalida = "LoteDePrueba\\Salida\\podios";
	private final String rutaEntrada = "LoteDePrueba\\Entrada\\lanzadores";

	@Test
	@DisplayName("Caso del Enunciado")
	void EnunciadoTest() throws NumberFormatException, IOException {
		String numeroCaso = "_00";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso de fatiga")
	void fatigaTest() throws NumberFormatException, IOException {

		String pathEntradaAleatorio = rutaEntrada + "CasoAleatorio.in";
		String pathSalidaEsperada = rutaSalidaEsperada + "CasoAleatorio.out";
		String pathSalida = rutaSalida + "CasoAleatorio.out";

		Main.ejecutar(pathEntradaAleatorio, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 01")
	void Caso01Test() throws NumberFormatException, IOException {
		String numeroCaso = "_01";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 02")
	void Caso02Test() throws NumberFormatException, IOException {
		String numeroCaso = "_02";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 03")
	void Caso03Test() throws NumberFormatException, IOException {
		String numeroCaso = "_03";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 04")
	void Caso04Test() throws NumberFormatException, IOException {
		String numeroCaso = "_04";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 05")
	void Caso05Test() throws NumberFormatException, IOException {
		String numeroCaso = "_05";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 06")
	void Caso06Test() throws NumberFormatException, IOException {
		String numeroCaso = "_06";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 07")
	void Caso07Test() throws NumberFormatException, IOException {
		String numeroCaso = "_07";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 08")
	void Caso08Test() throws NumberFormatException, IOException {
		String numeroCaso = "_08";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	@DisplayName("Caso 09")
	void Caso09Test() throws NumberFormatException, IOException {
		String numeroCaso = "_09";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

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
			assertNotNull(lineaSalida, "La salida tiene más lineas que la esperada");

			assertEquals(lineaEsperada, lineaSalida);
		}
		assertNull(brSalida.readLine(), "La salida tiene más lineas que la esperada");
	}

}
