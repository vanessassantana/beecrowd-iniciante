package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1003 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US); 
        Scanner input = new Scanner(System.in);
        

		int A = input.nextInt();
		int B = input.nextInt();
		
		int soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		input.close();
		
		
	}

}
