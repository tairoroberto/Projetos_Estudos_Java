package Arrays;
import java.util.ArrayList;

public class Arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		cores.add("Amarelo");
		cores.add("Branco");
		cores.add("Azul");
		cores.add("Preto");
		
		// size() retorna o tamnho do ArrayList
		System.out.println("Tamanho do ArrayList = "+cores.size());
		
		// aqui imprime-se o ArraList convertendo o em String
		System.out.println("Cores do ArrayList = "+cores.toString());
		
		//get() pega o elemento do ArrayList
		System.out.println("Elemento do ArrayList = "+cores.get(2));
		
		
		
	}

}
