import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor: ");
		int qtdNumeros = scan.nextInt();
		
		int[] vetor1 = new int[qtdNumeros];
		int[] vetor2 = new int[qtdNumeros];
		int[] somaVetores = new int[qtdNumeros];
		
		System.out.println("Digite os valores do vetor 1: ");
		for(int contador = 0; contador < vetor1.length; contador++) {
			vetor1[contador] = scan.nextInt();
		}
		
		System.out.println("Digite os valores do vetor 2: ");
		for(int contador = 0; contador < vetor2.length; contador++) {
			vetor2[contador] = scan.nextInt();
		}
		
		
		for(int contador = 0; contador < somaVetores.length; contador++) {
			somaVetores[contador] = vetor1[contador] + vetor2[contador];
		}
		
		System.out.println("Soma dos dois vetores: ");
		
		for(int contador = 0; contador < somaVetores.length; contador++) {
			System.out.println(somaVetores[contador]);
		}
		
		scan.close();
	}
}
