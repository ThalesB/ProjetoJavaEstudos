
class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {

		Conta.total++;
		System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta agencia: " + "" + this.agencia + " conta: " + this.numero);

	}

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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0 && numero != 0) {
			this.numero = numero;
		} else {
			System.out.println("N�o pode numero negativo");
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0 && agencia != 0) {
			this.agencia = agencia;
		} else {
			System.out.println("N�o pode numero negativo");
		}

	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
	public static int getTotal() {
		return Conta.total;
	}
}
