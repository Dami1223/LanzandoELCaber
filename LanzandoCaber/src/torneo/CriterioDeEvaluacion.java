package torneo;

public abstract class CriterioDeEvaluacion {

	public abstract double calcular(Lanzamiento[] lanzamientos);

	public abstract int comparar(Lanzamiento[] lanzamientos, Lanzamiento[] lanzamientos2);
}
