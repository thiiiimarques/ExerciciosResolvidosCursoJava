import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double somaAlturas = 0;
		int pessoasMenores = 0;

		System.out.print("Quantos numeros você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		String[] nomes = new String[qtdNumeros];
		double[] alturas = new double[qtdNumeros];
		int[] idades = new int[qtdNumeros];

		for (int contador = 0; contador < nomes.length; contador++) {
			
			System.out.println("Dados da " + (contador + 1) + "º pessoa!");

			System.out.print("Nome: ");
			nomes[contador] = scan.next();
			System.out.print("Idade: ");
			idades[contador] = scan.nextInt();
			System.out.print("Altura: ");
			alturas[contador] = scan.nextDouble();

			if (idades[contador] < 16) {
				pessoasMenores++;
			}

			somaAlturas += alturas[contador];

		}

		System.out.printf("Altura Média: %.2f%n ", somaAlturas / qtdNumeros);
		System.out.println("Pessoas com menos de 16 anos: " + (pessoasMenores * 100) / qtdNumeros + "%");
		for (int contador = 0; contador < nomes.length; contador++) {
			if (idades[contador] < 16) {
				System.out.println(nomes[contador]);
			}

		}

		scan.close();

	}

}
