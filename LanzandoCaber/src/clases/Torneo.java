package clases;

import java.util.LinkedList;
import java.util.List;

public class Torneo {

	private List<Participante> lanzadores;
	private List<Podio> podios;
	private Arbitro arbitro;

	public Torneo(List<Participante> listaDeLanzadores) {
		lanzadores = listaDeLanzadores;
		this.arbitro = new Arbitro();
		this.podios = new LinkedList<Podio>();
		for (int i = 0; i < this.arbitro.getCantidadCriterios(); i++) {
			this.podios.add(new Podio(3));
		}
	}

	public List<Participante> getLanzadores() {
		return lanzadores;
	}

	public void generarPodios() {
		for (Participante participante : lanzadores) {
			arbitro.corregirLanzamientos(participante);
			for (Podio podio : podios) {
				if (arbitro.validar(participante))
					podio.clasificarParticipante(participante, arbitro);
				arbitro.cambiarCriterioDeEvaluacion();
			}
		}
	}

	public Podio getPodioConsistencia() {
		return podios.get(0);
	}

	public Podio getPodioDistancia() {
		return podios.get(1);
	}

	public List<Podio> getPodios() {
		return podios;
	}

}
