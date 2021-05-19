package torneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EntradaSalida {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String pathEntradaAleatorio = "lanzadoresAleatorio.in";
		String pathEntrada = "lanzadores.in";
		String pathSalida = "podios.out";

		int cantidadParticipantes = 1000;
		escribirAleatorio(pathEntradaAleatorio, cantidadParticipantes);

		List<Participante> listaDeLanzadores = leer(pathEntrada);
		Torneo torneo = new Torneo(listaDeLanzadores, 3);
		torneo.generarPodio();
		System.out.println("Ganadores en consistencia:" + torneo.getPodioConsistencia().getGanadores());
		System.out.println("Ganadores en distancia:" + torneo.getPodioDistancia().getGanadores());

		escribirResultado(pathSalida, torneo.getPodioConsistencia(), torneo.getPodioDistancia());
	}

	private static void escribirAleatorio(String pathEntrada, int cantidadParticipantes) throws FileNotFoundException {
		File archivo = new File(pathEntrada);
		PrintWriter pw = new PrintWriter(archivo);
		pw.println(cantidadParticipantes);
		for (int i = 0; i < cantidadParticipantes * 3; i++) {
			pw.print(String.format(Locale.ENGLISH, "%.2f\t", Math.random() * 5));
			pw.print(String.format(Locale.ENGLISH, "%.2f\n", Math.random() * 5));
		}
		pw.close();
	}

	public static void escribirResultado(String pathSalida, Podio podioC, Podio podioD) throws FileNotFoundException {
		File archivoSalida = new File(pathSalida);
		PrintWriter pwOut = new PrintWriter(archivoSalida);
		pwOut.write(podioC.toString() + "\n" + podioD.toString() + "\n");
		pwOut.close();
	}

	public static List<Participante> leer(String path) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(new FileReader(new File(path)));
		int cantidadParticipantes = sc.nextInt();
		List<Participante> listaParticipantes = new ArrayList<Participante>(cantidadParticipantes);
		sc.useLocale(Locale.ENGLISH);

		int nroParticipante = 0;

		while (sc.hasNextLine() && nroParticipante < cantidadParticipantes) {
			Lanzamiento[] lanzamientos = new Lanzamiento[3];
			nroParticipante++;
			for (int j = 0; j < 3; j++) {
				double distancia = sc.nextDouble();
				double angulo = sc.nextDouble();
				lanzamientos[j] = new Lanzamiento(distancia, angulo);
			}
			listaParticipantes.add(new Participante(nroParticipante, lanzamientos));
		}
		sc.close();
		return listaParticipantes;
	}

}
