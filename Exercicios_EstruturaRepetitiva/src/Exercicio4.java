/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de numero a serem digitados: ");
		int N = scan.nextInt();

		int numero = 0;
		int dentroIntervalo = 0;
		int foraIntervalo = 0;

		for (int contador = 0; contador < N; contador++) {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();

			if (numero >= 10 && numero <= 20) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
		}

		System.out.println(dentroIntervalo + " in");
		System.out.println(foraIntervalo + " out");

		scan.close();
	}
}
