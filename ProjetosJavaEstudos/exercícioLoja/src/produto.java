class CadastroProduto {
	private String tipoRoupa;
	private double preco;
	private String tamanho;

	public CadastroProduto(String tipoRoupa, double preco, String tamanho) {
		if(tipoRoupa == "Saia"|| tipoRoupa =="Bermuda"|| tipoRoupa =="Camisa" || tipoRoupa =="Calça") {
			this.tipoRoupa = tipoRoupa;
		} else {
		  System.out.println("Tipo de roupa inválido, preencha corretamente: Saia, Bermuda, Camisa ou Calça");
		}
	 if(preco != 0){
		 this.preco = preco;
	 }
	 if(tamanho == "P"|| tamanho=="M"|| tamanho =="G") {
		 
	 }
	 
	}
	
}
