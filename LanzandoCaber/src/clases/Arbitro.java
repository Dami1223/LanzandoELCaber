package clases;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Arbitro implements Comparator<Participante> {

	private Queue<CriterioDeEvaluacion> criterios;

	public Arbitro() {
		this.criterios = new LinkedList<CriterioDeEvaluacion>();
		this.criterios.add(new Consistencia());
		this.criterios.add(new Distancia());
	}

	private boolean esTiroBueno(Lanzamiento lanzamiento) {
		return lanzamiento.getAngulo() < 90 && lanzamiento.getAngulo() > 30
				|| lanzamiento.getAngulo() > -90 && lanzamiento.getAngulo() < -30;
	}

	private boolean esTiroMalo(Lanzamiento lanzamiento) {
		return lanzamiento.getAngulo() < -90 && lanzamiento.getAngulo() > -180
				|| lanzamiento.getAngulo() > 90 && lanzamiento.getAngulo() < 180;
	}

	public void corregirLanzamientos(Participante participante) {
		for (Lanzamiento lanzamiento : participante.getLanzamientos()) {
			lanzamiento.setValidez(true);
			if (esTiroMalo(lanzamiento)) {
				lanzamiento.setValidez(false);
			} else if (esTiroBueno(lanzamiento))
				lanzamiento.setDistancia(lanzamiento.getDistancia() * 0.8);
		}
	}

	public int compare(Participante uno, Participante dos) {
		return this.criterios.peek().compare(uno.getLanzamientos(), dos.getLanzamientos());
	}

	public double calcular(Lanzamiento[] lanzamientos) {
		return criterios.peek().calcular(lanzamientos);
	}

	public boolean validar(Participante participante) {
		return this.criterios.peek().validar(participante.getLanzamientos());
	}

	public void cambiarCriterioDeEvaluacion() {
		this.criterios.add(this.criterios.poll());
	}

	public int getCantidadCriterios() {
		return this.criterios.size();
	}

}