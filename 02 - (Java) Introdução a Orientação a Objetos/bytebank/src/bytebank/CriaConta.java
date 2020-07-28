package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo =  7250;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		
		System.out.println("Primeira agencia tem: " + primeiraConta.agencia);
		System.out.println("Primeira numero é: " + primeiraConta.numero);
		System.out.println("Primeira titular é: " + primeiraConta.titular);
	}
}
