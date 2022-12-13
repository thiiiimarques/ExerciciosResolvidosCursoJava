package Aplicacao;

import java.util.Scanner;

import Entidades.Estudante;

public class Execucao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Estudante aluno = new Estudante();
		
		
		System.out.print("Digite o Nome do aluno: ");
		aluno.nome = scan.nextLine();
		System.out.print("Digite a nota do priemiro trimestre: ");
		aluno.nota1 = scan.nextDouble();
		System.out.print("Digite a nota do segundo trimestre: ");
		aluno.nota2 = scan.nextDouble();
		System.out.print("Digite a nota do terceiro trimestre: ");
		aluno.nota3 = scan.nextDouble();
		
		System.out.println("Nota Final: " + aluno.somarNotas());
		
		System.out.println();
		
		aluno.AprovarNotas();
		
		scan.close();
	}
}
