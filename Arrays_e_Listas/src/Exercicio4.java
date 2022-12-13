import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdNumerosPares = 0;
		
		System.out.print("Quantos numeros você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		int[] numeros = new int[qtdNumeros];
		
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.print("Digite um numero: ");
			numeros[contador] = scan.nextInt();

		}
		
		System.out.println("Numeros Pares: ");
		for(int contador = 0; contador < numeros.length; contador++) {
			
			if(numeros[contador] % 2 == 0) {
				System.out.print(numeros[contador] + " ");
				qtdNumerosPares++;	
			}
		}
		
		System.out.println();
		System.out.print("Quantidade de numeros pares = " + qtdNumerosPares);
		
		scan.close();
	}
}
