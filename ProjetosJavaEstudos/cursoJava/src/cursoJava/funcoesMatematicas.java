package cursoJava;

public class funcoesMatematicas {

	public static void main(String[] args) {
		 double x = 20.0;
		 double y = 4.0;
		 double z = -5 ;
         double A, B, C;
		A = Math.sqrt(x);
		B = Math.pow(y,2);
		C = Math.abs(z);
		
		System.out.printf("Raiz quadrada de: ." + x + " � igual a = %.2f%n", A);
		System.out.printf("A pot�ncia de: "+y+" elevado a 2 � igual a = %.2f%n", B);
		System.out.printf("O valor absoluto de: "+z+" � igual a = %.2f%n", C);
		
	}

}
