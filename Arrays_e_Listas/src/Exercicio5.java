import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Quantos numeros você vai digitar ? ");
		int qtdNumeros = scan.nextInt();

		double[] numeros = new double[qtdNumeros];
		double numeroMaior = 0, posicaoNumeroMaior = 0;
		
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.print("Digite um numero: ");
			numeros[contador] = scan.nextDouble();
		}
		
		numeroMaior = numeros[0];
		
		for(int contador = 0; contador < numeros.length; contador++) {
			if(numeros[contador] > numeroMaior) {
				numeroMaior = numeros[contador];
				posicaoNumeroMaior = contador;
			}
		}
		
		
		System.out.println("Maior Valor = " + numeroMaior);
		System.out.println("Posicao do maior valor = " + posicaoNumeroMaior);
		
		scan.close();
	}
}
