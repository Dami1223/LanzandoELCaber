package clases;

import java.util.Comparator;

public interface CriterioDeEvaluacion extends Comparator<Lanzamiento[]> {

	public double calcular(Lanzamiento[] lanzamientos);

	public boolean validar(Lanzamiento[] lanzamientos);

}
