package gameCenterTestes;

import static org.junit.Assert.*;
import gameCenter.Jogo;
import gameCenter.Luta;
import gameCenter.Plataforma;
import gameCenter.RPG;

import org.junit.Before;
import org.junit.Test;

public class JogoTeste {	
	private Jogo jogo1;
	private Jogo jogo2;
	private Jogo jogo3;
	
	@Before
	public void criaJogo() throws Exception {
		jogo1 = new RPG ("DarkSiders", 50);
		jogo2 = new Plataforma ("Mario", 10);
		jogo3 = new Luta ("KoF", 25);
	}
	
	@Test
	public void testJogo() {
		assertEquals("Preço alterado", 50, jogo1.getPreco());
	}

	@Test
	public void testRegistraJogada() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPreco() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

}
