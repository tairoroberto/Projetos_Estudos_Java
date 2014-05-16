package threads;

public class ContaConjunta {

	private int saldo = 100;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public synchronized void sacar(int valor, String cliente) {
		int saldoOriginal = saldo;
		
		if (saldo >= valor) {
			System.out.println(cliente + " via sacar");
			
			try {
				System.out.println("Aguardando processamento...");
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			saldo -= valor;
			String msg = "O  "+cliente+" SACOU " +valor+""
					+ " [Saldo original="+saldoOriginal+",saldo final ="+saldo+"]";
			
			System.out.println(msg);
				} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}

	}

}
