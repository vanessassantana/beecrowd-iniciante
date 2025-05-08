package desafios;

import java.util.Scanner;
import java.util.Locale;

public class Desafio1002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double raio = input.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2.0); 
		
		System.out.printf("A=%.4f", area);
		
		input.close();
		
	}

}
