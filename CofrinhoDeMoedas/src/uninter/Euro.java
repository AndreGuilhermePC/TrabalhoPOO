package uninter;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converte() {
		return this.valor * 5.55;
	}

	@Override
	public boolean equals(Object objeto) {
		// Verifica se são da mesma classe
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		//Se os valores são iguais
		Euro objetoDeEuro = (Euro) objeto;
		if(this.valor != objetoDeEuro.valor) {
			return false;
		}
		return true;
	}

}
