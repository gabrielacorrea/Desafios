package quebraLinha;


public class QuebraLinha {

	/*
	 * Escreva um programa em que dado uma frase e a quantidade de colunas que
	 * podem ser exibidas na tela, faça a quebra de linhas sem quebrar as
	 * palavras. Por exemplo, se passarmos a frase
	 * "Um pequeno jabuti xereta viu dez cegonhas felizes." e pedirmos para ela
	 * ser exibida em 20 colunas, teremos como resposta:
	 * 
	 * Um pequeno jabuti xereta viu dez cegonhas felizes.
	 */

	public static void main(String[] args) {

		VoQuebraLinha quebra = new VoQuebraLinha();
		quebra.setFrase("Um pequeno jabuti xereta viu dez cegonhas felizes.");
		quebra.setQtdColunas(20);
		
		Escritor escritor = new Escritor(quebra);
		escritor.quebraFrase();
		escritor.escreveFrase();
	}
}
