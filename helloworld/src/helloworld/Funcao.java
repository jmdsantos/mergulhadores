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
		      return "SUBRITRA��O";
		    }
	},
	
	M{
		 @Override
		    public String toString() {
		      return "MULTIPLICA��O";
		    }
	},
	
	D{
		 @Override
		    public String toString() {
		      return "DIVIS�O";
		    }
	}
	
}
