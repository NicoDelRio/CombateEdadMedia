package personje;

public abstract class Personaje {
	protected int salud;
	protected int fuerza;
	
	public final int salud() {
		return salud;
	}
	
	public final void atacar(Personaje Atacado) {
		if(!estaVivo())
			return;
		vivo_atacar(Atacado);
	}
	public abstract void vivo_atacar(Personaje Atacado); // public abstract: se puede utilizar en los Objetos. Se deben implementar.
	
	protected final void sufreAtaque(int fuerzaAtacante) {
		if(!estaVivo())
			return;
		vivo_sufreAtaque(fuerzaAtacante);
	}
	protected abstract void vivo_sufreAtaque(int fuerzaAtacante); // protected abstract: las utilizan las clases hijas. Se deben implementar. 
	
	public final void descansar() {
		if(!estaVivo())
			return;
		vivo_descansar();
	}
	public abstract void vivo_descansar();
	
	private boolean estaVivo() {
		return salud > 0;
	}
	
	
}