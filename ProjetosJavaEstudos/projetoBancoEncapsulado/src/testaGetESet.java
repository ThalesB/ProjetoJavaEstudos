
public class testaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(226, 43568);
		Conta conta2 = new Conta(226, 43569);
		Conta conta3 = new Conta(226, 43570);
		
		conta.setNumero(1337);
        
		System.out.println(conta.getNumero());
	
		Cliente thales = new Cliente ();
		
		thales.setNome("Thales Batista");
		
		conta.setTitular(thales);
		
        System.out.println(conta.getTitular());
        
        conta.getTitular().setProfissao("Desenvolvedor Web");
        
        System.out.println(thales.getProfissao());
        
        System.out.println(Conta.getTotal());
		
	}

}
