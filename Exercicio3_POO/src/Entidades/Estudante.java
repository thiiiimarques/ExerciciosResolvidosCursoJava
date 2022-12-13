package Entidades;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNotas;
	
	
	public double somarNotas() {
		somaNotas = nota1 + nota2 + nota3;
		
		return somaNotas;
	}
	
	public void AprovarNotas() {
		
		if(somaNotas >= 60) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
			double notaAprovacao = 60 - somaNotas;
			System.out.println("Faltando: " + notaAprovacao + " pontos para a aprovação!");
		}
	}
}
