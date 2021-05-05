package torneo;

import java.util.Comparator;

public class PorConsistencia implements Comparator<Participante> {

	@Override
	public int compare(Participante o1, Participante o2) {
		return Double.compare(o1.getConsistencia(), o2.getConsistencia());
	}

}
