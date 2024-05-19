package uninter;

import java.util.Scanner;

public class Menu {
	private Scanner escrever;

	public Menu() {
		escrever = new Scanner(System.in);
	}
	
	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO");
		System.out.println("1-Adicionar Moedas");
		System.out.println("2-Remover Moedas");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		
		String opcaoSelecionada = escrever.next();
		
		switch (opcaoSelecionada) {
		case "0": {
			System.out.println("\nPrograma encerrado!!!!!!!!!!!!!!!!!");
			break;
		}
		default:
			System.out.println("\nOpção invalida!!!!\n");
			exibirMenuPrincipal();
			break;
		}
	}
	
	
}
