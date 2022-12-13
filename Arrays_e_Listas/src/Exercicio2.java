import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int soma = 0;

		System.out.println("Quantos numeros você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		int[] numeros = new int[qtdNumeros];

		for (int contador = 0; contador < numeros.length; contador++) {

			System.out.println("Digite um numero? ");
			numeros[contador] = scan.nextInt();
			soma = soma + numeros[contador];

		}

		System.out.print("Valores = ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		System.out.println("Soma = " + soma);
		System.out.print("Média = " + soma / qtdNumeros);

		scan.close();

	}
}
