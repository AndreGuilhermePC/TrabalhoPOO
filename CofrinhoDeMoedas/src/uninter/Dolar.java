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

}
