package uninter;

import java.util.Scanner;


public class Menu {
	private Scanner escrever;
	Cofrinho cofrinho;

	public Menu() {
		escrever = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenuPrincipal() {
		
		try {
			cabecalhoMenuPrincipal();
			
			String opcaoSelecionada = escrever.next();
			
			switch (opcaoSelecionada) {
			case "0": {
				System.out.println("\nPrograma encerrado!!!!!!!!!!!!!!!!!");
				break;
			}
			case "1":{
				exibirSubMenuAdicionarMoedas();
				exibirMenuPrincipal();
				break;	
			}
			case "2":{
				exibirSubMenuRemoverMoedas();
				exibirMenuPrincipal();
				break;
			}
			case "3":{
				cofrinho.listagemMoedas();
				exibirMenuPrincipal();
				break;
				
			}
			case "4":{
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println("O valor total convertido para real ? " + converterDoubleParaString(valorTotalConvertido));
				exibirMenuPrincipal();
				break;
			}
			default:
				System.out.println("Opção invalida!!!!\n");
				exibirMenuPrincipal();
				break;
			}
		}catch (RuntimeException e) {
			throw new RuntimeException("Opção invalida!!!");
		}
	}
	private void exibirSubMenuAdicionarMoedas() {
	
		exibirOpcoesDeMoedas();
			int opcaoMoeda = escrever.nextInt();
			if (opcaoMoeda <= 0 || opcaoMoeda > 3) {
				System.out.println("Não existe essa moeda");
				exibirMenuPrincipal();
			}
			
			System.out.println("Digite o valor: ");
			String valorTextualMoeda = escrever.next();			
			
			Moeda moeda = null;
			
			if(opcaoMoeda == 1) {
				moeda = new Real(converterStringParaDouble(valorTextualMoeda));
			}else if(opcaoMoeda == 2) {
				moeda = new Dolar(converterStringParaDouble(valorTextualMoeda));
			}else if (opcaoMoeda == 3) {
				moeda = new Euro(converterStringParaDouble(valorTextualMoeda));
			}
			
			cofrinho.adicionar(moeda);
			System.out.println("Moeda adicionada!!!!!!!!");
	}
	
	
	private double converterStringParaDouble(String valorTexto) {
		String valorTextualMoeda = valorTexto.replaceAll(",", ".");
		double valorMoeda = Double.valueOf(valorTextualMoeda);
		return valorMoeda;
	}
	
	private String converterDoubleParaString(Double valorDouble) {
		String valorTotalConverteTextual = String.format("%.2f", valorDouble);
		valorTotalConverteTextual = valorTotalConverteTextual.replace(".", ",");
		return valorTotalConverteTextual;
		
	}
	
	private void exibirSubMenuRemoverMoedas() {
		
		exibirOpcoesDeMoedas();
		int opcaoMoeda = escrever.nextInt();
		if (opcaoMoeda <= 0 || opcaoMoeda > 3) {
			System.out.println("Não existe essa moeda");
			exibirMenuPrincipal();
		}
		
		System.out.println("Digite o valor: ");
		String valorTextualMoeda = escrever.next();			
		
		Moeda moeda = null;
		
		if(opcaoMoeda == 1) {
			moeda = new Real(converterStringParaDouble(valorTextualMoeda));
		}else if(opcaoMoeda == 2) {
			moeda = new Dolar(converterStringParaDouble(valorTextualMoeda));
		}else if (opcaoMoeda == 3) {
			moeda = new Euro(converterStringParaDouble(valorTextualMoeda));
		}
		
		moeda.equals(moeda);
		
		cofrinho.remover(moeda);
	}
	
	private void exibirOpcoesDeMoedas() {
		System.out.println("Escolha Moeda:");
		System.out.println("1-Real:");
		System.out.println("2-Dolar:");
		System.out.println("3-Euro:");
	}
	
	private void cabecalhoMenuPrincipal() {
		System.out.println("COFRINHO");
		System.out.println("1-Adicionar Moedas");
		System.out.println("2-Remover Moedas");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		
	}
}
