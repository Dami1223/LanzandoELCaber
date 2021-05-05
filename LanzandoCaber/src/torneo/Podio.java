package torneo;

import java.util.ArrayList;
import java.util.List;

public class Podio {

	private List<Participante> ganadoresConsistencia;
	private List<Participante> ganadoresDistancia;
	private int escalones;

	public Podio() {
		this.ganadoresConsistencia = new ArrayList<Participante>(3);
		this.ganadoresDistancia = new ArrayList<Participante>(3);
		this.escalones = 3;
	}

	public List<Participante> getGanadoresConsistencia() {
		return ganadoresConsistencia;
	}

	public void setGanadoresConsistencia(List<Participante> participante) {
		this.ganadoresConsistencia = participante;
	}

	public List<Participante> getGanadoresDistancia() {
		return ganadoresDistancia;
	}

	public void setGanadorDistancia(Participante participante) {
//		participante.setDistanciaTotal(this.calcularDistancia(participante));
		this.ganadoresDistancia.add(participante);
		this.ganadoresDistancia.sort(new PorDistancia());
		if (this.ganadoresDistancia.size() > this.escalones)
			this.ganadoresDistancia.remove(this.escalones);
	}

	public void setGanadorConsistencia(Participante participante) {
//		participante.setConsistencia(this.calcularConsistencia(participante));
		if (participante.getConsistencia() != 0) {
			this.ganadoresConsistencia.add(participante);
			this.ganadoresConsistencia.sort(new PorConsistencia());
			if (this.ganadoresConsistencia.size() > this.escalones)
				this.ganadoresConsistencia.remove(this.escalones);
		}
	}

	public int getEscalones() {
		return escalones;
	}

	public void setEscalones(int escalones) {
		this.escalones = escalones;
	}

}
