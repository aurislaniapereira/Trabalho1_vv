package controller;

import exceptions.ExceptionEventoNaoExistente;
import model.Evento;
import repository.RepositoryEventos;

public class ControladorEvento {
	
	private RepositoryEventos repositoryEventos = new RepositoryEventos();
	
	public void cadastrarEvento(String dia, int id, String nome, String cidade, String atracao) {
		
		Evento eventos = new Evento(dia, id, nome, cidade, atracao);
		System.out.println(eventos.toString());
		if(repositoryEventos.adicionarEventos(eventos)) {
			System.out.println("Inserido com sucesso!");
		}else {
			System.err.println("Erro ao inserir o usuário.");
		}
		
	}
	
	public boolean listarTodosEventos() throws ExceptionEventoNaoExistente {
		boolean x = repositoryEventos.listarTodosEventos();
		return x;
	}
	
	public void listarEventosPorDia(String dia) throws ExceptionEventoNaoExistente {
		repositoryEventos.listarEventosPorData(dia);
	}

	public void listarEventosPorCidade(String cidade) throws ExceptionEventoNaoExistente {
		repositoryEventos.listarEventosPorCidade(cidade);
	}
	
	public void removerEvento(int id) throws ExceptionEventoNaoExistente {
		repositoryEventos.removerEvento(id);
	}
	
	public void alterarEvento(String dia, int id, String nome, String cidade, String atracao) {
	
		if(repositoryEventos.alterarEventos(dia, id, nome, cidade, atracao)) {
			System.out.println("Alterado com sucesso!");
		}else {
			System.err.println("Erro ao alterar evento");
		}
	}
	
	public Evento buscarEventoID(int id) {
		return repositoryEventos.buscarEventoPorId(id);
	}
	
	public void povoarEventos() {
		repositoryEventos.povoarEventos();
	}
	
}
