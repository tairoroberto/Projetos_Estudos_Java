package OO;
@SuppressWarnings("serial")
public class Conta implements java.io.Serializable {
	private String nome;
	private double saldo;

	public Conta() {
	}

	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;

	}

	public String getCliente() {
		return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setDeposito(double deposito) {
		this.saldo += deposito;
	}

	public void setSaque(double valor) {
		this.saldo -= valor;
		System.out.println("Saldo: " + this.saldo);
	}

	public void setTransferencia(String favorecido, double valor) {
		this.saldo -= valor;
		System.out.println("Valor transferido para: " + favorecido);
		System.out.println("Saldo = " + this.saldo);
	}
}
