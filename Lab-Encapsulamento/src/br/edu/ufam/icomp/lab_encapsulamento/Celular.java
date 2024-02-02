package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class Celular implements Localizavel{
	private int codPais;
	private int codArea;
	private int numero;
	
	public Celular(int codPais, int codArea, int numero) {
		this.setCodArea(codArea);
		this.setCodPais(codPais);
		this.setNumero(numero);
	}

	public int getCodPais() {
		return this.codPais;
	}

	public final void setCodPais(int codPais) {
		if(codPais >= 1 && codPais <=1999) {
			this.codPais = codPais;
		}
		else {
			this.codPais = -1;
		}
	}

	public int getCodArea() {
		return this.codArea;
	}

	public final void setCodArea(int codArea) {
		if(codArea >= 10 && codArea <=99) {
			this.codArea = codArea;
		}
		else {
			this.codArea = -1;
		}
	}

	public int getNumero() {
		return this.numero;
	}

	public final void setNumero(int numero) {
		if(numero >= 10000000 && numero <= 999999999) {
			this.numero = numero;
		}
		else {
			this.numero = -1;
		}
	}
	
	@Override
	public Posicao getPosicao() {
		Random r = new Random();
		double latitude = -3.160000 + (-2.960000 + 3.160000) * r.nextDouble();
		
		Random r2 = new Random();
		double longitude = -60.120000 + (-59.820000 + 60.120000) * r2.nextDouble();
		
		Random r3 = new Random();
		double altitude = 15.0  + (100.0 - 15.0 ) * r3.nextDouble();
		
		Posicao posicao = new Posicao(latitude,longitude,altitude);
		
		return posicao;
	}

	@Override
	public double getErroLocalizacao() {
		// TODO Auto-generated method stub
		return 50.0;
	}
}
