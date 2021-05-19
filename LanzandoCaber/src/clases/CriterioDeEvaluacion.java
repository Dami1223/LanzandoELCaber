package torneo;

import java.util.Comparator;

public abstract class CriterioDeEvaluacion implements Comparator<Participante> {

	public abstract double calcular(Lanzamiento[] lanzamientos);
}
