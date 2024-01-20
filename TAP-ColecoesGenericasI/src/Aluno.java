import java.util.Calendar;

public class Aluno {
	String nome;
	int matricula;
	int anoNascimento;
	
	Aluno(){
		this.nome = "";
	}
	
	Aluno(String nome, int matricula, int anoNascimento){
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	
	public int getIdade() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		
		return ano - this.anoNascimento;
	}
	
	public String getDescricao() {
		return this.nome + " (mat=" + this.matricula + ", idade=" + this.getIdade() 
		+ ")";
	}
}
