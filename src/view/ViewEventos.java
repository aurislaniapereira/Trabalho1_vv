package view;

import java.util.Scanner;

import controller.ControladorEvento;
import exceptions.ExceptionEventoNaoExistente;

public class ViewEventos {
	
	private Scanner scanner = new Scanner(System.in);
	private ControladorEvento ctrlEvento = new ControladorEvento();
	
	public void preencherDadosParaCadastrarEvento() {
		
		
		int id;
		String dia, nome, cidade, atracao;
		System.out.println("Digite o dia do evento:\n");
		dia = scanner.nextLine();
		System.out.println("Digite o nome do evento:\n");
		nome = scanner.nextLine();
		System.out.println("Digite o local:\n");
		cidade = scanner.nextLine();
		System.out.println("Digite a atracao:\n");
		atracao = scanner.nextLine();
		System.out.println("Digite o id do evento:\n");
		id = scanner.nextInt();
		
		ctrlEvento.cadastrarEvento(dia, id, nome, cidade, atracao);
		
	}
	
	public void solicitarListaEventos() throws ExceptionEventoNaoExistente {
		boolean x = ctrlEvento.listarTodosEventos();	
	}

	
	public void preencherDataParaBusca() throws ExceptionEventoNaoExistente {
		System.out.println("Digite o dia do evento que deseja pesquisar:");
		String dia = scanner.next();
		
		ctrlEvento.listarEventosPorDia(dia);	
	}
	
	
	public void preencherCidadeParaBusca() throws ExceptionEventoNaoExistente {
		System.out.println("Digite a cidade do evento que deseja pesquisar:");
		String cidade = scanner.next();
		
		ctrlEvento.listarEventosPorCidade(cidade);	
	}
	
	public void preencherIdParaRemocao() throws ExceptionEventoNaoExistente {
		System.out.println("Digite o id do evento que deseja apagar:");
		int id = scanner.nextInt();
		
		ctrlEvento.removerEvento(id);	
	}
	
	public void preencherDadosParaAlterarEvento() {
		int id;
		String dia, nome, cidade, atracao;
		
		System.out.println("Digite o id do evento que deseja alterar:\n");
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o dia do evento:\n");
		dia = scanner.nextLine();
		System.out.println("Digite o nome do evento:\n");
		nome = scanner.nextLine();
		System.out.println("Digite o local:\n");
		cidade = scanner.nextLine();
		System.out.println("Digite a atracao:\n");
		atracao = scanner.nextLine();
		
		ctrlEvento.alterarEvento(dia, id, nome, cidade, atracao);
	}
	
}
