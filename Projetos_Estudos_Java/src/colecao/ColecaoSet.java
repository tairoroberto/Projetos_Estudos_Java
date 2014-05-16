package colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		String[] cores ={"Verde","marelo","Azul","Branco"};
		
		List<String> lista = Arrays.asList(cores);
		System.out.println(lista);
		
		Set<String> set = new HashSet<>(lista);
		System.out.println(set);
	}

}
