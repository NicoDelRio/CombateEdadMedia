package personje;

public class Orco extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 15;
			
	public Orco() {
		super();
		this.salud = SALUD_INICIAL;
		this.fuerza = FUERZA_INICIAL;
	}

	@Override
	public void vivo_atacar(Personaje Atacado) {
		Atacado.vivo_sufreAtaque(fuerza);
		
	}

	@Override
	protected void vivo_sufreAtaque(int fuerzaAtacante) {
		if(salud - (fuerzaAtacante / 4) < 0) {
			salud = 0;
			return;
		}
		salud -= fuerzaAtacante / 4;
		
	}

	@Override
	public void vivo_descansar() {
		// No le sirve de nada descansar
		
	}

}
