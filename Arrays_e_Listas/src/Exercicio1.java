import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Quantos numeros você vai digitar ? ");
		int qtdNumeros = scan.nextInt();
		
		int[] numeros = new int[qtdNumeros];
		
		for (int contador =  0; contador < numeros.length; contador++) {
			
			System.out.println("Digite um numero? ");
			numeros[contador] = scan.nextInt();
			
		}
		
		System.out.println("Os numeros negativos digitados foram: ");
		
		for (int i = 0 ; i < numeros.length; i++) {		
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		

		
		scan.close();
				
	}
}
