package clases;

public class Distancia extends CriterioDeEvaluacion {

	@Override
	public double calcular(Lanzamiento[] lanzamientos) {
		double sumaDistancias = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			if (lanzamiento.getValidez())
				sumaDistancias += lanzamiento.getDistancia();
		}
		return sumaDistancias;
	}

	@Override
	public int compare(Lanzamiento[] uno, Lanzamiento[] dos) {
		return -Double.compare(calcular(uno), calcular(dos));
	}

	@Override
	protected boolean validar(Lanzamiento[] lanzamientos) {
		for (Lanzamiento lanzamiento : lanzamientos) {
			if (lanzamiento.getValidez())
				return true;
		}
		return false;
	}

}
