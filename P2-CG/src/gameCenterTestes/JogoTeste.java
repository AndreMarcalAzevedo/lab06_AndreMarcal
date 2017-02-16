package gameCenterTestes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import gameCenter.EstilosJogo;
import gameCenter.Jogo;
import gameCenter.Luta;
import gameCenter.Plataforma;
import gameCenter.RPG;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class JogoTeste {	
	private Jogo jogo1;
	private Jogo jogo2;
	private Jogo jogo3;
	private Jogo jogo4;
	
	@Before
	public void criaJogo() throws Exception {
		Set<EstilosJogo> estilos = new HashSet<EstilosJogo>();
		estilos.add(EstilosJogo.OFFLINE);
		jogo1 = new RPG ("DarkSiders", 50, estilos);
		jogo2 = new Plataforma ("Mario", 10, estilos);
		jogo3 = new Luta ("KoF", 25, estilos);
		jogo4 = new RPG("DarkSiders", 75, estilos);
	}
		
	@Test
	public void testJogo() {
		assertEquals(50.00, jogo1.getPreco(),0.005);
		assertEquals(10.00, jogo2.getPreco(),0.005);
		assertEquals(25.00, jogo3.getPreco(),0.005);
	}

	@Test
	public void testRegistraJogada() {
		assertEquals(0, jogo1.getJogadas());
		assertEquals(0, jogo1.getHighscore());
		assertEquals(0, jogo1.getZeradas());
		jogo1.registraJogada(150, true);
		assertEquals(1, jogo1.getJogadas());
		assertEquals(150, jogo1.getHighscore());
		assertEquals(1, jogo1.getZeradas());
		jogo1.registraJogada(100, false);
		assertEquals(2, jogo1.getJogadas());
		assertEquals(150, jogo1.getHighscore());
		assertEquals(1, jogo1.getZeradas());
	}

	@Test
	public void testSetPreco()  {
		assertEquals(10, jogo2.getPreco(), 0.005);
		try {
			jogo2.setPreco(7.50);
		} catch (Exception e1) {
			
		}
		assertEquals(7.50, jogo2.getPreco(), 0.005);
		try {
			jogo2.setPreco(-7.50);
		} catch (Exception e) {
			
		}
		assertEquals(7.50, jogo2.getPreco(), 0.005);
	}

	@Test
	public void testToString() throws Exception {
		assertEquals(jogo3.getNome() + " " + jogo3.getPreco() + " Luta", jogo3.toString());
		assertEquals(jogo2.getNome() + " " + jogo2.getPreco() + " Plataforma", jogo2.toString());
		assertEquals(jogo1.getNome() + " " + jogo1.getPreco() + " RPG", jogo1.toString());
		jogo3.setPreco(12.50);
		assertEquals(jogo3.getNome() + " " + jogo3.getPreco() + " Luta", jogo3.toString());
	}

	@Test
	public void testEqualsObject() {
		assertTrue(jogo1.equals(jogo4));
		assertFalse(jogo2.equals(jogo4));
	}

}
