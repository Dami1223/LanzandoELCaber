package torneo;

import java.io.IOException;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		String pathEntradaAleatorio = "lanzadoresAleatorio.in";
		String pathEntrada = "lanzadores.in";
		String pathSalida = "podios.out";

		int cantidadParticipantes = 1000;
		EntradaSalida.escribirAleatorio(pathEntradaAleatorio, cantidadParticipantes);

		List<Participante> listaDeLanzadores = EntradaSalida.leer(pathEntrada);

		Torneo torneo = new Torneo(listaDeLanzadores);
		torneo.generarPodio();
		System.out.println("Ganadores en consistencia:" + torneo.getPodioConsistencia().getGanadores());
		System.out.println("Ganadores en distancia:" + torneo.getPodioDistancia().getGanadores());

		EntradaSalida.escribirResultado(pathSalida, torneo.getPodioConsistencia(), torneo.getPodioDistancia());
	}

}
