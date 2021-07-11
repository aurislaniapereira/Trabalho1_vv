package view;

import java.util.Scanner;

import exceptions.ExceptionEventoNaoExistente;
import model.Cliente;


public class ViewMenuPrincipal {
	
	private Scanner scanner;
	private ViewUsers viewUsers;
	private Cliente cliente = new Cliente("Lana");

	
    public void menuPrincipal() throws ExceptionEventoNaoExistente {
    	
    	
    	scanner = new Scanner(System.in);
    	viewUsers = new ViewUsers();
    	
    	int option;
		boolean end = false;

		while(!end) {
			System.out.println("| 1 | Entrar como Admin");
			System.out.println("| 2 | Entrar como Cliente");
			System.out.println("| 0 | Sair");

			option = scanner.nextInt();
			scanner.nextLine();
		

			switch (option){
			case 1:{
				viewUsers.menuAdmin();
				break;
			
			}case 2:{
				viewUsers.menuCliente(cliente);
				break;
				
			}
			default:
				end = true;
				break;
			}
		}
	}
	
	
	
}

