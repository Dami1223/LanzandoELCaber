package torneo;

import java.util.List;

public class Torneo {

	private List<Participante> lanzadores;
	private Podio podioConsistencia;
	private Podio podioDistanciaMaxima;
	private Arbitro arbitroConsistencia;
	private Arbitro arbitroDistanciaMaxima;

	public Torneo(List<Participante> listaDeLanzadores) {
		lanzadores = listaDeLanzadores;
		this.arbitroConsistencia = new Arbitro(new Consistencia());
		this.arbitroDistanciaMaxima = new Arbitro(new DistanciaMaxima());
		this.podioConsistencia = new Podio(3);
		this.podioDistanciaMaxima = new Podio(3);

	}

	public List<Participante> getLanzadores() {
		return lanzadores;
	}

	public void generarPodio() {
		for (Participante participante : lanzadores) {
			arbitroConsistencia.corregirLanzamientos(participante);
			if (arbitroConsistencia.calcular(participante.getLanzamientos()) != 0)
				podioConsistencia.clasificarParticipante(participante, arbitroConsistencia);
			podioDistanciaMaxima.clasificarParticipante(participante, arbitroDistanciaMaxima);
		}
	}

	public Podio getPodioConsistencia() {
		return podioConsistencia;
	}

	public Podio getPodioDistanciaMaxima() {
		return podioDistanciaMaxima;
	}

}
