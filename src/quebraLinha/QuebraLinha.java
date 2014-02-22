package quebraLinha;

public class QuebraLinha {
	
	/*Escreva um programa em que dado uma frase e a quantidade de colunas que podem ser exibidas na tela, 
	faça a quebra de linhas sem quebrar as palavras.
	Por exemplo, se passarmos a frase "Um pequeno jabuti xereta viu dez cegonhas felizes." 
	e pedirmos para ela ser exibida em 20 colunas, teremos como resposta:
		
	Um pequeno jabuti
	xereta viu dez
	cegonhas felizes.*/
		
	public static void main(String[] args) {
	
		VoQuebraLinha quebra = new VoQuebraLinha();
		quebra.setFrase("Minha frase de teste aqui");
		quebra.setQtdColunas(10);
		
		int cont = quebra.getQtdColunas();
		
		String[] vet = quebra.getFrase().split(" ");
		String fim  = "";
				
		System.out.println(quebra.getFrase());
		System.out.println(quebra.getFrase().length());
		System.out.println(quebra.getQtdColunas());
		System.out.println("dd=" + vet[0].length());
						
		for (int i = 0; i < vet.length; i++) {
						
			if (vet[i].length() < cont) {
				cont -= vet[i].length(); 
				fim += vet[i];
			}
			else
				System.out.println("->" + vet[i]);
			
		}
		System.out.println(" fim =" + fim);
				
		/*for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}*/
		
		
	}

}
