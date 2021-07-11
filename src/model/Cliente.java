package model;

import java.util.ArrayList;

import exceptions.ExceptionEventoNaoExistente;

public class Cliente {
	
	private String nome;
	private ArrayList<Evento> eventosUsuario;
	
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
		this.eventosUsuario = new ArrayList<>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Evento> getEventosUsuario() {
		return eventosUsuario;
	}
	public void setEventosUsuario(ArrayList<Evento> eventosUsuario) {
		this.eventosUsuario = eventosUsuario;
	}
	
	
	//Metodos
	public void participarEvento(Evento evento) {
		eventosUsuario.add(evento);
	}
	
	public void listarEventosDoCliente() throws ExceptionEventoNaoExistente {
		for(int i = 0; i < eventosUsuario.size(); i++) {
			System.out.println(eventosUsuario.get(i).toString());
			if(i == eventosUsuario.size()-1) {
				return;
			}
			
		}
		throw new ExceptionEventoNaoExistente();
	}
	

}
