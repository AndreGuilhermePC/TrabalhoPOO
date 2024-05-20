package uninter;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moeda> listaMoedas;

	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {	
		verificaSeAListaEstaVazia();
		
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}		
	}
	
	public double totalConvertido() {
		verificaSeAListaEstaVazia();
		
		double valorTotal = 0; 
		
		for(Moeda moeda : listaMoedas) {
			valorTotal += moeda.converte();
		}
		
		return valorTotal;
	}
	
	private void verificaSeAListaEstaVazia() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Não existe nem uma moeda no cofrinho!!!!!!");
			return;
		}
	}
}
