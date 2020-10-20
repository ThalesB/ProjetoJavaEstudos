package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class operadoresDeAtribuicaoAcumulativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
        
		int minutos = sc.nextInt();
        
		double conta = 50.0;
		
		if(minutos> 100) {
			
			conta += (minutos - 100) * 2.0;
			
		}
		
		System.out.printf("Você usou %d minutos e sua conta está em R$ %.2f%n",minutos,conta);
		
		
		sc.close();
	}

}
