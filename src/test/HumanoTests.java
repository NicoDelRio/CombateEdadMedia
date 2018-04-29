package test;

import org.junit.Assert;
import org.junit.Test;
import personje.*;

public class HumanoTests {

	@Test
	public void humanoAtacaEnano() {
		Personaje humano = new Humano();
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, enano.salud());
		humano.atacar(enano);
		Assert.assertEquals(90, enano.salud()); // 90 = 100 - (10 - 1 * 0)
		humano.atacar(enano);
		Assert.assertEquals(81, enano.salud()); // 81 = 90 - (10 - 1 * 1)
		humano.atacar(enano);
		Assert.assertEquals(73, enano.salud()); // 73 = 81 - (10 - 1 * 2)
		humano.descansar();						// Fuerza al 100% = 10 ptos
		humano.atacar(enano);
		Assert.assertEquals(63, enano.salud()); // 63 = 73 - (10 - 1 * 0)
	}
	
	@Test
	public void humanoDescansaDeAtaqueOrco() {
		Personaje humano = new Humano();
		Personaje orco = new Orco();
		
		Assert.assertEquals(100, humano.salud());
		for(int i=0; i<6; i++) {
			orco.atacar(humano);
		}
		Assert.assertEquals(10, humano.salud()); // 10 = 100 - 15 * 6
		humano.descansar();
		Assert.assertEquals(10, humano.salud()); // Descansar no aumenta salud
		orco.atacar(humano);					 // Humano murio  :(
		Assert.assertEquals(0, humano.salud());
		humano.descansar();						 // Humano murio. No revive descansando.
		Assert.assertEquals(0, humano.salud());
		humano.atacar(orco);					 // Humano murio. No ataca.
		Assert.assertEquals(100, orco.salud());
	}
	
}
