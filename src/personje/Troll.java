package personje;

public class Troll extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 30;
	
	public Troll() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
		
	}
	
	@Override
	public void vivo_atacar(Personaje Atacado) {
		if(MyRandom.random(1, 3) > 1) // random(1, 3): entre 1 y 3
			Atacado.vivo_sufreAtaque(fuerza);
		
	}

	@Override
	protected void vivo_sufreAtaque(int fuerzaAtacante) {
		// Los golpes no le hacen daño
		
	}

	@Override
	public void vivo_descansar() {
		salud = 0;
		
	}

}
