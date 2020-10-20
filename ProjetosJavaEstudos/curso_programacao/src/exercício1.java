
import java.util.Locale;

public class exercício1 {

	public static void main(String[] args) {
     String product1 = "Computer";
     String product2 = "Office desk";
     
     int age = 30;
     int code = 5290;
     char gender = 'F';
     
     double price1 = 2100.0;
     double price2 = 650.50;
     double measure = 53.234567;
     
     System.out.printf("Products:%nComputer, with price is $ %.2f%nOffice desk, which price is $ %.2f%n%n", price1, price2);
     System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);
     Locale.setDefault(Locale.US);;
     System.out.printf("Measue with eight decimal places: %f%nRouded (three decimal places): %.3f%nUS decimal point: %.3f%n", measure, measure, measure);
	}

}
