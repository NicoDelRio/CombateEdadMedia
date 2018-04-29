package personje;

public class Orco extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 15;
			
	public Orco() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
	}

	@Override
	public void atacar(Personaje Atacado) {
		if(salud == 0)
			return;
		Atacado.sufreAtaque(fuerza);
		
	}

	@Override
	protected void sufreAtaque(int fuerzaAtacante) {
		if(salud - (fuerzaAtacante / 4) < 0) {
			salud = 0;
			return;
		}
		salud -= fuerzaAtacante / 4;
		
	}

	@Override
	public void descansar() {
		// No le sirve de nada descansar
		
	}

}
