package clases;

import java.util.Comparator;

public class Arbitro implements Comparator<Participante> {

	private CriterioDeEvaluacion criterio;

	public Arbitro(CriterioDeEvaluacion criterio) {
		this.criterio = criterio;
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
			if (esTiroMalo(lanzamiento))
				lanzamiento.setDistancia(0);
			else if (esTiroBueno(lanzamiento))
				lanzamiento.setDistancia(lanzamiento.getDistancia() * 0.8);
		}
	}

	public int compare(Participante uno, Participante dos) {
		return this.criterio.compare(uno, dos);
	}

	public double calcular(Lanzamiento[] lanzamientos) {
		return criterio.calcular(lanzamientos);
	}

}