package quebraLinha.java;

public class Escritor {

	private VoQuebraLinha pojo = new VoQuebraLinha("Um pequeno jabuti xereta viu dez cegonhas felizes.", 20);
	private String fraseQuebrada = "";
	private int espaco = 0;

	public Escritor(VoQuebraLinha vo) {
		pojo = vo;
	}

	public void quebraFrase() {
		String[] vPalavras = pojo.getFrase().split(" ");
		this.espaco = pojo.getQtdColunas();

		for (int i = 0; i < vPalavras.length; i++) {
			this.fraseQuebrada += this.quebraColunasDaFrase(vPalavras[i]);
		}
	}

	public String quebraColunasDaFrase(String palavra) {
		String palavraQuebrada = "";

		if (palavra.length() < this.espaco) {
			this.espaco -= palavra.length();
			palavraQuebrada = palavra + " ";
		} else {
			this.espaco = pojo.getQtdColunas() - palavra.length();
			palavraQuebrada = "\n" + palavra + " ";
		}
		return palavraQuebrada;
	}

	public void escreveFrase() {
		System.out.println("Resultado: \n" + this.fraseQuebrada);
	}
	
	public String getFraseQuebrada() {
		return this.fraseQuebrada;
	}

}
