package personje;

public class Enano extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 10;
	
	public Enano() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
		
	}

	@Override
	public void vivo_atacar(Personaje Atacado) {
		Atacado.sufreAtaque(fuerza);
		fuerza += 2;
		
	}
	
	@Override
	protected void vivo_sufreAtaque(int fuerzaAtacante) {
		if(salud - fuerzaAtacante < 0) {
			salud = 0;
			return;
		}
		salud -= fuerzaAtacante;
		
	}

	@Override
	public void vivo_descansar() {
		if (salud < SALUD_INICIAL * 0.75) {
			salud += SALUD_INICIAL * 0.25;
		} else {
			salud = SALUD_INICIAL;
		}
		
	}


}
