package view;

import java.util.Scanner;

import exceptions.ExceptionEventoNaoExistente;
import model.Cliente;

public class ViewUsers {
	
	
	private Scanner scanner = new Scanner(System.in);
	private ViewEventos viewEventos = new ViewEventos();
	private ViewEventosCliente viewEventosCliente = new ViewEventosCliente();
	
	public void menuCliente(Cliente cliente) throws ExceptionEventoNaoExistente {
		int option;
		boolean end = false;

		while(!end) {
			System.out.println("| 1 | Participar de um evento");
			System.out.println("| 2 | Listar todos os eventos");
			System.out.println("| 3 | Listar meus eventos");
			System.out.println("| 0 | Sair");

			option = scanner.nextInt();
			scanner.nextLine();
		

			switch (option){
			case 1:{
				System.out.println("Eventos disponiveis");
				viewEventos.solicitarListaEventos();
				viewEventosCliente.participarEvento(cliente);
				break;
			
			}case 2:{
				viewEventos.solicitarListaEventos();
				break;
			
			}case 3:{
				System.out.println("Eventos que o cliente " + cliente.getNome() + " esta participando");
				viewEventosCliente.listarEventosDoCliente(cliente);
				break;
				
			}
			default:
				end = true;
				break;
			}
		}
	}
	
	
	public void menuAdmin() throws ExceptionEventoNaoExistente {

		int option;
		boolean end = false;

		while(!end) {
			System.out.println("| 1 | Cadastrar eventos");
			System.out.println("| 2 | Listar todos os eventos");
			System.out.println("| 3 | Lista um evento por Data (dd/mm/aa)");
			System.out.println("| 4 | Lista um evento por Cidade");
			System.out.println("| 5 | Apagar um evento");
			System.out.println("| 6 | Atualizar evento cadastrado");
			System.out.println("| 0 | Sair");

			option = scanner.nextInt();
			scanner.nextLine();
		

			switch (option){
			case 1:{
				viewEventos.preencherDadosParaCadastrarEvento();
				break;
			
			}case 2:{
				viewEventos.solicitarListaEventos();
				break;
			
			}case 3:{
				viewEventos.preencherDataParaBusca();
				break;
				
			} case 4:{
				viewEventos.preencherCidadeParaBusca();
				break;
	
			} case 5:{
				viewEventos.preencherIdParaRemocao();
				break;
				
			}case 6:{			
				viewEventos.preencherDadosParaAlterarEvento();
				break;
			}
			default:
				end = true;
				break;
			}
		}
	}
	
}
