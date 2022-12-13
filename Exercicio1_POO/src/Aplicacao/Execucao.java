package Aplicacao;


/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
*/


import java.util.Scanner;
import Entidades.Retangulo;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite o Valor da altura do retângulo: ");
		retangulo.altura = scan.nextDouble();
		System.out.println("Digite a largura do retângulo: ");
		retangulo.largura = scan.nextDouble();
		
		
		double areaRetangulo = retangulo.calcularArea();
		double perimetroRetangulo = retangulo.calcularPerimetro();
		double diagonalRetangulo = retangulo.calcularDiagonal();
		
		System.out.println("Area = " + areaRetangulo);
		System.out.println("Perimetro = " + perimetroRetangulo);
		System.out.println("Diagonal = " + diagonalRetangulo);
		
		scan.close();

	}

}
