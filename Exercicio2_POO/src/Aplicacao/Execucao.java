package Aplicacao;

/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
*/

import java.util.Scanner;

import Entidades.Funcionario;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Digite o nome do funcionario: ");
		func.nome = scan.nextLine();
		System.out.print("Digite o salario bruto do funcionario: ");
		func.salarioBruto = scan.nextDouble();
		System.out.print("Digite o Imposto do salario do funcionario: ");
		func.imposto = scan.nextDouble();
		
		func.calcularSalarioLiquido();
		
		System.out.println();
		System.out.println("Funcionario: " + func);
		
		System.out.println();
		System.out.println("Qual a porcetagem para aumentar o salario? ");
		double aumentoSalario = scan.nextDouble();
		func.aumentarSalario(aumentoSalario);
		
		System.out.println("Atualização funcionario: " + func);
		
		
		scan.close();

	}

}
