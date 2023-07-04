package fp.dam.psp.ejemplos.ejemplo12;

import java.util.concurrent.locks.ReentrantLock;

public class Contador {
	ReentrantLock lock = new ReentrantLock();
	private int n;

	public Contador(int n) {
		this.n = n;
	}

	public void inc() {
		lock.lock();
		try {
			// dentro del bloque try se recoge la sección crítica
			n++;
		} finally {
			lock.unlock();
		}
	}

	public int get() {
		return n;
	}
}
