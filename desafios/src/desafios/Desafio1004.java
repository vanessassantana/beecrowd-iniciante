package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
        Scanner input = new Scanner(System.in);
        
        int valor1 = input.nextInt();
		int valor2 = input.nextInt();
		
		int prod = valor1 * valor2;
		
		System.out.println("PROD = " + prod);
		
		input.close();
		
	}

}
