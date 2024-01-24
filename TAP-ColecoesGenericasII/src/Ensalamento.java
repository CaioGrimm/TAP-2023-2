import java.util.ArrayList;

public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	Ensalamento(){
		
	}
	
	public void addSala(Sala sala) {
		this.salas.add(sala);
	}
	
	public void addTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	public Sala getSala(Turma turma) {
		int size = this.ensalamento.size();
		
		for(int i = 0; i < size; i++) {
			if(this.ensalamento.get(i).turma.nome == turma.nome) {
				return this.ensalamento.get(i).sala;
			}
		}
		return null;
	}
	
	public boolean salaDisponivel(Sala sala, int horario) {
		int size = this.ensalamento.size();
		
		for(int i = 0; i < size; i++) {
			if(this.ensalamento.get(i).sala == sala) {
				for(int j = 0; j < this.ensalamento.get(i).turma.horarios.size(); i++) {
					if(this.ensalamento.get(i).turma.horarios.get(j) == horario) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		int size = this.ensalamento.size();
		
		for(int i = 0; i < size; i++) {
			if(this.ensalamento.get(i).sala == sala) {
				for(int j = 0; j < this.ensalamento.get(i).turma.horarios.size(); i++) {
					for(int k = 0; k < horarios.size(); k++) {
						if(this.ensalamento.get(i).turma.horarios.get(j) == horarios.get(k)) {
							return true;
						}	
					}
				}
			}
		}
		return false;
	}
	
	public boolean alocar(Turma turma, Sala sala) {
		
	}
	
	public void alocarTodas() {
		
	}
	
	public int getTotalTurmasAlocadas() {
		
	}
	
	public int getTotalEspacoLivre() {
		
	}
	
	public String relatorioResumoEnsalamento() {
		
	}
	
	public String relatorioTurmasPorSala() {
		
	}
	
	public String relatorioSalasPorTurma() {
		
	}
}
