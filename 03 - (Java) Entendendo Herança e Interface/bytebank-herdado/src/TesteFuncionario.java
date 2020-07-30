
public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario eduardo = new Funcionario();
		eduardo.setNome("Eduardo Dusik");
		eduardo.setCpf("000.000.000-00k");
		eduardo.setSalario(7250.00);
		
		System.out.println(eduardo.getNome());
		System.out.println(eduardo.getBonificacao());
	}
}
