package cursoJava;

import java.util.Scanner;

public class exercicoEstruturaIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		double C = A % B;
		
		if (A%B == 0 || B%A == 0 ) {
			
			System.out.printf("o n�mero %d � m�ltiplo de %d e o resto da divis�o � %d ",A,B,C);
			
		} else {
			
			System.out.printf("O n�mero %d n�o � m�ltiplo de %d10 o resto da divis�o � %.2f%n",A,B,C);
		}
		
		sc.close();

	}
        
}
