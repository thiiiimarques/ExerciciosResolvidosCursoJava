// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Numero Par");
		}
		else {
			System.out.println("Numero Impar");
		}
		
		scan.close();
	}
}
