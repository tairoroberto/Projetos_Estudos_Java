package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws IOException {
		
		//Criação do objeto servidor com a porta 5000
		ServerSocket server = new ServerSocket(5000);
		
		//Criaçãoe de while que fica aguardando uma solicitação de cliente
		while (true) {
			
			//quando recebe uma conexão, essa é armazenada em um socket
			//Para poder haver uma conversa
			Socket soketServer = server.accept();
			
			//Após receber uma conexão podemos esvrever para o outro lado usando
			// o método PrintWriter
			try(PrintWriter  w = new PrintWriter(soketServer.getOutputStream())){
				
				//Mandando mensagem para o cliente
				w.println("Aprenda Java logo para ser contratado por uma boa empresa");
					
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}

}
