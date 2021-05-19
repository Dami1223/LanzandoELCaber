package torneo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Podio {

	private List<Participante> ganadores;
	private int escalones;
	private Comparator <Participante> comparador;

	public Podio(int escalones , Comparator<Participante> c1) {
		this.ganadores= new ArrayList<Participante>(3);
		this.escalones = escalones;
		this.comparador = c1;
	}

	public List<Participante> getGanadores() {
		return ganadores;
	}


	public void setGanador(Participante participante){
		this.ganadores.add(participante);
		this.ganadores.sort(comparador);
		if (this.ganadores.size() > this.escalones)
			this.ganadores.remove(this.escalones);
	}

	public int getEscalones() {
		return escalones;
	}

	public void setEscalones(int escalones) {
		this.escalones = escalones;
	}
	@Override
	public String toString() {
		String ret = "";
		for (Participante participante : ganadores)
			ret += participante.getNumeroParticipante() < ganadores.size() ? participante.getNumeroParticipante() + " " : participante.getNumeroParticipante();
		return ret;
	}
}
