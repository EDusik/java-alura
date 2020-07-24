
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 17;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		// System.out.println("Acompanhando = " + acompanhado);
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Acompanhando = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
			 
	}
}
