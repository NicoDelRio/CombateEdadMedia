package test;

import org.junit.Assert;
import org.junit.Test;
import personje.*;

public class EnanoTests {
	
	@Test
	public void enanoAtacaOrco() {
		Personaje enano = new Enano();
		Personaje orco = new Orco();
		
		Assert.assertEquals(100, orco.salud());
		enano.atacar(orco);
		Assert.assertEquals(98, orco.salud()); // 98 = 100 - (10 + 2 * 0) / 4
		enano.atacar(orco);
		Assert.assertEquals(95, orco.salud()); // 95 = 98 - (10 + 2 * 1) / 4
		enano.atacar(orco);
		Assert.assertEquals(92, orco.salud()); // 92 = 95 - (10 + 2 * 2) / 4
	}
	
	@Test
	public void enanoDescansaDeAtaqueOrco() {
		Personaje enano = new Enano();
		Personaje orco = new Orco();
		
		Assert.assertEquals(100, enano.salud());
		for(int i=0; i<6; i++) {
			orco.atacar(enano);
		}
		Assert.assertEquals(10, enano.salud()); // 10 = 100 - 15 * 6

		enano.descansar();
		Assert.assertEquals(35, enano.salud());
		enano.descansar();
		Assert.assertEquals(60, enano.salud());
		enano.descansar();
		Assert.assertEquals(85, enano.salud());
		enano.descansar();
		Assert.assertEquals(100, enano.salud());
	}
	
	@Test
	public void enanoAtacaHumano() {
		Personaje enano = new Enano();
		Personaje humano = new Humano();
		
		Assert.assertEquals(100, humano.salud());
		enano.atacar(humano);
		Assert.assertEquals(90, humano.salud()); // 90 = 100 - (10 + 2 * 0)
		enano.atacar(humano);
		Assert.assertEquals(78, humano.salud()); // 78 = 90 - (10 + 2 * 1)
		enano.atacar(humano);
		Assert.assertEquals(64, humano.salud()); // 64 = 78 - (10 + 2 * 2)
	}
		
	@Test
	public void enanoDescansaDeAtaqueHumano() {
		Personaje enano = new Enano();
		Personaje humano = new Humano();
		
		Assert.assertEquals(100, enano.salud());
		for(int i=0; i<6; i++) {
			humano.atacar(enano);
		}
		Assert.assertEquals(55, enano.salud()); // 55 = 100 -10 -9 -8 -7 -6 -5 

		enano.descansar();
		Assert.assertEquals(80, enano.salud()); // 80 = 55 + 25
		enano.descansar();
		Assert.assertEquals(100, enano.salud());
	}
	
}

