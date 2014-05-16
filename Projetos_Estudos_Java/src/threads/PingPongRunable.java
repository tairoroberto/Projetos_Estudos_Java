package threads;

public class PingPongRunable implements Runnable {

	String palavra;
	long tempo;

	public PingPongRunable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(palavra + "");
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;
		}

	}
	
	public static void main(String[] args) {
		
		Runnable ping = new PingPongRunable("Ping", 1500);
		Runnable pong = new PingPongRunable("Pong", 2000);;
		
		new Thread(ping,"Ping").start();
		new Thread(pong,"Pong").start();
		
		System.out.println("Ver Thread");
	}

}
