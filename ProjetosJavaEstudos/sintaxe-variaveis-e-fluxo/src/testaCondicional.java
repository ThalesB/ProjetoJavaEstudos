
public class testaCondicional {

	public static void main(String[] args) {

		int idade = 20;
		idade = 16;
		int quantidadePessoa = 3;
        
		if (idade >= 18) { 
			
		System.out.println("Voc� tem mais de 18 anos ");
		} else { 
			if(quantidadePessoa >= 2) {
		
			System.out.println("voc� n�o tem 18, mas est� acompanhado, "
					+ "ent�o pode entrar");}
			
		  else { 
			System.out.println("Voc� pode entrar");
		  }
		}
		 
	}
}
