package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura;
	public double altura;

	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		double area;
		area = this.largura * this.altura;
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro;
		perimetro = 2 * (this.altura + this.largura);
		return perimetro;
	}
	
	public String toString() {
		return "Retângulo na " + this.getPosString() + " com largura de " + this.largura + "cm e altura de " + 
	this.altura +"cm (área=" + this.getArea()
		+ "cm2, perímetro=" + this.getPerimetro() + "cm)";
	}
}
