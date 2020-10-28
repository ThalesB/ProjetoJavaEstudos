
public class Teste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.SetSenha(123457);	
		
		SistemaInterno SI = new SistemaInterno();
		
		SI.AutenticaSistema(g1);
		
		
		
		
	}

}
