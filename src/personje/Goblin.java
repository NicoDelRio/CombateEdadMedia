package personje;

public class Goblin extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 3;
	int numAleatorio = (int) System.currentTimeMillis();
	
	public Goblin() {
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
		if(MyRandom.random(1,10) == 1) {
			if(salud - fuerzaAtacante < 0) {
				salud = 0;
				return;
			}
			salud -= fuerzaAtacante;
		}
		
	}

	@Override
	public void vivo_descansar() {
		salud = SALUD_INICIAL;
		
	}

}
