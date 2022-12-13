import java.util.Scanner;

public class Exercicio5 {
	
	/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// int codigoPeca1 = scan.nextInt();
		int numeroDePecas1 = scan.nextInt();
		float valorPeca1 = scan.nextFloat();
		// int codigoPeca2 = scan.nextInt();
		int numeroDePecas2 = scan.nextInt();
		float valorPeca2 = scan.nextFloat();
		
		float totalPeca1 = numeroDePecas1 * valorPeca1;
		float totalpeca2 = numeroDePecas2 * valorPeca2;
		
		float valorTotal = totalPeca1 + totalpeca2;
		
		System.out.printf("Valor a Pagar = %.2f", valorTotal);
		
		
		scan.close();
	}
}
