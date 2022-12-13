import java.util.Scanner;

public class Exercicio4 {
	
	/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
	
	
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 int numeroFuncionario = scan.nextInt();
		 float qtdHorasTrabalhadas = scan.nextFloat();
		 float valorHoraTrabalhada = scan.nextFloat();
		 
		 double totalSalario = qtdHorasTrabalhadas * valorHoraTrabalhada;
		 
		 System.out.println("Numero Funcionario = " + numeroFuncionario);
		 System.out.printf("Valor do Salario = U$ %.2f ", totalSalario);
		 
		 
		 scan.close();
		 
	}
}
