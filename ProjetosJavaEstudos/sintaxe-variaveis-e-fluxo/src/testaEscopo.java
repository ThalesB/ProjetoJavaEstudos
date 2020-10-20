

public class testaEscopo {

	public static void main(String[] args) {
		
		int idade = 20;
		idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
        if (idade >= 18 && acompanhado) { 
			
		System.out.println("Você tem mais de 18 anos ");
		} else { 
			
			System.out.println("Você pode entrar");
		  
		}
	}

}
