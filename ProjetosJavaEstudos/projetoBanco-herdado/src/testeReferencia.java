
public class testeReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Thales Batista");
	    g1.setSalario(5000.0);
	    
	    
	    
	    editorDeVideo ev = new editorDeVideo();
	    ev.setSalario(2500.0);
	    controleBonificacao controle = new controleBonificacao();
	    
	    controle.registra(g1);
	    
	    controle.registra(ev);
	    
	    System.out.println(controle.getSoma());

}

}