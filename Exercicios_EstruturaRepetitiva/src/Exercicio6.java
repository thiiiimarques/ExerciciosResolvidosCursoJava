/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numero a serem digitados: ");
		int N = scan.nextInt();
		
		double mediaPonderada = 0.0;
		
		for (int contador = 0; contador < N; contador++) {
			System.out.println("Digite três numeros: ");
			double numero1 = scan.nextDouble();
			double numero2 = scan.nextDouble();
			double numero3 = scan.nextDouble();
			
			mediaPonderada = ((numero1*2) + (numero2 *3) + (numero3*5)) / (2+3+5) ;
			System.out.printf("%.1f%n", mediaPonderada);
		}	
		
		scan.close();
	}
}
