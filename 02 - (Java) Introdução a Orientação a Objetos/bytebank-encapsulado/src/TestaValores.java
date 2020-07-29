
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println("Agência: " + conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		System.out.println("Agência: " + conta2.getAgencia());
		
		System.out.println("Total de " + Conta.getTotal() + " contas.");
	}
}
