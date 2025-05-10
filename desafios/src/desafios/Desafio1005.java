package desafios;

import java.util.Scanner;
import java.util.Locale;

public class Desafio1005 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		
		double media = (A * 3.5 + B * 7.5) / 11.0;
		
		
		System.out.printf("MEDIA =  %.5f%n", media);
		
		input.close();
				

	}

}
