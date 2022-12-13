import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int linhas = scan.nextInt();
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int colunas = scan.nextInt();
		
		int[][] numeros = new int[linhas][colunas];
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = scan.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite um numero que está dentro da matriz: ");
		int numero = scan.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				if(numeros[i][j] == numero) {
					
					System.out.println("Posição do numero: " + i + " , " + j);
					
					if(j > 0 ) {
						System.out.println("Numero a esquerda: " + numeros[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Numero em cima: " + numeros[i-1][j]); 
					}
					if (j < numeros[i].length-1) {
						System.out.println("Numero a direita: " + numeros[i][j+1]);
					}
					if (i < numeros.length-1) {
						System.out.println("Numero em baixo: " + numeros[i+1][j]);
					}
					
					System.out.println("------------------");
				}
				
			}
		}
		
		scan.close();

	}

}
