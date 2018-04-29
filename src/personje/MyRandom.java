package personje;

public class MyRandom {
	
	static int numAleatorio = (int) System.currentTimeMillis();

	public static int random(int min, int max) {
//		int i = (int) (Math.random() * (max - min)) % (max - min);
		int i = (numAleatorio++) % (max - min + 1);
//		System.out.println(i + min);
		return i + min;
	}
}
