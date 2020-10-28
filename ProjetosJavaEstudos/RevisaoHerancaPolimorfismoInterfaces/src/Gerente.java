
public class Gerente extends Funcionario implements ConectarAutenticacao {
    private GeraSenha Gerador; 
	
	public Gerente() {
		this.Gerador = new GeraSenha ();
	}
	
	@Override
	public double getBonificacao() {
	 double bonificacaoGerente = super.getSalario() + super.getSalario() * 0.1;
	 return bonificacaoGerente;
	}

	
	@Override
	public void SetSenha(int senha) {
	      this.Gerador.setSenha(senha);
	}

	@Override
	public boolean Autenticacao(int senha) {
          return this.Gerador.Autentica(senha) ;
	}

}
