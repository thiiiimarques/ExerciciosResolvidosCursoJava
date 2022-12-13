/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido, codificado da seguinte forma: 

1.Álcool 
2.Gasolina 
3.Diesel
4.Fim. 

Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */


import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int clientesAlcool = 0;
		int clientesGasolina = 0;
		int clientesDiesel = 0;
		
		System.out.println("Digite o codigo:");
		int codigo = scan.nextInt();

		while (codigo != 4) {

			if (codigo <= 0 || codigo > 4) {
				System.out.println("Codigo Invalido!");
			} else if (codigo == 1) {
				clientesAlcool++;
			} else if (codigo == 2) {
				clientesGasolina++;
			} else if (codigo == 3) {
				clientesDiesel++;
			}
			
			System.out.println("Digite o codigo:");
			codigo = scan.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + clientesAlcool);
		System.out.println("Gasolina: " + clientesGasolina);
		System.out.println("Diesel: " + clientesDiesel);

		scan.close();
	}
}
