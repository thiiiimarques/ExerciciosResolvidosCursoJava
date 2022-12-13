/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero para descobrir seu fatorial: ");
		int N = scan.nextInt();
		
		int fatorial = 1;

		for (int contador = 1; contador <= N; contador++) {
				fatorial = fatorial * contador;

		}
		
		System.out.println(fatorial);
		
		scan.close();

	}
}
