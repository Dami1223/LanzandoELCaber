package torneo;

import java.util.ArrayList;
import java.util.List;

public class Podio {

	private List<Participante> ganadores;
	private int escalones;

	public Podio(int escalones) {
		this.ganadores = new ArrayList<Participante>(escalones);
		this.escalones = escalones;
	}

	public List<Participante> getGanadores() {
		return ganadores;
	}

	public boolean clasificarParticipante(Participante participante, Arbitro arbitro) {
		int i = 0;
		for (i = 0; i < this.ganadores.size(); i++) {
			if (arbitro.compare(ganadores.get(i), participante) > 0) {
				this.ganadores.add(i, participante);
				if(this.ganadores.size()>3)
					this.ganadores.remove(this.escalones);
				return true;
			}
		}
		if (i == 0) {
			this.ganadores.add(participante);
			return true;
		} else if (i < this.escalones) {
			this.ganadores.add(participante);
			return true;
		}
		return false;
	}

	public int getEscalones() {
		return escalones;
	}

}
