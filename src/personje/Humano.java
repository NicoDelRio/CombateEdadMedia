package personje;

public class Humano extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 10;
	
	public Humano() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
		
	}
	
	@Override
	public void atacar(Personaje Atacado) {
		if(salud == 0)
			return;
		Atacado.sufreAtaque(fuerza);
		fuerza -= 1;
		
	}

	@Override
	protected void sufreAtaque(int fuerzaAtacante) {
		if(salud - fuerzaAtacante < 0) {
			salud = 0;
			return;
		}
		salud -= fuerzaAtacante;
		fuerza -= 1;
		
	}

	@Override
	public void descansar() {
		if(salud == 0)
			return;
		fuerza = FUERZA_INICIAL;
		
	}

}
