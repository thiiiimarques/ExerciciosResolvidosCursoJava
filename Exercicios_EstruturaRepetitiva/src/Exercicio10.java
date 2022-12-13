/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor!
*/

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int numero = scan.nextInt();

		if (numero < 0) {
			System.out.println("Precisa ser um numero positivo!");
			numero = scan.nextInt();
		}

		for (int contador = 1; contador <= numero; contador++) {
			System.out.print(contador + " ");
			System.out.print((int) Math.pow(contador, 2) + " ");
			System.out.println((int) Math.pow(contador, 3));
		}

		scan.close();

	}
}
