package projetoBancoComposto;

public class testaBanco {

	public static void main(String[] args) {
    
		Cliente thales = new Cliente();
		thales.nome = "Thales Batista";
		thales.cpf = "036.260.732-03";
		thales.profissao = "Desenvolvedor Web";
		
		Conta contaDoThales = new Conta();
		contaDoThales.deposita(100);
		
		contaDoThales.titular = thales;
		
		System.out.println(contaDoThales.titular.nome);
	}

}
