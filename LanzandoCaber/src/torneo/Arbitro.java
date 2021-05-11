package torneo;

import java.util.Comparator;

public class Arbitro implements Comparator<Participante> {

	private CriterioDeEvaluacion criterio;

	public Arbitro(CriterioDeEvaluacion criterio) {
		this.criterio = criterio;
	}

	public double distanciaValida(Lanzamiento lanzamiento) {
		if (isTiroExelente(lanzamiento))
			return lanzamiento.getDistancia();
		if (isTiroBueno(lanzamiento))
			return lanzamiento.getDistancia() * 0.8;
		return 0;
	}

	private boolean isTiroBueno(Lanzamiento lanzamiento) {
		return lanzamiento.getAngulo() < 90 && lanzamiento.getAngulo() > 30
				|| lanzamiento.getAngulo() > -90 && lanzamiento.getAngulo() < -30;
	}

	private boolean isTiroExelente(Lanzamiento lanzamiento) {
		return lanzamiento.getAngulo() < 30 && lanzamiento.getAngulo() > -30;
	}

	public CriterioDeEvaluacion getCriterio() {
		return this.criterio;
	}

	public void corregirLanzamientos(Participante participante) {
		for (Lanzamiento lanzamiento : participante.getLanzamientos()) {
			lanzamiento.setDistancia(this.distanciaValida(lanzamiento));
		}
	}

	public int compare(Participante o1, Participante o2) {
		return this.criterio.comparar(o1.getLanzamientos(), o2.getLanzamientos());
	}

	public double calcular(Lanzamiento[] lanzamientos) {
		return criterio.calcular(lanzamientos);
	}

}