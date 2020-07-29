public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.setNumero(1337);
		// System.out.println(conta.getNumero());
		
		Cliente eduardo = new Cliente();
		// conta.titular = eduardo;
				
		eduardo.setNome("Eduardo Dusik");
		eduardo.setCpf("000.000.000-00");
		eduardo.setProfissao("Programador");		
		conta.setTitular(eduardo);
				
		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("CPF: " + conta.getTitular().getCpf());
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
		
		conta.getTitular().setProfissao("Programador Full Stack");
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
	}
}
