
public class testeFuncionario {

	public static void main(String[] args) {
		  
		Funcionario thales = new Funcionario();
		
		thales.setNome("Thales Batista");
		thales.setCpf("036.260.732-03");
	    thales.setSalario(4000);
	    thales.getBonificacao();
	    System.out.println(thales.getBonificacao());
		System.out.println(thales.getNome());
		System.out.println(thales.getCpf());
		
		 
		
		  

	}

}
