package clases;

public class Lanzamiento {

	private double distancia;
	private double angulo;

	public Lanzamiento(double distancia, double angulo) {
		this.distancia = distancia;
		this.angulo = angulo;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getDistancia() {
		return distancia;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
}
