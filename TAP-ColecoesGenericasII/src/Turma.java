import java.util.ArrayList;

public class Turma {
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	Turma(){
		
	}
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}
	
	public void addHorario(int horario) {
		if(horario < 0 && horario > 35) {
			System.out.print("Horario invalido");
		}
		else {
			boolean existe = false;
			
			for(int i = 0; i < this.horarios.size(); i++) {
				if(this.horarios.get(i) == horario) {
					existe = true;
				}
			}
			if(existe != true) {
				this.horarios.add(horario);
			}
		}
	}
	
	public String getHorariosString() {
		String string = "";
		int horario;
		for(int i = 0; i < this.horarios.size(); i++) {
			horario = this.horarios.get(i);
			if(horario < 8) {
				string = string + "segunda ";
			}
			if(horario >= 8 && horario < 15) {
				string = string + "terça ";
			}
			if(horario >= 15 && horario < 22) {
				string = string + "quarta ";
			}
			if(horario >= 22 && horario < 29) {
				string = string + "quinta ";
			}
			if(horario >= 29 && horario < 36) {
				string = string + "sexta ";
			}
			
			if(horario == 1 || horario == 8 || horario == 15 || horario == 22 || horario == 29 ) {
				string = string + "8hs";
			}
			if(horario == 2 || horario == 9 || horario == 16 || horario == 23 || horario == 30 ) {
				string = string + "10hs";
			}
			if(horario == 3 || horario == 10 || horario == 17 || horario == 24 || horario == 31 ) {
				string = string + "12hs";
			}
			if(horario == 4 || horario == 11 || horario == 18 || horario == 25 || horario == 32 ) {
				string = string + "14hs";
			}
			if(horario == 5 || horario == 12 || horario == 19 || horario == 26 || horario == 33 ) {
				string = string + "16hs";
			}
			if(horario == 6 || horario == 13 || horario == 20 || horario == 27 || horario == 34 ) {
				string = string + "18hs";
			}
			if(horario == 7 || horario == 14 || horario == 21 || horario == 28 || horario == 35 ) {
				string = string + "20hs";
			}
			
			if(i < this.horarios.size() - 1) {
				string = string + ", ";
			}
		}
		return string;
	}
	
	public String getDescricao() {
		String aux = "Não";
		if(this.acessivel) {
			aux = "Sim";
		}
		
		return "Turma: " + this.nome + "\nProfessor: " + this.professor + "\nNúmero de Alunos: " + this.numAlunos 
				+ "\nHorário: " + this.getHorariosString() + "\nAcessível: " + aux;
	}
}
