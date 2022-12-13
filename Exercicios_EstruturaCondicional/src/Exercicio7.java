/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

			 Y
 			*
 		Q2	*	Q1
 			*
 	***************** X
 			*
 		Q3	*	Q4
 			*

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação. 

*/


import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float eixoX = scan.nextFloat();
		float eixoY = scan.nextFloat();

		if (eixoX < 0 && eixoY < 0) {
			System.out.println("Q3");
		} else if (eixoX < 0 && eixoY > 0) {
			System.out.println("Q2");
		} else if (eixoX > 0 && eixoY < 0) {
			System.out.println("Q4");
		} else if (eixoX > 0 && eixoY > 0) {
			System.out.println("Q1");
		} else if (eixoX == 0 && eixoY == 0) {
			System.out.println("Origem");
		} else if (eixoX == 0) {
			System.out.println("Eixo Y");
		} else if (eixoY == 0) {
			System.out.println("Eixo X");
		}
		
		scan.close();

	}
}
