package ejecucion;

import java.io.IOException;
import java.util.List;

import clases.Participante;
import clases.Torneo;

public class Main {

	public static Torneo ejecutar(String pathEntrada, String pathSalida) throws NumberFormatException, IOException {

		List<Participante> listaDeLanzadores = EntradaSalida.leer(pathEntrada);

		Torneo torneo = new Torneo(listaDeLanzadores);
		torneo.generarPodios();

		EntradaSalida.escribirResultado(pathSalida, torneo.getPodios());
		return torneo;
	}

}
