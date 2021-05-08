package torneo;

import java.util.Comparator;

public abstract class ComparatorParticipante  implements Comparator<Participante>{

	@Override
	public abstract int compare(Participante o1, Participante o2);
	
	
}
