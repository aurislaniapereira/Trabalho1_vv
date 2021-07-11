package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import exceptions.ExceptionEventoNaoExistente;
import model.Evento;
import repository.RepositoryEventos;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TesteRepositoryEventos {

	
	@Test
	@DisplayName("Teste para verificar se o evento está sendo adicionado no repositório")
	public void evento_add_repository() {
		Evento evento = new Evento("22/12/2021", 1, "Natal Beneficente", "Bahia", "Queen");
		Evento evento2 = new Evento("23/12/2021", 2, "Natal Beneficente", "Fortaleza", "Queen");
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		
		assertTrue(repositorioEvento.adicionarEventos(evento));
		assertTrue(repositorioEvento.adicionarEventos(evento2));
	}
	
	@Test
	@DisplayName("Teste para verificar se todos os eventos cadastrados estão sendo mostrados")
	public void evento_listar_todos() throws ExceptionEventoNaoExistente {
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		
		assertTrue(repositorioEvento.listarTodosEventos());
	}
	
	@Test
	@DisplayName("Teste para verificar se os eventos de data x estão cadastrados")
	public void evento_listar_por_data() throws ExceptionEventoNaoExistente {
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		
		assertEquals("Eventos [dia=23/12/2021, id=2, nome=Natal Beneficente, cidade=Fortaleza, atracao=Queen]", repositorioEvento.listarEventosPorData("23/12/2021"));
	}
	
	@Test
	@DisplayName("Teste para verificar se há eventos cadastrados para a cidade x")
	public void evento_listar_por_cidade() throws ExceptionEventoNaoExistente {
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		
		assertEquals("Eventos [dia=23/12/2021, id=2, nome=Natal Beneficente, cidade=Fortaleza, atracao=Queen]", repositorioEvento.listarEventosPorCidade("Fortaleza"));
	}
	
	@Test
	@DisplayName("Teste para verificar se um evento está sendo removido")
	public void evento_removevendo() throws ExceptionEventoNaoExistente {
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		
		assertEquals("Evento removido", repositorioEvento.removerEvento(1));
	}
	
	@Test
	@DisplayName("Teste para verificar se um evento está sendo alterado")
	public void evento_alterando() throws ExceptionEventoNaoExistente {
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		
		assertTrue(repositorioEvento.alterarEventos("23/12/2021", 2, "Natal Beneficente", "Santos","Beatles"));
		assertEquals("Eventos [dia=23/12/2021, id=2, nome=Natal Beneficente, cidade=Santos, atracao=Beatles]", repositorioEvento.listarEventosPorCidade("Santos"));
	}
	
	@Test
	@DisplayName("Teste para verificar se um evento está sendo retornado ao passar seu id")
	public void evento_por_id() throws ExceptionEventoNaoExistente {
		RepositoryEventos repositorioEvento = new RepositoryEventos();
		Evento evento =  repositorioEvento.buscarEventoPorId(2);
		assertEquals("Eventos [dia=23/12/2021, id=2, nome=Natal Beneficente, cidade=Fortaleza, atracao=Queen]", evento.toString());
	}
	
}
