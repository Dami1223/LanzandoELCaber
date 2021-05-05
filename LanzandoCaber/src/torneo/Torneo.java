package torneo;

import java.util.List;

public class Torneo {

	private List<Participante> lanzadores;
	private Podio podio;
	private Arbitro arbitro;

	public Torneo(List<Participante> listaDeLanzadores) {
		lanzadores = listaDeLanzadores;
		podio = new Podio();
		this.arbitro = new Arbitro();
	}

	public List<Participante> getLanzadores() {
		return lanzadores;
	}

	public void setLanzadores(List<Participante> lanzadores) {
		this.lanzadores = lanzadores;
	}

	public Podio getPodio() {
		return podio;
	}

	public void generarPodio() {
		for (Participante participante : lanzadores) {
			arbitro.setDistaciaValida(participante);
			clasificarPaticipanteEnConsistencia(participante);
			clasificarParticipanteEnDistancia(participante);
		}
	}

	private void clasificarParticipanteEnDistancia(Participante participante) {
		participante.setDistanciaTotal(arbitro.calcularDistancia(participante));
		podio.setGanadorDistancia(participante);
	}

	private void clasificarPaticipanteEnConsistencia(Participante participante) {
			arbitro.calcularConsistencia(participante);
			participante.setConsistencia(arbitro.calcularConsistencia(participante));
			podio.setGanadorConsistencia(participante);
	}

}
