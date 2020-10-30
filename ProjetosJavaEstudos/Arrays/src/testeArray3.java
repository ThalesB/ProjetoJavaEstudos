
public class testeArray3 {
public static void main(String[] args) {
	
	int x = 20;
	Object obj = x;

	System.out.println(obj);
	
	int y = (int) obj; // necessário casting
	
	System.out.println(y);
}
}
