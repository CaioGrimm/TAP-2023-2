package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
	public double raio;

	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		double area, pi = Math.PI;
		area = pi * (this.raio * this.raio);
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro, pi = Math.PI;
		perimetro = 2 * pi * this.raio;
		return perimetro;
	}
	
	public String toString() {
		return "Círculo na " + this.getPosString() + " com raio de " + this.raio + "cm (área=" + this.getArea()
		+ "cm2, perímetro=" + this.getPerimetro() + "cm)";
	}
	
}
