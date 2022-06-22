package helloworld;

public class Calcula extends Operacao{
	
	public Calcula(String operacao, float valor1, float valor2) {
		super(operacao, valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	public void Operacao() {
		
		switch (this.getOperacao()) {
		case "S":
			this.setResultado(Soma(this.getValor1(), this.getValor2()));
			break;
		case "U":
			this.setResultado(Subt(this.getValor1(), this.getValor2()));
			break;
		case "M":
			this.setResultado(Mult(this.getValor1(), this.getValor2()));
			break;
		case "D":
			this.setResultado(Divi(this.getValor1(), this.getValor2()));
			break;
		default:
			break;
		}
		
	}
	

	public float Soma(double vl1, double vl2) {
		return (float) (vl1 + vl2);
	}
	
	public float Subt(double vl1, double vl2) {
		return (float) (vl1 - vl2);
	}
	
	public float Mult(double vl1, double vl2) {
		return (float) (vl1 * vl2);
	}
	
	public float Divi(double vl1, double vl2) {
		double res = 0;
		try {
			res = vl1 / vl2;
		} catch (Exception e) {
			System.out.println("Divisão por zero");
		}
		
		return (float) res;
	}
	
	
	
	@Override
	public String toString() {
		/*String operacao = (ope == "S"?"Soma":(ope == "U"?"Subtração":(ope == "M"?"Multiplicação":
			(ope == "D"?"Divisão":""))));*/
		return "Calcula " + Funcao.valueOf(this.getOperacao()) + " [resultado=" + this.getResultado() + "]";
	}
		
	
}
