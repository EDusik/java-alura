public class Gerente extends Funcionario {
	
	private int senha;
	
	public Gerente() {
		
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		// Diz que está vindo esse atributo/método da classe mãe
		return super.getBonificacao() + super.getSalario();
	}
	
}
