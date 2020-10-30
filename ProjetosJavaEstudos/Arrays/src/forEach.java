
public class forEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		System.out.println("maneira 1");
        for(int i = 0; i<vect.length; i++) {
        	System.out.println(vect[i]);
        }
        
        System.out.println("maneira 2 com ForEach");
        for(String obj: vect) {
        	System.out.println(obj);
        }
        
        
		
	}

}
