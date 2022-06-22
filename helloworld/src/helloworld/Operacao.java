package helloworld;

public class Operacao {
	private String operacao;
	private float valor1 = (float) 0.00;
	private float valor2 = (float) 0.00;
	private float resultado = (float) 0.00;
	
	public Operacao(String operacao, float valor1, float valor2) {
		super();
		this.operacao = operacao;
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public float getValor1() {
		return valor1;
	}
	public void setValor1(float valor1) {
		this.valor1 = valor1;
	}
	public float getValor2() {
		return valor2;
	}
	public void setValor2(float valor2) {
		this.valor2 = valor2;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
}
