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
		// Diz que est� vindo esse atributo/m�todo da classe m�e
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}
	
}
