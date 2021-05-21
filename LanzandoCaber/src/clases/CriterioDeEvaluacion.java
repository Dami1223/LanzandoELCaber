package clases;

import java.util.Comparator;

public abstract class CriterioDeEvaluacion implements Comparator<Lanzamiento[]> {

	public abstract double calcular(Lanzamiento[] lanzamientos);

	protected abstract boolean validar(Lanzamiento[] lanzamientos);
}
