package torneo;

import java.util.List;

public class Torneo {

	private List<Participante> lanzadores;
	private Podio podioConsistencia;
	private Podio podioDistancia; 
	private Arbitro arbitro;

	public Torneo(List<Participante> listaDeLanzadores, int tamPodio) {
		lanzadores = listaDeLanzadores;
		podioConsistencia = new Podio(tamPodio, new PorConsistencia());
		podioDistancia = new Podio (tamPodio, new PorDistancia());
		this.arbitro = new Arbitro();
	}

	public List<Participante> getLanzadores() {
		return lanzadores;
	}

	public void setLanzadores(List<Participante> lanzadores) {
		this.lanzadores = lanzadores;
	}

	public Podio getPodioConsistencia() {
		return podioConsistencia;
	}
	
	public Podio getPodioDistancia(){
		return podioDistancia;
	}

	public void generarPodio() {
		
		
		for (Participante participante : lanzadores) {
			arbitro.setDistaciaValida(participante);
			clasificarParticipanteEnConsistencia(participante);
			clasificarParticipanteEnDistancia(participante);
		}
	}

	private void clasificarParticipanteEnDistancia(Participante participante) {
		participante.setDistanciaTotal(arbitro.calcularDistancia(participante));
		podioDistancia.setGanador(participante);
	}

	private void clasificarParticipanteEnConsistencia(Participante participante) {
			participante.setConsistencia(arbitro.calcularConsistencia(participante));
			if (participante.getConsistencia()!=0)
				podioConsistencia.setGanador(participante);
	}

}
