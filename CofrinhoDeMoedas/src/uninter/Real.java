package uninter;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}

	@Override
	public double converte() {
		return this.valor ;
	}

	@Override
	public boolean equals(Object objeto) {
		// Verifica se são da mesma classe
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		//Se os valores são iguais
		Real objetoDeReal = (Real) objeto;
		if(this.valor != objetoDeReal.valor) {
			return false;
		}
		return true;
	}
}
