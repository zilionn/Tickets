package model;

public class Ingresso {
	
	private String id;
	private float valor;

	public Ingresso() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float valorFinal(double taxa) {
		valor *= 1 + (taxa / 100);
		return valor;
	}

}
