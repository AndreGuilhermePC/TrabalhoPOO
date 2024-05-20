package uninter;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converte() {
		return valor * 5.10;
	}

	@Override
	public boolean equals(Object objeto) {
		// Verifica se são da mesma classe
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
			
		//Se os valores são iguais
		Dolar objetoDeDolar = (Dolar) objeto;
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		return true;
	}

}
