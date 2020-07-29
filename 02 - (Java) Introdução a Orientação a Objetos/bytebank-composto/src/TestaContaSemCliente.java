
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaSuelen = new Conta();		
		System.out.println(contaDaSuelen.getSaldo());
		
		contaDaSuelen.titular = new Cliente();
		contaDaSuelen.titular.nome = "Suelen";
		
		System.out.println(contaDaSuelen.titular.nome);
	}
}
