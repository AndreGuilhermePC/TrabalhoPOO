package uninter;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}

	abstract void info();
	
	abstract void converte();

}
