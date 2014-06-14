package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import OO.Conta;

public class Arquivo {
	Path path = Paths
			.get("/home/tairo/workspace/Projetos_Estudos_Java/src/contas.txt");
	Charset uft8 = StandardCharsets.UTF_8;

	public void armazenarContas(ArrayList<Conta> contas) {
		/*
		 * metodo para gragar as contas no Arquivo.txt
		 */
		try (BufferedWriter w = Files.newBufferedWriter(path, uft8)) {
			for (Conta conta : contas) {
				w.write(conta.getCliente() + ":" + conta.getSaldo() + "\n");
			}
		} catch (Exception e) {
			System.out.println("Erro na gravação");
		}

	}

	public ArrayList<Conta> recuperarContas() throws IOException {
		/*
		 * metodo para recuperar cadad contas no Arquivo.txt
		 */

		ArrayList<Conta> contas = new ArrayList<>();

		try (BufferedReader r = Files.newBufferedReader(path, uft8)) {
			String linha = null;
			while ((linha = r.readLine()) != null) {
				String[] t = linha.split(":");
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));

				contas.add(conta);
			}

		}
		return contas;

	}

	public static void main(String args[]) throws IOException {

		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Tairo", 1500));
		contas.add(new Conta("Luceli", 1200));
		contas.add(new Conta("Neusa", 1600));
		contas.add(new Conta("Roberto Carlos", 1800));
		contas.add(new Conta("Tarliane", 2500));
		contas.add(new Conta("Sérgio", 2500));
		contas.add(new Conta("Marilyce", 1900));

		Arquivo arquivo = new Arquivo();

		arquivo.armazenarContas(contas);

		ArrayList<Conta> contas2 = new ArrayList<>();
		contas2 = arquivo.recuperarContas();
		for (Conta conta : contas2) { // variavei criada para percorrer cada
										// conta dentro do ArrayList

			System.out.println(conta.getCliente());
			System.out.println(conta.getSaldo());
		}

	}

}
