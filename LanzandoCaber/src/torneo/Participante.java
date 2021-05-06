package torneo;

public class Participante {

	@Override
	public String toString() {
		return numeroParticipante + "";
	}

	private int numeroParticipante;
	private Lanzamiento[] lanzamientos;
	private double distanciaTotal;
	private double consistencia;

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

	public double getDistanciaTotal() {
		return this.distanciaTotal;
	}

	public double getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(double consistencia) {
		this.consistencia = consistencia;
	}

	public void setDistanciaTotal(double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}

}
