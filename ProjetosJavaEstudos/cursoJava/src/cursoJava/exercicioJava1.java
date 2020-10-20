package cursoJava;

import java.util.Scanner;

public class exercicioJava1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int z;
	     
		System.out.println("Digite o primeiro numero: ");
		
		x = sc.nextInt();
		    
		sc.nextLine();
	    
	    System.out.println("Digite o segundo numero: ");
		
	    y = sc.nextInt();
	   
	    z = x + y;
		
	    System.out.println("A soma dos numeros é: "+x+" + "+y+" = "+ z);
	    
		
		sc.close();
		
	    
	    
	}

}
