
public class SistemaInterno {

	private int senhaSistema = 123456;

	public void AutenticaSistema(ConectarAutenticacao qualquer) {
		boolean AcessoSistema = qualquer.Autenticacao(this.senhaSistema);
		if (AcessoSistema) {
			System.out.println("Acesso Liberado");
		} else {
			System.out.println("Acesso negado");
		}
	}

	public int SetSenhaSistema(int senha) {
		return this.senhaSistema = senha;
	}

}
