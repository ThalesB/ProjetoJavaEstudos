package cursoJava;

public class expressaoCondicionalTernaria {

	public static void main(String[] args) {

		 double preco = 34.5;
		 double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05 ;
         double precoComDesconto = preco - desconto;
		 System.out.println(precoComDesconto);
	}

}
