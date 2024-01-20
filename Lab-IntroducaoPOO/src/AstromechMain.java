
public class AstromechMain {
	public static void main(String args[]) {
		Mestre mestre = new Mestre("Luke Skywalker",19,"Alianca para Restauracao da Republica", "Jedi");
		Sensor sensor = new Sensor("Azul",512,240);
		Conexao conexao = new Conexao("SCOMP Link",1,4000);
		
		Astromech astromech = new Astromech("R2-D2",mestre,sensor,conexao);
	}
}
