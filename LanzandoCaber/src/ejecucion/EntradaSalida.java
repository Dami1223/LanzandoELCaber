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

import clases.Lanzamiento;
import clases.Participante;
import clases.Podio;

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

	public static void generarFatiga(String pathEntrada, String pathSalidaEsperada, int cantidadParticipantes)
			throws FileNotFoundException {
		File archivo = new File(pathEntrada);
		PrintWriter pw = new PrintWriter(archivo);
		File archivoSalida = new File(pathSalidaEsperada);
		PrintWriter pwSalida = new PrintWriter(archivoSalida);
		pw.println(cantidadParticipantes);
		double distancia = 0;
		double angulo = 0;
		for (int i = cantidadParticipantes; i >= 1; i--) {
			for (int j = 0; j < 3; j++) {
				distancia += i*0.01;
				pw.print(String.format(Locale.ENGLISH, "%.2f\t", distancia));
				pw.print(String.format(Locale.ENGLISH, "%.2f\n", angulo));
			}
		}
		pwSalida.write(String.format("%d %d %d\n", cantidadParticipantes, cantidadParticipantes - 1,
				cantidadParticipantes - 2));
		pwSalida.write(
				String.format("%d %d %d", cantidadParticipantes, cantidadParticipantes - 1, cantidadParticipantes - 2));
		pw.close();
		pwSalida.close();
	}

	public static void escribirResultado(String pathSalida, List<Podio> podios) throws FileNotFoundException {
		File archivoSalida = new File(pathSalida);
		PrintWriter pwOut = new PrintWriter(archivoSalida);
		for (Podio podio : podios) {
			pwOut.write(podio.toString() + "\n");
		}
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
