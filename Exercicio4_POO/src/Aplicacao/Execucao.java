package Aplicacao;

import java.util.Scanner;

import Util.ConversorMoeda;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a cotaçao do Dolar hoje? ");
		double valorDolar = scan.nextDouble();
		System.out.print("Quantos dolares você quer comprar? ");
		double qtdCompra = scan.nextDouble();
		
		double conversao = ConversorMoeda.calcularConversao(valorDolar, qtdCompra);
		
		System.out.printf("O total a pagar em reais é: => %.2f%n " , conversao);
		
		scan.close();

	}

}
