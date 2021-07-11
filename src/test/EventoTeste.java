package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.Evento;


public class EventoTeste {
	Evento evento;
	
	@Test
	@DisplayName("Teste para verificar se o evento está sendo criado")
	public void verifica_se_evento_e_criado() {
		evento = new Evento("23/12/2021", 1, "Natal Beneficente", "Bahia", "Queen");
		
		assertEquals("Eventos [dia=23/12/2021, id=1, nome=Natal Beneficente, cidade=Bahia, atracao=Queen]", evento.toString());
	}

}
