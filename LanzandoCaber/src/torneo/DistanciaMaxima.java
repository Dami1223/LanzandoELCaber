package torneo;

public class DistanciaMaxima extends CriterioDeEvaluacion{
	
	@Override
	double calcular(Lanzamiento[] lanzamientos) {
		double sumaDistancias = 0;
		for (Lanzamiento lanzamiento : lanzamientos) {
			sumaDistancias += lanzamiento.getDistancia();
		}
		return sumaDistancias;
	}

	@Override
	public int comparar(Lanzamiento[] lanzamientos, Lanzamiento[] lanzamientos2) {
		return -Double.compare(calcular(lanzamientos), calcular(lanzamientos2));
	}

}