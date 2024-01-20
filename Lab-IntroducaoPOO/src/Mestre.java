
public class Mestre {
	String nome;
	int anoNascimento;
	String afiliacao;
	String posto;
	
	Mestre(){
		this.nome = "Poe Dameron";
		this.afiliacao = "Japão";
		this.posto = "Mestre";
	}
	
	Mestre(String nome, int anoNascimento, String afiliacao, String posto){
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	
	public int getIdade(int anoReferencia) {
		int idade = anoReferencia - this.anoNascimento;

		return idade;
	}
	
	public boolean possuiForca() {
		if(this.posto == "Jedi" || this.posto == "Sith") {
			return true;
		}
		return false;
	}
	
	public String getAnoNascimentoString() {
		if(this.anoNascimento < 0)
			return Integer.toString(Math.abs(this.anoNascimento)) + "ABY";
		else {
			return Integer.toString(this.anoNascimento) + "DBY";
		}
	}
	
	public String getDescricao() {
		return "Mestre: nome=" + this.nome + ", anoNascimento=" + 
	this.getAnoNascimentoString() + ", afiliacao=" + this.afiliacao +
	", posto=" + this.posto + ", possuiForca=" + this.possuiForca() + ".";
	}
	
}
