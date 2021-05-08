package torneo;


public class PorDistancia extends ComparatorParticipante {

	@Override
	public int compare(Participante o1, Participante o2) {
		return -Double.compare(o1.getDistanciaTotal(), o2.getDistanciaTotal());
	}

}
