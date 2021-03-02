

public class contaTeste {
 
	public static void main(String[] args) {
	  
	  ContaCorrente cc = new ContaCorrente(4433, 1234567);
	  cc.deposita(100);
	  
	  ContaPoupanca cp = new ContaPoupanca(4432, 1231234);
	  cp.deposita(200);
	  try {
	  cc.transfere(10.0, cp);
	  } catch(Exception ex) {
		  System.out.println(ex.getMessage());
	  }
	  System.out.println("CC: "+ cc.getSaldo());
	  
	  System.out.println("CP: "+ cp.getSaldo());

	}

}
