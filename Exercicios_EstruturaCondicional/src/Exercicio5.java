/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. 

Codigo			Produto				Preço
1				Cachorro Quente		4.00
2				X-Salada			4.50
3				X-Bacon				5.00
4				Torrada Simples		2.00
5				Refrigerante		1.50

*/

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int codigo = scan.nextInt();
		int quantidade = scan.nextInt();
		
		double total = 0.0;
		
	// Outra possibilidade de codificação
		
		/*	if(codigo == 1) {
			total = quantidade * 4;
		} else if(codigo == 2) {
			total = quantidade * 4.50;
		} else if(codigo == 3) {
			total = quantidade * 5;
		} else if (codigo == 4) {
			total = quantidade * 2;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		} */
		
		switch (codigo) {
		case 1:
			total = quantidade * 4;
			break;
		case 2:
			total = quantidade * 4.50;
			break;
		case 3:
			total = quantidade * 5;
			break;
		case 4:
			total = quantidade * 2;
			break;
		case 5:
			total = quantidade * 1.50;
			break;

		default:
			System.out.println("Codigo Inválido");
			break;
		}
		
		
		
		
		System.out.println("Total: " + total);
		
		
		
		scan.close();
	}
}
