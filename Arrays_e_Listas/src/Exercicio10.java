import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos alunos você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		String[] nomes = new String[qtdNumeros];
		double[] notas1 = new double[qtdNumeros];
		double[] notas2 = new double[qtdNumeros];
		double[] mediaNotas = new double[qtdNumeros];

		for (int contador = 0; contador < nomes.length; contador++) {

			System.out.println("Digite nome, primeira e segunda nota do " + (contador + 1) + "º aluno!");
			nomes[contador] = scan.next();
			notas1[contador] = scan.nextDouble();
			notas2[contador] = scan.nextDouble();

			mediaNotas[contador] = (notas1[contador] + notas2[contador]) / 2;

		}

		System.out.println("Alunos Aprovados: ");

		for (int contador = 0; contador < mediaNotas.length; contador++) {

			if (mediaNotas[contador] >= 6) {
				System.out.println(nomes[contador]);
			}

		}

		scan.close();

	}

}
