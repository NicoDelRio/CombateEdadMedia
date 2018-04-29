package personje;

public class Troll extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 30;
	
	public Troll() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
		
	}
	
	@Override
	public void atacar(Personaje Atacado) {
		if(salud == 0)
			return;
		if(MyRandom.random(1, 3) > 1) // random(1, 3): entre 1 y 3
			Atacado.sufreAtaque(fuerza);
		
	}

	@Override
	protected void sufreAtaque(int fuerzaAtacante) {
		// Los golpes no le hacen da�o
		
	}

	@Override
	public void descansar() {
		salud = 0;
		
	}

}
