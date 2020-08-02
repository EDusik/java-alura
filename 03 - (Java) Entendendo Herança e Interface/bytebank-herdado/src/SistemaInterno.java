
public class SistemaInterno {
	
	private int senha = 4444;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sitema");
		} else {
			System.out.println("Não pode entrar no sitema");
		}
	}
}
