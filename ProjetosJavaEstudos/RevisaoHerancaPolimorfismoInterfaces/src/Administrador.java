
public class Administrador extends Funcionario implements ConectarAutenticacao{
     private GeraSenha Gerador;
     
     public Administrador() {
    	 this.Gerador = new GeraSenha();
     }
	
	@Override
	public double getBonificacao() {
		return 100;
	}

	@Override
	public void SetSenha(int senha) {
		this.Gerador.setSenha(senha);
		
	}

	@Override
	public boolean Autenticacao(int senha) {
		
		 return this.Gerador.Autentica(senha);
	}

}
