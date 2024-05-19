package uninter;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moeda> listaMoedas;

	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	// metodo para adicionar da lista
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	// metodo para remover da lista
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {		
		if(listaMoedas.isEmpty()) {
			System.out.println("Não tem moedas!!!!!!");
			return;
		}
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}		
	}
}
