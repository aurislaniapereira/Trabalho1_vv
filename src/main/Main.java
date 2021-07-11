package main;

import controller.ControladorEvento;
import exceptions.ExceptionEventoNaoExistente;
import model.Cliente;
import view.ViewMenuPrincipal;

public class Main {
	
	private static ViewMenuPrincipal viewMenu;
	private static ControladorEvento ctrlControladorEvento = new ControladorEvento();
	
	public static void main(String args[]) throws ExceptionEventoNaoExistente{
		
		ctrlControladorEvento.povoarEventos();
		
		viewMenu = new ViewMenuPrincipal();
		viewMenu.menuPrincipal();
		
	}


}
