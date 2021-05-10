package torneo;

public class Consistencia extends CriterioDeEvaluacion {

	@Override
	double calcular(Lanzamiento[] lanzamientos) {
		double promedioDistancia = 0;
		double promedioAngulo = 0;
		double desviacionEstandarDistancia = 0;
		double desviacionEstandarAngulo = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			if (lanzamiento.getDistancia() == 0)
				return 0;
			promedioDistancia += lanzamiento.getDistancia() * 1 / 3;
			promedioAngulo += lanzamiento.getAngulo() * 1 / 3;
		}

		for (Lanzamiento lanzamiento : lanzamientos) {
			desviacionEstandarAngulo += Math.pow(lanzamiento.getAngulo() - promedioAngulo, 2) * 1 / 3;
			desviacionEstandarDistancia += Math.pow(lanzamiento.getDistancia() - promedioDistancia, 2) * 1 / 3;
		}
		desviacionEstandarAngulo = Math.sqrt(desviacionEstandarAngulo);
		desviacionEstandarDistancia = Math.sqrt(desviacionEstandarDistancia);

		return (desviacionEstandarAngulo + desviacionEstandarDistancia) / 2;
	}

	@Override
	public int comparar(Lanzamiento[] lanzamientos, Lanzamiento[] lanzamientos2) {
		return Double.compare(calcular(lanzamientos), calcular(lanzamientos2));
	}

}
