package Entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double calcularSalarioLiquido() {
		double salarioLiquido = salarioBruto - imposto;
		
		return salarioLiquido;
	}
	
	public void aumentarSalario(double porcetagem) {
		salarioBruto = salarioBruto + (salarioBruto * (porcetagem/100));
	}
	
	public String toString() {
		
		return nome + ", $ " + String.format("%.2f", calcularSalarioLiquido());
	}
	
}
