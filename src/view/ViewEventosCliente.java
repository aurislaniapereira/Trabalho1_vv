package view;

import java.util.Scanner;

import controller.ControladorCliente;
import controller.ControladorEvento;
import exceptions.ExceptionEventoNaoExistente;
import model.Cliente;
import model.Evento;

public class ViewEventosCliente {
	
	private Scanner scanner = new Scanner(System.in);
	ControladorCliente ctrlCliente = new ControladorCliente();
	ControladorEvento ctrlEvento = new ControladorEvento();
	
	public void participarEvento(Cliente cliente) {
		System.out.println("Digite o código do evento que deseja participar :");
		int cod = scanner.nextInt();
		scanner.nextLine();
		
		Evento evento = ctrlEvento.buscarEventoID(cod);
		
		ctrlCliente.participarEvento(cliente, evento);
	}
	
	public void listarEventosDoCliente(Cliente cliente) throws ExceptionEventoNaoExistente {
		ctrlCliente.listarEventosDoCliente(cliente);
	}

}
