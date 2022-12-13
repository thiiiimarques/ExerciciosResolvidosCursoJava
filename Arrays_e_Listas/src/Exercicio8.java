import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		 System.out.print("Quantos valores vai ter o vetor: ");
			int qtdNumeros = scan.nextInt();
			
			int[] numeros = new int[qtdNumeros];
			
			int soma = 0, qtdNumerosPares = 0;
			
			for(int contador = 0; contador < numeros.length; contador++) {
				System.out.print("Digite um numero: ");
				numeros[contador] = scan.nextInt();
				
				if(numeros[contador] % 2 == 0) {
					soma += numeros[contador];
					qtdNumerosPares++;
				}
				
			}
			
			if(qtdNumerosPares != 0) {
				System.out.println("Media do numeros pares " + soma / qtdNumerosPares);
			}
			else {
				System.out.println("Nenhum numero par");
			}
			
			
		
		scan.close();
	}
}
