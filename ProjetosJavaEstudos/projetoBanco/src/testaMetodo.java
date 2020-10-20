
public class testaMetodo {
	public static void main(String[] args) {
		Conta contaDoThales = new Conta();
		contaDoThales.deposita(50.0);
		System.out.println(contaDoThales.saldo);
		contaDoThales.saca(30);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		contaMarcela.transfere(300, contaDoThales);
		System.out.println(contaDoThales.saldo);
	}
}
