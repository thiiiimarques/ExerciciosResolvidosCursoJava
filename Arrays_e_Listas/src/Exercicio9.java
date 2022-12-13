import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		String[] nomes = new String[qtdNumeros];
		int[] idades = new int[qtdNumeros];
		
		int contadorPessoa = 1;
		for (int contador = 0; contador < nomes.length; contador++) {
			
			System.out.println("Dados da " + contadorPessoa + "º pessoa!");

			System.out.print("Nome: ");
			nomes[contador] = scan.next();
			System.out.print("Idade: ");
			idades[contador] = scan.nextInt();
			
			contadorPessoa++;
		}
		
		int maiorIdade = idades[0];
		String nomeMaiorIdade = "";
		
		for(int contador = 0; contador < idades.length; contador++) {
			
			if(idades[contador] > maiorIdade) {
				nomeMaiorIdade = nomes[contador];
				maiorIdade = idades[contador];
								
			}
		}
		
		System.out.println("A pessoa mais velha é: " + nomeMaiorIdade);
		
		scan.close();
	}
}
