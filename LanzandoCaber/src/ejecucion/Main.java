package ejecucion;

import java.io.IOException;
import java.util.List;

import clases.Participante;
import clases.Torneo;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String pathEntrada = "LoteDePrueba\\Entrada\\Caso00_Enunciado.in";
		String pathSalida = "LoteDePrueba\\Salida\\Caso00_Enunciado.out";

//		String pathEntradaAleatorio = "LoteDePrueba\\Entrada\\CasoAleatorio.in";
//		int cantidadParticipantes = 1000;
//		EntradaSalida.escribirAleatorio(pathEntradaAleatorio, cantidadParticipantes);

		Torneo torneo = ejecutar(pathEntrada, pathSalida);

		System.out.println("Ganadores en Consistencia:" + torneo.getPodioConsistencia().getGanadores());
		System.out.println("Ganadores en Distancia:" + torneo.getPodioDistancia().getGanadores());
	}

	public static Torneo ejecutar(String pathEntrada, String pathSalida) throws NumberFormatException, IOException {

		List<Participante> listaDeLanzadores = EntradaSalida.leer(pathEntrada);

		Torneo torneo = new Torneo(listaDeLanzadores);
		torneo.generarPodios();

		EntradaSalida.escribirResultado(pathSalida, torneo.getPodioConsistencia(), torneo.getPodioDistancia());
		return torneo;
	}

}
