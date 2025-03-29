package it.uniroma3.diadia;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class PartitaTest {

	private Partita partita;

	@BeforeEach
	void setUp() throws Exception {
		this.partita = new Partita();
	}

	@Test
	void testNuovaPartitaNonFinita() {
		assertFalse(this.partita.isFinita());
		
	}
	
	@Test
	void testPartitaVinta() {
		partita.setStanzaCorrente(partita.getStanzaVincente());
		assertTrue(this.partita.vinta());
	}
	
	@Test
	void testPartitaPersaCfuFiniti() {
		this.partita.setCfu(0);
		assertFalse(this.partita.vinta());
	}
	
	@Test
	void testNuovaPartitaNonFinitaEPoiFinita() {
		assertFalse(this.partita.isFinita());
		this.partita.setFinita();
		assertTrue(this.partita.isFinita());
	}

}
