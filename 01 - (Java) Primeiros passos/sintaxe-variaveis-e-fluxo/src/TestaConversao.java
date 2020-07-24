
public class TestaConversao {
	
	public static void maind(String[] args) {
		
		double salario = 7250.50;
		int valor = (int) salario;
		
		System.out.println("Salario e " + valor);
		
		long numeroGrande = 12312312312312321L;
		short valorPequeno = 2131;
		byte valorMuitoPequeno =  127; 
		
		double valor1 = 0.2;
		double valor2 = 01;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		float pontoFlutuante = (float) 3.14;
		float segundoPontoFlutuante = 3.14f;
		
	}
}
