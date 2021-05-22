package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import ejecucion.EntradaSalida;
import ejecucion.Main;

public class TorneoTest {

	private static final int CANTIDAD_PARTICIPANTES_FATIGA = 1000000;
	private final String rutaSalidaEsperada = "LoteDePrueba\\SalidaEsperada\\podiosEsperados";
	private final String rutaSalida = "LoteDePrueba\\Salida\\podios";
	private final String rutaEntrada = "LoteDePrueba\\Entrada\\lanzadores";

	@Test
	public void enunciadoTest() throws NumberFormatException, IOException {
		String numeroCaso = "_00";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void fatigaConsistenciaTest() throws NumberFormatException, IOException {
		String numeroCaso = "CasoFatiga";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathSalida = rutaSalida + numeroCaso + ".out";
		EntradaSalida.generarFatiga(pathEntrada, pathSalidaEsperada, CANTIDAD_PARTICIPANTES_FATIGA);
		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso01Test() throws NumberFormatException, IOException {
		String numeroCaso = "_01";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso02Test() throws NumberFormatException, IOException {
		String numeroCaso = "_02";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso03Test() throws NumberFormatException, IOException {
		String numeroCaso = "_03";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso04Test() throws NumberFormatException, IOException {
		String numeroCaso = "_04";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso05Test() throws NumberFormatException, IOException {
		String numeroCaso = "_05";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso06Test() throws NumberFormatException, IOException {
		String numeroCaso = "_06";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso07Test() throws NumberFormatException, IOException {
		String numeroCaso = "_07";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso8Test() throws NumberFormatException, IOException {
		String numeroCaso = "_8-TiroDescalificado";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso9Test() throws NumberFormatException, IOException {
		String numeroCaso = "_9-SinPodioConsistencia";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	@Test
	public void caso10Test() throws NumberFormatException, IOException {
		String numeroCaso = "_10-DistanciaAl80";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}

	@Test
	public void caso11Test() throws NumberFormatException, IOException {
		String numeroCaso = "_11-SinPodios";
		String pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		String pathEntrada = rutaEntrada + numeroCaso + ".in";
		String pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		compararArchivosSalida(pathSalidaEsperada, pathSalida);
	}
	
	private void compararArchivosSalida(String pathSalidaEsperada, String pathSalida)
			throws FileNotFoundException, IOException {
		BufferedReader brSalida = new BufferedReader(new FileReader(new File(pathSalida)));
		BufferedReader brSalidaEsperada = new BufferedReader(new FileReader(new File(pathSalidaEsperada)));

		String lineaEsperada;
		while ((lineaEsperada = brSalidaEsperada.readLine()) != null) {
			String lineaSalida = brSalida.readLine();
			assertNotNull(lineaSalida);

			assertEquals(lineaEsperada, lineaSalida);
		}
		assertNull(brSalida.readLine());
	}
}
