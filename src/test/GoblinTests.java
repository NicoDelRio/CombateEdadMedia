package test;

import org.junit.Assert;
import org.junit.Test;
import personje.*;

public class GoblinTests {

	@Test
	public void goblinAtacaEnano() {
		Personaje goblin = new Goblin();
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, enano.salud());
		goblin.atacar(enano);
		Assert.assertEquals(97, enano.salud()); // Salud enano: 97 = 100 - Fuerza (3 pts)
		goblin.atacar(enano);
		Assert.assertEquals(94, enano.salud()); // Salud enano: 94 = 97 - Fuerza (3 pts)
		goblin.atacar(enano);
		Assert.assertEquals(91, enano.salud()); // Salud enano: 91 = 94 - Fuerza (3 pts)	
	}

	@Test
	public void goblinDescansaDeAtaqueElfo() {
		Personaje goblin = new Goblin();
		Personaje elfo = new Elfo();
		
		Assert.assertEquals(100, goblin.salud());
		goblin.descansar();						// Salud 100% (100 ptos)
		Assert.assertEquals(100, goblin.salud()); 
		for(int i = 0; i < 10; i++)
			elfo.atacar(goblin);				// Salud:  100 - 5 * Azar
//		System.out.println(goblin.salud());
		Assert.assertEquals(95, goblin.salud());
		goblin.descansar();						// Salud 100% (100 ptos)
		Assert.assertEquals(100, goblin.salud());
		for(int i = 0; i < 10000; i++)
			elfo.atacar(goblin);				// Goblin murio  :(
		Assert.assertEquals(0, goblin.salud());
		goblin.descansar();						// Goblin murio. No revive descansando.
		Assert.assertEquals(0, goblin.salud());
		goblin.atacar(elfo);					// Goblin murio. No ataca.
		Assert.assertEquals(100, elfo.salud());
	}
	
}
