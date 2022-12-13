import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		
		/*Exercicio 1
		Faca um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		
		Scanner scan = new Scanner(System.in);
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int total = numero1 + numero2;
		
		System.out.println("Soma = " + total);
		
		
		scan.close();
	}

}
