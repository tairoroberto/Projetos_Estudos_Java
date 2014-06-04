package redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public ChatServer() {
		/** ServerSocket para a conexão com o cliente */
		ServerSocket server;

		/** Faz a conexão com o cliente */
		try {
			server = new ServerSocket(5000);

			while (true) {
				/**
				 * A conexão com o cliente ira retornar um Socket Que será
				 * armazenado em uma classe Scanner	 */
				Socket socket = server.accept();
				new Thread(new EscultaCliente(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private class EscultaCliente implements Runnable {
		Scanner leitura;

		public EscultaCliente(Socket socket) {
			try {
				leitura = new Scanner(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			String texto;
			try {
				while ((texto = leitura.nextLine()) != null) {
					System.out.println(texto);
				}
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer();
	}
}
