
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 17;
		int quantidadePessoas = 3;
		boolean acompanhado = true;
		
		System.out.println("Acompanhando = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		 
	}
}
