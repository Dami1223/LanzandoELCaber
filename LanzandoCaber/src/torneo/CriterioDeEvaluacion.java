package torneo;

public abstract class CriterioDeEvaluacion {
	
	abstract public double calcular(Lanzamiento[] lanzamientos);

	abstract public int comparar(Lanzamiento[] lanzamientos, Lanzamiento[] lanzamientos2);
}
