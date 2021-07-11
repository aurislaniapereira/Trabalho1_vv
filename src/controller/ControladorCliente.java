package controller;

import exceptions.ExceptionEventoNaoExistente;
import model.Cliente;
import model.Evento;

public class ControladorCliente {
	
	public void participarEvento(Cliente cliente, Evento evento) {
		cliente.participarEvento(evento);
	}
	
	public void listarEventosDoCliente(Cliente cliente) throws ExceptionEventoNaoExistente {
		cliente.listarEventosDoCliente();
	}

}
