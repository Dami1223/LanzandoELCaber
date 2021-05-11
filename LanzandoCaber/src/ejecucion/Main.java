package ejecucion;

import java.io.IOException;
import java.util.List;

import torneo.Participante;
import torneo.Torneo;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String pathEntrada = "lanzadores.in";
		String pathSalida = "podios.out";
		
//		String pathEntradaAleatorio = "lanzadoresAleatorio.in";
//		int cantidadParticipantes = 1000;
//		EntradaSalida.escribirAleatorio(pathEntradaAleatorio, cantidadParticipantes);

		Torneo torneo = ejecutar(pathEntrada, pathSalida);

		System.out.println("Ganadores en consistencia:" + torneo.getPodioConsistencia().getGanadores());
		System.out.println("Ganadores en distancia:" + torneo.getPodioDistancia().getGanadores());
	}

	public static Torneo ejecutar(String pathEntrada, String pathSalida) throws NumberFormatException, IOException {

		List<Participante> listaDeLanzadores = EntradaSalida.leer(pathEntrada);

		Torneo torneo = new Torneo(listaDeLanzadores);
		torneo.generarPodio();

		EntradaSalida.escribirResultado(pathSalida, torneo.getPodioConsistencia(), torneo.getPodioDistancia());
		return torneo;
	}

}
