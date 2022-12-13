import java.util.Scanner;

public class Exercicio6 {
	
	/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final float pi = 3.14159f;
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		float areaTriangulo = (a * c) / 2;
		float areaCirculo =  (float) (pi * Math.pow(c, 2));
		float areaTrapezio = ((a+ b) * c) / 2; 
		float areaQuadrado = (float) Math.pow(b, 2);
		float areaRetangulo = a * b;
		
		System.out.println("Area do Triangulo = " + areaTriangulo);
		System.out.println("Area do Circulo = " + areaCirculo);
		System.out.println("Area do Trapezio = " + areaTrapezio);
		System.out.println("Area do Quadrado = " + areaQuadrado);
		System.out.println("Area do Retangulo = " + areaRetangulo);
		
		
		scan.close();
		
	}

}
