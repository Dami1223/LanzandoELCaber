package torneo;


public class PorConsistencia extends ComparatorParticipante {

	@Override
	public int compare(Participante o1, Participante o2) {
		return Double.compare(o1.getConsistencia(), o2.getConsistencia());
	}

}
