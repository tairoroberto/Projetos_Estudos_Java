package threads;

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();

	public static void main(String[] args) {

		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filho").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Empregada").start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			String cliente = Thread.currentThread().getName();
			conta.sacar(20, cliente);
			if (conta.getSaldo() < 0) {
				System.out.println("Limite estourado!");
			}
		}

	}

}
