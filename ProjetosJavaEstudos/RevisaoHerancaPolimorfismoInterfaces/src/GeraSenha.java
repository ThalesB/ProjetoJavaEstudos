
public class GeraSenha {
   
	private int senha;
    
    public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean Autentica(int senha) {
    	if(this.senha == senha) {
    	   System.out.println("senha correta");
    	   return true;
    	} else {
    		System.out.println("senha incorreta");
    		return false;
    	}
    }
    
    
	
}
