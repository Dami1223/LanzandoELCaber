package torneo;

public class Arbitro {

	public double calcularConsistencia(Participante participante) {
		double promedioDistancia = 0;
		double promedioAngulo = 0;
		double desviacionEstandarDistancia = 0;
		double desviacionEstandarAngulo = 0;
		for (Lanzamiento lanzamiento : participante.getLanzamientos()) {
			if (lanzamiento.getDistancia() == 0)
				return 0;
			promedioDistancia += lanzamiento.getDistancia() * 1 / 3;
			promedioAngulo += lanzamiento.getAngulo() * 1 / 3;
		}

		for (Lanzamiento lanzamiento : participante.getLanzamientos()) {
			desviacionEstandarAngulo += Math.pow(lanzamiento.getAngulo() - promedioAngulo, 2) * 1 / 3;
			desviacionEstandarDistancia += Math.pow(lanzamiento.getDistancia() - promedioDistancia, 2) * 1 / 3;
		}
		desviacionEstandarAngulo = Math.sqrt(desviacionEstandarAngulo);
		desviacionEstandarDistancia = Math.sqrt(desviacionEstandarDistancia);

		return (desviacionEstandarAngulo + desviacionEstandarDistancia) / 2;

	}

	public double calcularDistancia(Participante participante) {
		double sumaDistancias = 0;
		for (Lanzamiento lanzamiento : participante.getLanzamientos()) {
			sumaDistancias += lanzamiento.getDistancia();
		}
		return sumaDistancias;
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

	public void setDistaciaValida(Participante participante) {
		for (Lanzamiento lanzamiento : participante.getLanzamientos()) {
			lanzamiento.setDistancia(distanciaValida(lanzamiento));
		}
	}

}
