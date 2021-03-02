package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio= "     Alura    ";
		String outroVazio = vazio.trim();
		
	    System.out.println(outroVazio);
	
		//System.out.println(vazio.isEmpty());
		
		String nome = "Alura";  // boa prática, chama-se object literal
		
		System.out.println(nome.contains("Alur"));
		
		
		//String outro = new String("Alura"); // má prática específica para a classe String
		
		//String outro = nome.replace("A", "O");
		
	   //	String outro = nome.toUpperCase();
		
	    //char c = 'A';
	   //char d = 'a';
		
	   // String outro = nome.replace(c,d);
		
	   // char c = nome.charAt(2);
		
	   //	int pos = nome.indexOf("ur");
		
	    // String sub = nome.substring(1);
		
		// System.out.println(sub);
		
		
	//	System.out.println(nome.length());
	//	
	//	for(int i=0; i<nome.length(); i++) {
			
	//		System.out.println(nome.charAt(i));
	//	}
		
		
		
		
		
		
	}

}
