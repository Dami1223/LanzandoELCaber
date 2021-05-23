package clases;

import java.util.List;

public class Torneo {

	private List<Participante> lanzadores;
	private Podio podioConsistencia;
	private Podio podioDistancia;
	private Arbitro arbitro;

	public Torneo(List<Participante> listaDeLanzadores) {
		lanzadores = listaDeLanzadores;
		this.arbitro = new Arbitro();
		this.podioConsistencia = new Podio(3);
		this.podioDistancia = new Podio(3);
	}

	public List<Participante> getLanzadores() {
		return lanzadores;
	}

	public void generarPodios() {
		for (Participante participante : lanzadores) {
			arbitro.corregirLanzamientos(participante);
			arbitro.evaluarSegun(new Consistencia());
			if (arbitro.validar(participante))
				podioConsistencia.clasificarParticipante(participante, arbitro);
			arbitro.evaluarSegun(new Distancia());
			if (arbitro.validar(participante))
				podioDistancia.clasificarParticipante(participante, arbitro);
		}
	}

	public Podio getPodioConsistencia() {
		return podioConsistencia;
	}

	public Podio getPodioDistancia() {
		return podioDistancia;
	}

}
