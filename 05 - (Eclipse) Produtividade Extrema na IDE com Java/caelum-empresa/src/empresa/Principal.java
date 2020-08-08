package empresa;
import java.util.Calendar;
import java.util.GregorianCalendar;

import empresa.modelo.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1989, 10, 8);
		Funcionario funcionario = new Funcionario("Eduardo Dusik", 30, dataNascimento);
		
		System.out.println(funcionario.toString());
	}
}
