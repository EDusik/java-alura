
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;
	
		// vai sair B, pois o código 65 se refere a letra 'B'
		System.out.println(valor);
		
		String frase = "Alura cursos online de tecnologia de ";
		frase = frase + 2020;
		// vai sair Alura cursos online de tecnologia de 2020
		System.out.println(frase);		
	}
}
