public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		// Diz que est� vindo esse atributo/m�todo da classe m�e
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}
	
}
