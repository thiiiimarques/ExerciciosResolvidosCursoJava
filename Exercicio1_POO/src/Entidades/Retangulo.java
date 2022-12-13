package Entidades;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	
	
	public double calcularArea() {
		double area = altura * largura;
		
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (largura + altura);
		
		return perimetro;
	}
	
	
	public double calcularDiagonal() {
		double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		
		return diagonal;
	}
	
}
