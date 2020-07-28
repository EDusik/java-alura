package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoEduardo = new Conta();
		contaDoEduardo.deposita(1000);
		System.out.println(contaDoEduardo.saldo);
		
		boolean conseguiuRetirar = contaDoEduardo.saca(1000);
		
		System.out.println(contaDoEduardo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaSuelen = new Conta();
		contaDaSuelen.deposita(5000);
		
		boolean sucessoTransferencia = contaDaSuelen.transfere(4500, contaDoEduardo);
		
		if (sucessoTransferencia) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDoEduardo.saldo);
		System.out.println(contaDaSuelen.saldo);
	}
}
