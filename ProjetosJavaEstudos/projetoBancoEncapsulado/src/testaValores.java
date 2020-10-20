
public class testaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(2345, 476590);
		
		//a conta está inconsistente 
		conta.setAgencia(-34569);
	    conta.setNumero(-43948958);
		
	    System.out.println(conta.getAgencia());
	}

}
