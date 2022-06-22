package helloworld;

public enum Funcao {
	S{
		 @Override
		    public String toString() {
		      return "SOMA";
		    }
	},
	
	U{
		 @Override
		    public String toString() {
		      return "SUBRITRAÇÃO";
		    }
	},
	
	M{
		 @Override
		    public String toString() {
		      return "MULTIPLICAÇÃO";
		    }
	},
	
	D{
		 @Override
		    public String toString() {
		      return "DIVISÃO";
		    }
	}
	
}
