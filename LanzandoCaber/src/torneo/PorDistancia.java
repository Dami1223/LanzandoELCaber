package torneo;

import java.util.Comparator;

public class PorDistancia implements Comparator<Participante> {

	@Override
	public int compare(Participante o1, Participante o2) {
		return -Double.compare(o1.getDistanciaTotal(), o2.getDistanciaTotal());
	}

}
