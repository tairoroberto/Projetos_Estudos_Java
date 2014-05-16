package Java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import OO.Conta;

public class Serealiza2 {

	public void armazenarContas(ArrayList<Conta> contas) throws Exception {
		/*
		 * metodo para gragar as contas no Arquivo.txt
		 */
		try (FileOutputStream fos = new FileOutputStream(
				"/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/objeto.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
			}
		}
	}

	public ArrayList<Conta> recuperarContas() throws Exception {
		/*
		 * metodo para recuperar cadad contas no Arquivo.txt
		 */
		try (FileInputStream fis = new FileInputStream(
				"/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/objeto.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Conta>) ois.readObject();

			}
		}
	}

	public static void main(String args[]) throws Exception {

		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Tairo", 1500));
		contas.add(new Conta("Luceli", 1200));
		contas.add(new Conta("Neusa", 1600));
		contas.add(new Conta("Roberto Carlos", 1800));
		contas.add(new Conta("Tarliane", 2500));
		contas.add(new Conta("Sérgio", 2500));
		contas.add(new Conta("Marilyce", 1900));

		Serealiza2 arquivo = new Serealiza2();

		arquivo.armazenarContas(contas);

		ArrayList<Conta> contas2 = new ArrayList<>();
		contas2 = arquivo.recuperarContas();
		for (Conta conta : contas2) { // variavei criada para percorrer cada
										// conta dentro do ArrayList

			System.out.println(conta.getCliente() + " Seu saldo é:"
					+ conta.getSaldo());

		}

	}

}
