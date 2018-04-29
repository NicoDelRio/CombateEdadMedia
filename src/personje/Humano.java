package personje;

public class Humano extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 10;
	
	public Humano() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
		
	}
	
	@Override
	public void vivo_atacar(Personaje Atacado) {
		Atacado.vivo_sufreAtaque(fuerza);
		fuerza -= 1;
		
	}

	@Override
	protected void vivo_sufreAtaque(int fuerzaAtacante) {
		if(salud - fuerzaAtacante < 0) {
			salud = 0;
			return;
		}
		salud -= fuerzaAtacante;
		fuerza -= 1;
		
	}

	@Override
	public void vivo_descansar() {
		fuerza = FUERZA_INICIAL;
		
	}

}
