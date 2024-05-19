package uninter;

public class Principal {

	public static void main(String[] args) {
		
		Moeda real = new Real(30);
		
		real.info();
		
		System.out.println("Convertido " + real.converte());
		
		System.out.println();
		
		Moeda euro = new Euro(30);
		
		euro.info();
		
		System.out.println("Convertido " + euro.converte());
		
		System.out.println();
		
		Moeda dolar = new Dolar(30);
		
		dolar.info();
		
		System.out.println("Convertido " + dolar.converte());
		
		
		Cofrinho cofrinho = new Cofrinho();
		
		
		/*cofrinho.adicionar(real);
		cofrinho.adicionar(euro);
		cofrinho.adicionar(dolar);
		*/
		System.out.println();
		cofrinho.listagemMoedas();
		

	}

}
