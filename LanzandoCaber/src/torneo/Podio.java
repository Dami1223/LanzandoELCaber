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
		for (int i = 0; i < this.ganadores.size(); i++) {
			if (arbitro.compare(ganadores.get(i), participante) > 0) {
				this.ganadores.add(i, participante);
				if (this.ganadores.size() > this.escalones)
					this.ganadores.remove(this.escalones);
				return true;
			}
		}
		if (this.ganadores.size() == 0) {
			this.ganadores.add(participante);
			return true;
		} else if (this.ganadores.size() < this.escalones) {
			this.ganadores.add(participante);
			return true;
		}
		return false;
	}

	public int getEscalones() {
		return escalones;
	}

}
