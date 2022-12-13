import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		char[] generos = new char[qtdNumeros];
		double[] alturas = new double[qtdNumeros];

		double somaAlturaMulheres = 0, qtdMulheres = 0, qtdHomens = 0;

		for (int contador = 0; contador < alturas.length; contador++) {

			System.out.print("Altura da " + (contador + 1) + "º pessoa: ");
			alturas[contador] = scan.nextDouble();
			System.out.print("Genero da " + (contador + 1) + "º pessoa (M/F): ");
			generos[contador] = scan.next().charAt(0);

			if (generos[contador] == 'F') {

				somaAlturaMulheres += alturas[contador];
				qtdMulheres++;
			}

			if (generos[contador] == 'M') {

				qtdHomens++;
			}

		}

		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];


		for (int contador = 0; contador < alturas.length; contador++) {

			if (alturas[contador] > maiorAltura) {
				maiorAltura = alturas[contador];

			} 
			else if(alturas[contador] < menorAltura) {
				menorAltura = alturas[contador];
			}
		}

		System.out.println("Menor Altura = " + menorAltura);
		System.out.println("Maior Altura = " + maiorAltura);
		System.out.printf("Menor das alturas das mulheres = %.2f%n ", somaAlturaMulheres / qtdMulheres);
		System.out.println("Numero de homens = " + qtdHomens);

		scan.close();

	}

}
