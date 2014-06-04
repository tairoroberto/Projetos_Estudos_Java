package redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//Portas de	0 - 1023 não devem ser usadas
		Socket socket = new Socket("127.0.0.1",5000);
		
		//Recupera a mensagem do servidor com o método Scanner
		// e coloca o getInputStream() dentro do Scanner
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Conselho :" + s.nextLine());
		s.close();
		
		
	}

}
