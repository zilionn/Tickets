package model;

public class IngressoVIP extends Ingresso {
	
	private String funcao;
	
	public IngressoVIP() {
		super();
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public float valorFinal(double taxa) {
		float valor = super.valorFinal(taxa);
		valor *= 1.18;
		
		return valor;	
	}

}
