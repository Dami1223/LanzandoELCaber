package clases;

import java.util.List;

public class Torneo {

	private List<Participante> lanzadores;
	private Podio podioConsistencia;
	private Podio podioDistancia;
	private Arbitro arbitroConsistencia;
	private Arbitro arbitroDistancia;

	public Torneo(List<Participante> listaDeLanzadores) {
		lanzadores = listaDeLanzadores;
		this.arbitroConsistencia = new Arbitro(new Consistencia());
		this.arbitroDistancia = new Arbitro(new Distancia());
		this.podioConsistencia = new Podio(3);
		this.podioDistancia = new Podio(3);
	}

	public List<Participante> getLanzadores() {
		return lanzadores;
	}

	public void generarPodios() {
		for (Participante participante : lanzadores) {
			arbitroConsistencia.corregirLanzamientos(participante);
			if (arbitroConsistencia.validar(participante))
				podioConsistencia.clasificarParticipante(participante, arbitroConsistencia);
			if (arbitroDistancia.validar(participante))
				podioDistancia.clasificarParticipante(participante, arbitroDistancia);
		}
	}

	public Podio getPodioConsistencia() {
		return podioConsistencia;
	}

	public Podio getPodioDistancia() {
		return podioDistancia;
	}

}
