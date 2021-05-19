package ejecucion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import torneo.Lanzamiento;
import torneo.Participante;
import torneo.Podio;

public class EntradaSalida {

	public static void escribirAleatorio(String pathEntrada, int cantidadParticipantes) throws FileNotFoundException {
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
<<<<<<< HEAD:LanzandoCaber/src/torneo/EntradaSalida.java
		pwOut.write(podioC.toString() + "\n" + podioD.toString() + "\n");
=======

		for (Participante participante : podioC.getGanadores()) {
			pwOut.write(participante.getNumeroParticipante() + " ");
		}
		pwOut.write("\n");
		for (Participante participante : podioD.getGanadores()) {
			pwOut.write(participante.getNumeroParticipante() + " ");
		}
		pwOut.write("\n");
>>>>>>> a588a34c84484b5d52ddbde55f3696c19d43c52f:LanzandoCaber/src/ejecucion/EntradaSalida.java
		pwOut.close();
	}

	public static List<Participante> leer(String path) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(new FileReader(new File(path)));
		int cantidadParticipantes = sc.nextInt();
		List<Participante> listaParticipantes = new ArrayList<Participante>(cantidadParticipantes);
		sc.useLocale(Locale.ENGLISH);
		int cantidadLanzamientos = 3;
		int nroParticipante = 0;

		while (sc.hasNextLine() && nroParticipante < cantidadParticipantes) {

			Lanzamiento[] lanzamientos = new Lanzamiento[cantidadLanzamientos];
			nroParticipante++;
			for (int j = 0; j < cantidadLanzamientos; j++) {
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
