package torneo;

public abstract class CriterioDeEvaluacion {
	
	abstract double calcular(Lanzamiento[] lanzamientos);

	abstract public int comparar(Lanzamiento[] lanzamientos, Lanzamiento[] lanzamientos2);
}
