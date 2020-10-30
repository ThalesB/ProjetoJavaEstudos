import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class exercicioArray1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Aluguel [] vect = new Aluguel[10];
        
        System.out.println("Insira o numero de alugueis: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n ;i++) {
        	System.out.println("Insira seu nome: ");
          
        	String name = sc.nextLine();
            sc.nextLine();
        	System.out.println("Insira o email: ");
            
        	
        	String email = sc.nextLine();
            sc.nextLine();
        	
        	System.out.println("Insira o numero do quarto de 0 a 9");
        	
        	 
        	int room = sc.nextInt();
        	
        	vect[room] = new Aluguel(name, email, room);
        	
         }
        
        System.out.println("Os cadastros são: ");
        for(int i= 0 ; i < 10; i++) { 
        if(vect[i] !=null) {
        	System.out.println(i+ ": "+vect[i].getName());
            System.out.println(": "+vect[i].getEmail());
            System.out.println(": "+vect[i].getRoom());
        	
        }
        
        }
		
        
        
        
        sc.close();
	}

}
