package Aplicacao;

import java.util.Scanner;

import Entidades.ContaBancaria;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ContaBancaria conta;
		
		
		System.out.print("Digite o numero da conta: ");
		int numeroConta = scan.nextInt();
		System.out.print("Digite o titular da Conta: ");
		scan.nextLine();
		String nomeTitular = scan.nextLine();
		System.out.println("Voce quer efetuar o primeiro deposito no cadastro? (s/n): ");
		char confirmacaoDeposito = scan.next().charAt(0);
		if (confirmacaoDeposito == 's') {
			System.out.println("Qual o valor do deposito? ");
			double primeiroDeposito = scan.nextDouble();
			conta = new ContaBancaria(nomeTitular, numeroConta, primeiroDeposito);
		}
		else {
			conta = new ContaBancaria(nomeTitular, numeroConta);
		}
		
		
		System.out.println(conta.mensagemPadrao());
		System.out.println();
		
		System.out.println("Deposite algum valor: ");
		double valordeposito = scan.nextDouble();
		conta.depositarConta(valordeposito);
		System.out.println("Atualizando os dados: ");
		System.out.println(conta.mensagemPadrao());
		
		
		System.out.println("Saque algum valor: ");
		double valorSaque = scan.nextDouble();
		conta.sacarConta(valorSaque);
		System.out.println("Atualizando os dados: ");
		System.out.println(conta.mensagemPadrao());
		
		scan.close();
	}
	
}
