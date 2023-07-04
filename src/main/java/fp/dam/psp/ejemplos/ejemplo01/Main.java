package fp.dam.psp.ejemplos.ejemplo01;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++)
			new UnHilo(i).start();
	}
}