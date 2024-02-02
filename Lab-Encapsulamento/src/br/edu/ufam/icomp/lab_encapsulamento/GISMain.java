package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localizavel[] vetorLocalizaveis = new Localizavel[2];
		
		Celular celular = new Celular(0, 0, 0);
		
		CarroLuxuoso carroLuxuoso = new CarroLuxuoso(null);
		
		vetorLocalizaveis[0] = celular;
		vetorLocalizaveis[1] = carroLuxuoso;
		
		for(int i = 0; i < 2; i++) {
			System.out.println(vetorLocalizaveis[i].getPosicao());
		}
	}

}
