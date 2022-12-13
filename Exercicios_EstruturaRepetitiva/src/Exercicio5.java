/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso. 
*/

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int valor = scan.nextInt();

		if (valor >= 1 && valor <= 1000) {
			for (int contador = 1; contador <= valor; contador++) {
				if (contador % 2 != 0) {
					System.out.println(contador);
				}
			}
		} else {
			System.out.println("Digite um valor entre 1 e 1000");
		}

		scan.close();
	}
}
