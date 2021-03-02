package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		
		//vazio
		//System.out.println();
		
		//inteiro	
		//System.out.println(3);
		
		//booleano
		//System.out.println(false);
		
		
		ContaCorrente cc = new ContaCorrente(22,33);
		
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		
		//o System.out aceita o tipo cc
		System.out.println(cc);
		
		// O system.out aceita o tipo cp
		System.out.println(cp);
		
		
		
		

	}

}
