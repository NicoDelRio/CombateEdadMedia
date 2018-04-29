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
	public void atacar(Personaje Atacado) {
		if(salud == 0)
			return;
		Atacado.sufreAtaque(fuerza);
		
	}

	@Override
	protected void sufreAtaque(int fuerzaAtacante) {
		if(MyRandom.random(1,10) == 1) {
			if(salud - fuerzaAtacante < 0) {
				salud = 0;
				return;
			}
			salud -= fuerzaAtacante;
		}
		
	}

	@Override
	public void descansar() {
		if(salud == 0)
			return;
		salud = SALUD_INICIAL;
		
	}

}
