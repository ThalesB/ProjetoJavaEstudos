package cursoJava;

import java.util.Scanner;

public class exercicoEstruturaIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		double C = A % B;
		
		if (A%B == 0 || B%A == 0 ) {
			
			System.out.printf("o número %d é múltiplo de %d e o resto da divisão é %d ",A,B,C);
			
		} else {
			
			System.out.printf("O número %d não é múltiplo de %d10 o resto da divisão é %.2f%n",A,B,C);
		}
		
		sc.close();

	}
        
}
