import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	/*  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.

		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159 
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final float pi = 3.14159f;
		double raio = scan.nextDouble();
		
		double area = pi * Math.pow(raio, 2);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Area do Circulo = %.4f ", area);
		
		
		scan.close();
	}

}
