/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 

			 Y
 			*
 		Q2	*	Q1
 			*
 	***************** X
 			*
 		Q3	*	Q4
 			*

O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int coordenadaX = scan.nextInt();
		int coordenadaY = scan.nextInt();

		while (coordenadaX != 0 && coordenadaY != 0) {
			if (coordenadaX < 0 && coordenadaY < 0) {
				System.out.println("Terceiro");
			} else if (coordenadaX < 0 && coordenadaY > 0) {
				System.out.println("Segundo");
			} else if (coordenadaX > 0 && coordenadaY < 0) {
				System.out.println("Quarto");
			} else if (coordenadaX > 0 && coordenadaY > 0) {
				System.out.println("Primeiro");
			}
			coordenadaX = scan.nextInt();
			coordenadaY = scan.nextInt();

		}

		scan.close();
	}

}
