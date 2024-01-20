
public class TurmaMain {
	public static void main(String args[]) {
	    Aluno aluno = new Aluno("Emmett L. Brown", 7714,22);
	    Aluno aluno2 = new Aluno("Brown Souza", 1234,23);
	    Professor professor = new Professor("Dr.","Hubert J. Farnsworth",2208);
	    Turma turma1 = new Turma("Teste",2023,1,professor);
	    turma1.addAluno(aluno);
	    turma1.addAluno(aluno2);
	}
}