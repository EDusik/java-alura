
public class TesteReferencias {

	public static void main(String[] args) {
		
		// Funcionário
		Funcionario f1 = new Funcionario();
		f1.setSalario(3500.0);		
		
		// Gerente
		Gerente g1 = new Gerente();
		g1.setSalario(7250);
		
		// Editor de Vídeo
		EditorDeVideo ed = new EditorDeVideo();
		ed.setSalario(2000.0);			
		
		//Designer
		Designer d = new Designer();
		d.setSalario(3000.0);	
				
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registro(f1);	
		System.out.println(controle.getSoma());
		
		controle.registro(g1);	
		System.out.println(controle.getSoma());
		
		controle.registro(ed);	
		System.out.println(controle.getSoma());
		
		controle.registro(d);		
		System.out.println(controle.getSoma());
	}

}
