import java.util.*;

public class Turma {
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Turma(String disciplina, int ano, int semestre, Professor professor){
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
	}
	
	public void addAluno(Aluno aluno) {
		boolean existe = false;
		for(int i = 0; i < this.alunos.size(); i++) {
			if(this.alunos.get(i).matricula == aluno.matricula) {
				existe = true;
			}
		}
		if(existe != true) {
			this.alunos.add(aluno);
		}
	}
	
	public Aluno getAluno(int matricula) {
		for(int i = 0; i < this.alunos.size(); i++) {
			if(this.alunos.get(i).matricula == matricula) {
				return this.alunos.get(i);
			}
		}
		return null;
	}
	
	public double getMediaIdade() {
		double media = 0.0;
		
		for(int i = 0; i < this.alunos.size(); i++) {
			media = media + this.alunos.get(i).getIdade();
		}
		
		return media / this.alunos.size();
	}
	
	public String getDescricao() {
		String texto = "Turma " + this.disciplina + " - " + this.ano + "/" 
	+ this.semestre + " (" + this.professor.getDescricao() + "):";
		
		for(int i = 0; i < this.alunos.size(); i++) {
			texto = texto + "\n  - Aluno " + (i+1) + ": " + this.alunos.get(i).getDescricao();
		}
		
		return texto;
	}
}
