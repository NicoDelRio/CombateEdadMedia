package test;

import org.junit.Assert;
import org.junit.Test;
import personje.*;

public class ElfoTests {

	@Test
	public void elfoAtacaEnano() {
		Personaje elfo = new Elfo();
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, enano.salud());
		elfo.atacar(enano);
		Assert.assertEquals(95, enano.salud()); // Salud enano: 95 = 100 - Fuerza (5 pts)
		elfo.atacar(enano);
		Assert.assertEquals(90, enano.salud()); // Salud enano: 90 = 95 - Fuerza (5 pts)
		elfo.descansar();						// Fuerza Elfo al 100% (5 ptos)
		elfo.atacar(enano);
		Assert.assertEquals(85, enano.salud()); // Salud enano: 85 = 90 - Fuerza (5 pts)
		enano.atacar(elfo);						// Fuerza Elfo: 7 = 5 +  2 ^ 1
		elfo.atacar(enano);
		Assert.assertEquals(78, enano.salud()); // 78 = 85 - Fuerza Elfo(7 pts)
		enano.atacar(elfo);						// Fuerza Elfo: 11 = 7 +  2 ^ 2
		elfo.atacar(enano);
		Assert.assertEquals(67, enano.salud()); // 67 = 78 - Fuerza Elfo (11 pts)
		enano.atacar(elfo);						// Fuerza Elfo: 19 = 11 +  2 ^ 3
		elfo.atacar(enano);
		Assert.assertEquals(48, enano.salud()); // 48 = 67 - Fuerza Elfo (19 pts)
		elfo.descansar();						// Fuerza Elfo al 100% = 5 ptos
		elfo.atacar(enano);
		Assert.assertEquals(43, enano.salud()); // 43 = 48 - Fuerza Elfo (5 pts)
		enano.atacar(elfo);						// Fuerza Elfo: 7 = 5 +  2 ^ 1	
		elfo.atacar(enano);
		Assert.assertEquals(36, enano.salud()); // 36 = 43 - Fuerza Elfo(7 pts)
		
	}

	@Test
	public void elfoDescansaDeAtaqueEnano() {
		Personaje elfo = new Elfo();
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, elfo.salud());
		Assert.assertEquals(100, enano.salud());
		elfo.descansar();						// Salud 100% (100 ptos)
		Assert.assertEquals(100, elfo.salud()); 
		enano.atacar(elfo);						// Salud: 90 = 100 - (10 + 2 * 0)
		Assert.assertEquals(90, elfo.salud());
		enano.atacar(elfo);						// Salud: 78 = 90 - (10 + 2 * 1)
		Assert.assertEquals(78, elfo.salud());
		enano.atacar(elfo);						// Salud: 64 = 78 - (10 + 2 * 2)
		Assert.assertEquals(64, elfo.salud());
		elfo.descansar();						// Salud 100% (100 ptos)
		Assert.assertEquals(100, elfo.salud());
		for(int i = 0; i < 20; i++)
			enano.atacar(elfo);					// Elfo murio  :(
		Assert.assertEquals(0, elfo.salud());
		elfo.descansar();						// Elfo murio. No revive descansando.
		Assert.assertEquals(0, elfo.salud());
		elfo.atacar(enano);						// Elfo murio. No ataca.
		Assert.assertEquals(100, enano.salud());
				
	}
	
}
