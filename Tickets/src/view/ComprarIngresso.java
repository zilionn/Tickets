package view;

import model.Ingresso;
import model.IngressoVIP;

public class ComprarIngresso {

	public static void main(String[] args) {
		Ingresso ing = new Ingresso();
		IngressoVIP ingvip = new IngressoVIP();
		
		ing.setId("F355");
		ing.setValor(500);
		System.out.println("Valor sem taxa: " + ing.getValor());
		System.out.println("Valor com a taxa: " + ing.valorFinal(15));
		
		ingvip.setFuncao("Empresário");
		ingvip.setId("A001");
		ingvip.setValor(850);
		System.out.println("Valor sem a taxa: " + ing.getValor());
		System.out.println("Valor com a taxa: " + ing.valorFinal(15));
		

	}

}
