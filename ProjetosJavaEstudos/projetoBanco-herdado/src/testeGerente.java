
public class testeGerente {

	public static void main(String[] args) {
	 
	 Gerente g2 = new Gerente();
	 
	 g2.setSenha(2222);
	 
    SistemaInterno sis = new SistemaInterno();
    
      sis.autentica(g2);
    
	// Gerente g1 = new Gerente();
	// g1.setNome("Thales");
	 //g1.setCpf("2334234234");
	 //g1.setSalario(5000.0);
	 
	 
	
	// System.out.println(g1.getNome());
	// System.out.println(g1.getCpf());
	 //System.out.println(g1.getSalario());
	 
	 
	 
	
    
	 // System.out.println(g1.getBonificacao());
	}

}
