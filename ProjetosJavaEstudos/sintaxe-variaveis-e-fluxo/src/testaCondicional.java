
public class testaCondicional {

	public static void main(String[] args) {

		int idade = 20;
		idade = 16;
		int quantidadePessoa = 3;
        
		if (idade >= 18) { 
			
		System.out.println("Você tem mais de 18 anos ");
		} else { 
			if(quantidadePessoa >= 2) {
		
			System.out.println("você não tem 18, mas está acompanhado, "
					+ "então pode entrar");}
			
		  else { 
			System.out.println("Você pode entrar");
		  }
		}
		 
	}
}
