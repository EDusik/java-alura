
public class TestaBanco {
	public static void main(String[] args) {
		Cliente eduardo = new Cliente();
		
		eduardo.nome = "Eduardo Dusik";
		eduardo.cpf = "000.000.000-00";
		eduardo.profissao = "Programador";
				
		Conta contaDoEduardo = new Conta();
		contaDoEduardo.deposita(7250);
		
		contaDoEduardo.titular = eduardo;
		
		System.out.println(contaDoEduardo.titular.nome);
		
	}
}
