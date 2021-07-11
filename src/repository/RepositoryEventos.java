package repository;

import java.util.ArrayList;

import exceptions.ExceptionEventoNaoExistente;
import model.Evento;

public class RepositoryEventos {
	
	private static ArrayList<Evento> arrayEventos = new ArrayList<>();
	
	public RepositoryEventos() {
		
	}

	public boolean adicionarEventos(Evento evento) {
		arrayEventos.add(evento);
		return true;
	}
	
	public boolean listarTodosEventos() throws ExceptionEventoNaoExistente{
		for(int i = 0; i < arrayEventos.size(); i++) {
			System.out.println(arrayEventos.get(i).toString());
			if(i == arrayEventos.size()-1) {
				return true;
			}
			
		}
		
		throw new ExceptionEventoNaoExistente();
	}
	
	public String listarEventosPorData(String dia) throws ExceptionEventoNaoExistente{
		String texto = "";
		for(int i = 0; i < arrayEventos.size(); i++) {
			if(arrayEventos.get(i).getDia().equals(dia)) {
				System.out.println(arrayEventos.get(i).toString());
				texto = texto + arrayEventos.get(i).toString();
				return texto;
			}
			if(i == arrayEventos.size()-1) {
				return texto;
			}
			
		}
		
		throw new ExceptionEventoNaoExistente();
	}
	
	public String listarEventosPorCidade(String cidade) throws ExceptionEventoNaoExistente{
		String texto = "";
		for(int i = 0; i < arrayEventos.size(); i++) {
			if(arrayEventos.get(i).getCidade().equals(cidade)) {
				System.out.println(arrayEventos.get(i).toString());
				texto = texto + arrayEventos.get(i).toString();
				return texto;
			}
			if(i == arrayEventos.size()-1) {
				return texto;
			}
			
		}
		
		throw new ExceptionEventoNaoExistente();
	}

	public String removerEvento(int id) throws ExceptionEventoNaoExistente {
		for(Evento e : arrayEventos) {
			if(e.getId() == id) {
				arrayEventos.remove(e);
				String texto = "Evento removido";
				System.out.println(texto);
				return texto;
			}
		}
		
		throw new ExceptionEventoNaoExistente();
	}
	
	public boolean alterarEventos(String dia, int id, String nome, String cidade, String atracao) {
		for(Evento e : arrayEventos) {
			if(e.getId() == id) {
				e.setAtracao(atracao);
				e.setCidade(cidade);
				e.setDia(dia);
				e.setNome(nome);
				return true;
			}
		}
		return false;
	}
	
	
	public Evento buscarEventoPorId(int id) {
		for(Evento e : arrayEventos) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	
	public void povoarEventos() {
		arrayEventos.add(new Evento("12/12/12", 1, "Lolla", "Fortaleza", "AC/DC"));
		arrayEventos.add(new Evento("11/11/11", 2, "Lolla2", "Sao Paulo", "AC/DC"));
		arrayEventos.add(new Evento("10/10/10", 3, "Lolla3", "Bahia", "AC/DC"));
		arrayEventos.add(new Evento("12/12/12", 4, "Lolla4", "Rio de Janeiro", "AC/DC"));
	}

}
