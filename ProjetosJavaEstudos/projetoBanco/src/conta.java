class Conta {
	double saldo = 0;
	int agencia = 42;
	int numero = 0;
	String titular = "Sem nome";

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.printf("Saque realiazido no valor de %.2f e o saldo da conta � %.2f%n ", valor, saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.printf("Transfer�ncia no valor de R$ %.2f realizada seu saldo � de %.2f%n ", valor, saldo);
			return true;

		} else {
			System.out.println("Saldo Insuficiente.");
			return false;

		}
	}

}
