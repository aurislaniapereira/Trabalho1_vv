package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exceptions.ExceptionEventoNaoExistente;
import model.Cliente;
import model.Evento;

class ClienteTeste {
	Cliente cliente;
	Evento eventoCliente;
	
	@BeforeEach
	public void inicializar() {
		this.cliente = new Cliente("Lana");
	}
	
	@Test
	@DisplayName("Teste para verificar se o cliente est� sendo criado")
	public void verifica_se_cliente_e_criado() {
		
		assertEquals("Lana", cliente.getNome());
	}
	
	@Test
	@DisplayName("Teste para verificar se o cliente est� de fato participando de um evento e se est� sendo mostrado os eventos que o cliente participa")
	public void verifica_se_cliente_esta_no_evento() {
		eventoCliente = new Evento("08/10/2021", 1, "Rock in Fortaleza", "Fortaleza", "Arctic Monkeys");
		cliente.participarEvento(eventoCliente);
		
		assertEquals("Eventos [dia=08/10/2021, id=1, nome=Rock in Fortaleza, cidade=Fortaleza, atracao=Arctic Monkeys]", eventoCliente.toString());
	}
	
	@Test
	@DisplayName("Teste para verificar se o cliente n�o est� participando de um evento")
	public void verifica_se_cliente_nao_esta_em_um_evento() {

		assertThrows(ExceptionEventoNaoExistente.class, ()-> cliente.listarEventosDoCliente());
	}

}
