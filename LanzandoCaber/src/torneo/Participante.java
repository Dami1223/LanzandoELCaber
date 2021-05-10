package torneo;

public class Participante {

	@Override
	public String toString() {
		return numeroParticipante + "";
	}

	private int numeroParticipante;
	private Lanzamiento[] lanzamientos;

	public Participante(int nroParticipante, Lanzamiento[] lanzamientos2) {
		this.numeroParticipante = nroParticipante;
		this.lanzamientos = lanzamientos2;
	}

	public Lanzamiento[] getLanzamientos() {
		return lanzamientos;
	}

	public int getNumeroParticipante() {
		return numeroParticipante;
	}

	public void setNumeroParticipante(int numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}

	public void setLanzamientos(Lanzamiento[] lanzamientos) {
		this.lanzamientos = lanzamientos;
	}

}
