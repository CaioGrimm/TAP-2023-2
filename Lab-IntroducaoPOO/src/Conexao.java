
public class Conexao {
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	
	Conexao(){
		this.tipoPorta = "";
	}
	
	Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao){
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaTransmissao;
	}
	
	public String getProtocoloString() {
		switch (this.idProtocolo) {
		case 1: {
			return "Rotoscope";
		}
		case 2: {
			return "Acustico";
		}
		case 3: {
			return "Radio";
		}
		default:
			return "Outros";
		}
	}
	
	public double getTaxaMBps() {
		return this.taxaTransmissao / 1024;
	}
	
	public String getDescricao() {
		return "Conexao: tipoPorta=" + this.tipoPorta + ", protocolo="
				+ this.getProtocoloString() + ", taxaTransmissao="
				+ this.getTaxaMBps() + "MBps.";
	}
}
