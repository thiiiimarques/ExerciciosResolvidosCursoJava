/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			int numero = scan.nextInt();
			
			if(numero < 0) {
				System.out.println("NEGATIVO");
			}
			else {
				System.out.println("NÃO NEGATIVO");
			}
		
		scan.close();
	}
	
	
}
