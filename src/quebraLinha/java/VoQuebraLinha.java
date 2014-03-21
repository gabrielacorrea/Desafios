package quebraLinha.java;

public class VoQuebraLinha {

	private String frase;
	private int qtdColunas;
	
	public VoQuebraLinha(String sFrase, int iQtdeColunas) {
		this.setFrase(sFrase);
		this.setQtdColunas(iQtdeColunas);
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getQtdColunas() {
		return qtdColunas;
	}

	public void setQtdColunas(int qtdColunas) {
		this.qtdColunas = qtdColunas;
	}

}
