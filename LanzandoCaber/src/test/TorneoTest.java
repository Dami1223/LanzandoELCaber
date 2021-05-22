package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import ejecucion.EntradaSalida;
import ejecucion.Main;

public class TorneoTest {
	
	private static final int CANTIDAD_PARTICIPANTES_FATIGA = 1000000;
	private final String rutaSalidaEsperada = "LoteDePrueba\\SalidaEsperada\\podiosEsperados";
	private final String rutaSalida = "LoteDePrueba\\Salida\\podios";
	private final String rutaEntrada = "LoteDePrueba\\Entrada\\lanzadores";	
	private static String pathSalidaEsperada;
	private static String pathSalida;
	private static String numeroCaso;
	private static String pathEntrada;
	
	@Test
	public void caso00_Enunciado() throws NumberFormatException, IOException {
		numeroCaso = "_00-Enunciado";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";
		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}
	
	@Test
	public void caso01_OrdenamientoPodioDistancia() throws NumberFormatException, IOException {
		numeroCaso = "_01-OrdenamientoPodioDistancia";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}
	
	@Test
	public void caso02_TiroDescalificado() throws NumberFormatException, IOException {
		numeroCaso = "_02-TiroDescalificado";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}

	@Test
	public void caso03_OrdenamientoPodioConsistencia() throws NumberFormatException, IOException {
		numeroCaso = "_03-OrdenamientoPodioConsistencia";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}

	@Test
	public void caso04_FlujoNormal() throws NumberFormatException, IOException {
		numeroCaso = "_04-FlujoNormal";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}

	@Test
	public void caso05_PodioConsistenciaIncompleto() throws NumberFormatException, IOException {
		numeroCaso = "_05-PodioConsistenciaIncompleto";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}

	@Test
	public void caso06_SinPodioConsistencia() throws NumberFormatException, IOException {
		numeroCaso = "_06-SinPodioConsistencia";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}
	
	@Test
	public void caso07_DistanciaAl80() throws NumberFormatException, IOException {
		numeroCaso = "_07-DistanciaAl80";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}

	@Test
	public void caso08_SinPodios() throws NumberFormatException, IOException {
		numeroCaso = "_08-SinPodios";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalida = rutaSalida + numeroCaso + ".out";

		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}
	
	@Test
	public void caso09_FatigaConsistencia() throws NumberFormatException, IOException {
		numeroCaso = "_09-FatigaConsistencia";
		pathEntrada = rutaEntrada + numeroCaso + ".in";
		pathSalidaEsperada = rutaSalidaEsperada + numeroCaso + ".out";
		pathSalida = rutaSalida + numeroCaso + ".out";
		EntradaSalida.generarFatiga(pathEntrada, pathSalidaEsperada, CANTIDAD_PARTICIPANTES_FATIGA);
		Main.ejecutar(pathEntrada, pathSalida);
		assertEquals(compararArchivosSalida(), true);
	}
	
	
	private boolean compararArchivosSalida() throws FileNotFoundException, IOException {
		boolean res = true;
		String lineaSalida = new String();
		BufferedReader brSalida = new BufferedReader(new FileReader(new File(pathSalida)));
		BufferedReader brSalidaEsperada = new BufferedReader(new FileReader(new File(pathSalidaEsperada)));

		String lineaEsperada;
		while ((lineaEsperada = brSalidaEsperada.readLine()) != null) {
			lineaSalida = brSalida.readLine();
			if(!lineaEsperada.equals(lineaSalida) || lineaSalida == null)
				res = false;			
		}
		if(brSalida.readLine() != null)
			res = false;

		brSalida.close();
		brSalidaEsperada.close();
		return res;
	}

}
