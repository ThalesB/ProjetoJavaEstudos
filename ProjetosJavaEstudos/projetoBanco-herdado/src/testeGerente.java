
public class testeGerente {

	public static void main(String[] args) {
	 Gerente g1 = new Gerente();
	 g1.setNome("Thales");
	 g1.setCpf("2334234234");
	 g1.setSalario(5000.0);
	 
	 g1.setSenha(222233);
	
	 System.out.println(g1.getNome());
	 System.out.println(g1.getCpf());
	 System.out.println(g1.getSalario());
	 
	 boolean autenticou = g1.autentica(222233);
	 
	 System.out.println(autenticou);
    
	  System.out.println(g1.getBonificacao());
	}

}
