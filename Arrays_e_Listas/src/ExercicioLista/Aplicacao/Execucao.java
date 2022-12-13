/* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. 
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
*/

package ExercicioLista.Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ExercicioLista.Entidades.Funcionario;

public class Execucao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Funcionario> listaFuncionarios = new ArrayList<>();

		System.out.print("Quantos funcionarios vão ser digitados? ");
		int qtdFuncionarios = scan.nextInt();

		for (int contador = 1; contador <= qtdFuncionarios; contador++) {
			System.out.println();
			System.out.println("Funcionario " + contador);
			System.out.print("Id: ");
			int idFuncionario = scan.nextInt();
			System.out.print("Nome: ");
			scan.nextLine();
			String nomeFuncionario = scan.nextLine();
			System.out.print("Salario: ");
			double salarioFuncionario = scan.nextDouble();

			Funcionario funcionarios = new Funcionario(nomeFuncionario, idFuncionario, salarioFuncionario);

			listaFuncionarios.add(funcionarios);
		}

		System.out.println();
		System.out.println("Qual o Id do Funcionario que terá um incremento de Salario? ");
		int idFuncionario = scan.nextInt();
		Integer posicaoId = posicaoId(listaFuncionarios, idFuncionario);
		if (posicaoId == null) {
			System.out.println("Esse Id não existe!");
		} else {
			System.out.println("Qual a porcentagem do incremento? ");
			double incrementoPorcentagem = scan.nextDouble();

			listaFuncionarios.get(posicaoId).incrementarSalario(incrementoPorcentagem);
		}
		
		System.out.println();
		
		System.out.println("Lista de Funcionarios: ");
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}

		scan.close();
	}

	public static Integer posicaoId(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
