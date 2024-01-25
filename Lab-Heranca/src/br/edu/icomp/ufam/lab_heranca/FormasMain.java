package br.edu.icomp.ufam.lab_heranca;

import java.util.ArrayList;

public class FormasMain {

	public static void main(String[] args) {
		ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
		
		formas.add(new Circulo(1,2,3));
		formas.add(new Retangulo(1,2,3,4));
		formas.add(new Quadrado(1,2,3));
	}

}
