package helloworld;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Hello World!");
		System.out.println(dt.format(formatter) );
		Calcula cal = new Calcula(Funcao.M.name(), (float) 2, (float) 10 );
		cal.Operacao();
		
		System.out.println(cal.toString());
		
	}

}
