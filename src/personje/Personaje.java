package personje;

public abstract class Personaje {
	protected int salud;
	protected int fuerza;
	
	public final int salud() {
		return salud;
	}
	
	public abstract void atacar(Personaje Atacado); // public abstract: se puede utilizar en los Objetos. Se deben implementar.
	
	protected abstract void sufreAtaque(int fuerzaAtacante); // protected abstract: las utilizan las clases hijas. Se deben implementar. 
	
	public abstract void descansar();
	
}