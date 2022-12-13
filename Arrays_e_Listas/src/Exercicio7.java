import java.util.Scanner;

public class Exercicio7 {
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Quantos valores vai ter o vetor: ");
			int qtdNumeros = scan.nextInt();
			
			double[] numeros = new double[qtdNumeros];
			
			double soma = 0;
			
			for(int contador = 0; contador < numeros.length; contador++) {
				System.out.print("Digite um numero: ");
				numeros[contador] = scan.nextDouble();
				soma += numeros[contador];
			}
			
			double media = soma / qtdNumeros;
			System.out.printf("Media do vetor: %.3f%n ", media);
			
			System.out.println("Elementos abaixo da media: ");
			for(int contador = 0; contador < numeros.length; contador++) {
				if(numeros[contador] < media) {
					System.out.println(numeros[contador]);
				}
				
			}
		 
		 scan.close();
	}
}
