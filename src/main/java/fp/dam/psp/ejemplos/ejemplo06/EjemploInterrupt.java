package fp.dam.psp.ejemplos.ejemplo06;

public class EjemploInterrupt extends Thread {
	public void run() {
		while (!isInterrupted())
			System.out.println("en el hilo");
	}

	public static void main(String[] args) throws InterruptedException {
		EjemploInterrupt h = new EjemploInterrupt();
		h.start();
		Thread.sleep(2000);
		h.interrupt();
		h.join();
		System.out.println("hilo finalizado");
	}
}
