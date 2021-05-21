package clases;

public class Consistencia extends CriterioDeEvaluacion {

	@Override
	public double calcular(Lanzamiento[] lanzamientos) {
		double promedioDistancia = 0;
		double promedioAngulo = 0;
		double desviacionEstandarDistancia = 0;
		double desviacionEstandarAngulo = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
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
	public int compare(Participante uno, Participante dos) {
		return Double.compare(this.calcular(uno.getLanzamientos()), this.calcular(dos.getLanzamientos()));
	}

	@Override
	protected boolean validar(Lanzamiento[] lanzamientos) {
		for (Lanzamiento lanzamiento : lanzamientos) {
			if (!lanzamiento.getValidez())
				return false;
		}
		return true;
	}

}
