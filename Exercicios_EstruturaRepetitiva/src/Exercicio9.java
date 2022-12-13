// Ler um número inteiro N e calcular todos os seus divisores. 

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro para mostrar todos os divisores: ");
		int numero = scan.nextInt();
		
		for(int contador = 1; contador <= numero; contador++) {
			
			if(numero % contador == 0) {
				System.out.println(contador);
			}
		}

		scan.close();
	}
}