// temos polimorfismo via herança ou interface.
public class TesteSistema {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();		
		gerente.setSenha(4444);
		
		Administrador adm = new Administrador();
		adm.setSenha(4444);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(4444);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(gerente);
		si.autentica(adm);
		si.autentica(cliente);
		
	}
}
