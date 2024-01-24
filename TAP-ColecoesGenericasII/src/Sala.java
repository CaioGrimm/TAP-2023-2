
public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	Sala(){
		
	}
	
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	public String getDescricao() {
		String aux = "";
		if(this.acessivel) {
			aux = "acessível";
		}
		else {
			aux = "não acessível";
		}
		return "Bloco " + this.bloco + ", Sala " + this.sala + " (" + this.capacidade
				+ " lugares, " + aux + ")";
	}
}
