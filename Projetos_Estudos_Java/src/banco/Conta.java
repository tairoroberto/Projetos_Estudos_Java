package banco;

public class Conta {
	int numero;
	String cliente;
	double saldo;
	
	public Conta(int numero, String cliente, double saldo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numero +", "+ cliente +", "+ saldo;
	}
	
}
