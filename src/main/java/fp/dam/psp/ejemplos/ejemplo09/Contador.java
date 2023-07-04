package fp.dam.psp.ejemplos.ejemplo09;

public class Contador {
	private int n;

	public Contador(int n) {
	this.n = n;
	}

	public void inc() {
		n++;
	}

	public int get() {
		return n;
	}
}
