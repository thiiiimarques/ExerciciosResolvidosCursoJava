/* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes 
que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, 
informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). 
Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, 
por ordem de quarto.
*/



package Exercicio12_POO.Aplicacao;
import java.util.Scanner;

import Exercicio12_POO.Entidades.Aluguel;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluguel[] vetorAluguel = new Aluguel[10];
		
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int qtdQuartosAlugados = scan.nextInt();
		
		for(int contador = 0; contador < qtdQuartosAlugados; contador++) {
			System.out.println();
			System.out.println("Aluguel " + (contador+1));
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Numero do Quarto: ");
			int numeroQuarto = scan.nextInt();
			
			vetorAluguel[numeroQuarto] = new Aluguel(nome, email, numeroQuarto);
		}
		
		
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for(int contador = 0; contador < vetorAluguel.length; contador++) {
			
			if(vetorAluguel[contador] != null) {
				System.out.println(vetorAluguel[contador]);
			}
		}
		

		
		scan.close();
	}
}
