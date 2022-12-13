package Entidades;

public class ContaBancaria {
	
	private String nomeTitular;
	private int numeroConta;
	private double saldo;
	
	private final int taxaSaque = 5;
	
	
	public ContaBancaria(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}

	public ContaBancaria(String nomeTitular, int numeroConta, double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		depositarConta(depositoInicial);
		
	}
	
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	public void sacarConta(double valorSaque) {
		saldo = (saldo - valorSaque) - taxaSaque;
	}
	
	public void depositarConta(double valorDeposito) {
		saldo = saldo + valorDeposito;
		
	}
	
	
	public String mensagemPadrao() {
		return "Conta: " + numeroConta 
				+ " | Titular: " + nomeTitular
				+ " | Saldo: " + saldo;
	}

}
