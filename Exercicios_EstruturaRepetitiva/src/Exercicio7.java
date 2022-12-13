import java.util.Scanner;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de numero a serem digitados: ");
		int N = scan.nextInt();

		double divisao = 0.0;

		for (int contador = 0; contador < N; contador++) {
			System.out.println("Digite dois numeros: ");
			double numero1 = scan.nextDouble();
			double numero2 = scan.nextDouble();

			divisao = numero1  / numero2;
			
			if(numero2 == 0) {
				System.out.println("Divisao Impossivel");
			} else {
				System.out.printf("%.1f%n", divisao);
			}
		}

		scan.close();
	}
}
