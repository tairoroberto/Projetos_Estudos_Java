package arquivos;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Arquivo3 {

	public static void main(String[] args) throws IOException {

		/**
		 * Pegar o diretório RAIZ de um sistema operacional
		 */

		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();

		for (Path path : dirs) {
			System.out.println(path);
		}

		/**
		 * LISTAR O CONTEÙDO DE UM DIRETÒRIO
		 */

		Path dir = Paths.get("/home/tairo/");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

			for (Path path : stream) {
				System.out.println(path.getFileName());
			}

		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}

		/**
		 * Percorrendo Diretorios
		 */

		FileSystem fs = FileSystems.getDefault();

		for (FileStore store : fs.getFileStores()) {
			System.out.println("Unidade" + store.toString());
			/* Mostra as unidades de armaznaamento */

			System.out.println("Total de Espaço:" + store.getTotalSpace());
			/* Mostra o total de espaço nas unidades de armazenamento */
			System.out.println("Total de Espaço Disponivel:"
					+ store.getUsableSpace());
			/* Mostra o espaço disponivél nas unidades de armazenamento */
			System.out.println("Espaço ultilizado:"
					+ (store.getTotalSpace() - store.getUsableSpace()));
			/* Mostra o espaço ultilizado nas unidades de armazenamneto */

			System.out.println();

		}
	}

}
