package test;

import org.junit.Assert;
import org.junit.Test;
import personje.*;

public class TrollTests {
	@Test
	public void trollAtacaEnano() {
		Personaje troll = new Troll();
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, enano.salud());
		troll.atacar(enano);
		Assert.assertEquals(70, enano.salud()); // Salud enano: 70 = 100 - Fuerza (30 pts) (2 de 3)
//		troll.atacar(enano);
//		Assert.assertEquals(40, enano.salud()); // Salud enano: 40 = 70 - Fuerza (30 pts) (2 de 3)
	}

	@Test
	public void goblinDescansaDeAtaqueElfo() {
		Personaje troll = new Troll();
		Personaje elfo = new Elfo();
		
		Assert.assertEquals(100, troll.salud());
		elfo.atacar(troll);						// Salud troll: 100% (100 ptos)
		Assert.assertEquals(100, troll.salud()); 
		elfo.atacar(troll);						// Salud troll: 100% (100 ptos)
		Assert.assertEquals(100, troll.salud()); 
		troll.descansar();						// Salud troll: 0% (0 ptos)
		Assert.assertEquals(0, troll.salud());  // Troll murio  :(
		for(int i = 0; i < 10000; i++)
			troll.atacar(elfo);					// Troll murio. No ataca.
		Assert.assertEquals(100, elfo.salud());
	}
	
}
