package Util;

public class ConversorMoeda {

	public static double IOF = 0.06;
	
	public static double calcularConversao(double valorDolar, double qtdCompra) {
		double conversao = valorDolar * qtdCompra + ((valorDolar * qtdCompra) * IOF);
		
		return conversao;
	}
}
