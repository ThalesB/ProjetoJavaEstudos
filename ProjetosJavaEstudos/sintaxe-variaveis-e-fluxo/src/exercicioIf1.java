
public class exercicioIf1 {
	public static void main(String[] args) {
		double salario = 4300.0;
		double IR = 0.0;
		if (salario >= 1900.0 && salario <= 2800) {
			IR = salario * 0.075;
			System.out.printf("Seu salario terá o IR de 7.5 por cento e o valor de redução será %.2f%n", IR);
		}

		if (salario >= 2800.01 && salario <= 3751.0) {
			IR = salario * 0.15;
			System.out.printf("Seu salario terá o IR de 15 por cento e o valor de redução será %.2f%n", IR);
		}
		if (salario >= 3751.01 && salario <= 4664.00) {
			IR = salario * 0.225;
			System.out.printf("Seu salario terá o IR de 22 por cento e o valor de redução será %.2f%n", IR);
		}
		System.out.println("Fim do cálculo");
	}

}


