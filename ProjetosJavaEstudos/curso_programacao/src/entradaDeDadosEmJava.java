import java.util.Locale;
import java.util.Scanner;
public class entradaDeDadosEmJava {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//double x;
	//x = sc.nextDouble();
	//int x;
	//x = sc.nextInt();
	//char x;
	//x = sc.next().charAt(0) ; // endere�o do indice 
	String x;
	int y;
	double z;
	x = sc.next();
	y = sc.nextInt();
	z = sc.nextDouble();
	
	System.out.println("Voc� digitou: " );
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	sc.close();

	}

}
