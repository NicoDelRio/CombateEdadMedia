package personje;

public class Elfo extends Personaje {

	int SALUD_INICIAL = 100, FUERZA_INICIAL = 5, ataqueRecibido = 0;
	
	public Elfo() {
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
		if(salud - fuerzaAtacante < 0) {
			salud = 0;
			return;
		}
		salud -= fuerzaAtacante;
		fuerza += Math.pow(2, ++ataqueRecibido);
		
	}

	@Override
	public void descansar() {
		if(salud == 0)
			return;
		salud = SALUD_INICIAL;
		fuerza = FUERZA_INICIAL;
		ataqueRecibido = 0;
		
	}

}
