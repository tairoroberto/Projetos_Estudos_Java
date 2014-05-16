package arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths
				.get("/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/Arquivo.txt");

		/**
		 * System.out.println(Files.isDirectory(path)); // verifica se é um //
		 * diretorio
		 */

		/**
		 * System.out.println(Files.isExecutable(path));// verifica se o arquivo
		 * // pode ser executado
		 */

		/**
		 * System.out.println(Files.isRegularFile(path));// verifica se o
		 * arquivo é // uma foto,texto ou // video.
		 */

		/**
		 * System.out.println(Files.size(path));// verifica o tamanho do
		 * arquivo, // "este metodo gera exceções"
		 */

		/**
		 * System.out.println(Files.getLastModifiedTime(path));// verifica a
		 * ultima // vez que o arquivo // foi modificado
		 */

		/**
		 * System.out.println(Files.getOwner(path));// retorna o Dono do
		 * arquivo.
		 */

		/**
		 * System.out.println(Files.probeContentType(path));// retorna o tipo do
		 * // arquivo"se é texto, imagem, etc"
		 */

		/**
		 * CREATE
		 */
		Files.deleteIfExists(path); // método para deletar o arquivo caso ele
									// exista.
		Files.createFile(path);// método para criação do arquivo.

		Files.write(path, "Meu Arquivo de texto...!!".getBytes());
		/*
		 * método para escrever em arquivos pequenos
		 */

		/**
		 * COPY
		 */

		Path copia = Paths
				.get("/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/copia.txt");
		/*
		 * Caminho de destino para onde o Arquivo sera copiado.
		 */

		Files.copy(path, copia); // método para fazer a copia do arquivo.

		/**
		 * MOVE
		 */

		Path mover = Paths
				.get("/home/tairo/Dropbox/Projetos_java/Projetos_Estudos_Java/src/copia.txt");
		/*
		 * Caminho de destino para onde o Arquivo sera movido.
		 */

		Files.createDirectories(mover.getParent());
		Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);
		/*
		 * metodo de complemento, se existir irá substituir o arquivo.
		 */
	}
}
