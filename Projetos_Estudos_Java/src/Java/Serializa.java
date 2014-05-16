package Java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import OO.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {

		String[] nomes = { "Tairo", "Luceli", "Neusa", "Roberto" };

		Conta conta1 = new Conta("Tairo", 111_222_333.444);

		/* ESCRITA DE OBJETO */

		FileOutputStream fos = new FileOutputStream(
				"/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);// oos.writeObject(nomes);
		oos.close();

		/* LEITURA DE OBJETO */

		FileInputStream fis = new FileInputStream(
				"/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();// String[] nomes1 = (String[])
											// ois.readObject();
		ois.close();
		System.out.println(c1.getCliente());
		/*
		 * Ao colocar a palavra "transient" a informação no será serializada,
		 * toda a classe será serializada apenas a informação com a palavra
		 * "transient" não será mostrada
		 */

	}

}
