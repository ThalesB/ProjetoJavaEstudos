
public class Gerente extends FuncionarioAutenticavel {
     	
	
     public double getBonificacao() {
    	 System.out.println("bonificacao gerente");
    	 return super.getSalario();
     }

}
