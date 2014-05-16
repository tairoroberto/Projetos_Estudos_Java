package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Guaraná");
		lista.add("Uva");
		lista.add("Manga");
		lista.add("Coco");
		lista.add("Acaí");
		lista.add("Banana");
		
		System.out.println(lista);

		// Ordenando uma lista
		Collections.sort(lista);
		System.out.println(lista);

		// Revertendo a ordem da lista
		Collections.reverse(lista);
		System.out.println(lista);

		// Embaralhar uma lista
		Collections.shuffle(lista);
		System.out.println(lista);

		// Colocar mais elementos em uma lista
		Collections.addAll(lista, "Cupuacú","Laranja","Laranja");
		System.out.println(lista);
		
		// Saber apareceu um elemento em uma lista
		System.out.println(Collections.frequency(lista,"Laranja"));
		
		//Saber se dentro da coleção tem um conjunto de palavras
		List<String> lista2 =  Arrays.asList("Acerola","Graviola");
		System.out.println(Collections.disjoint(lista, lista2));
		
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(Collections.binarySearch(lista,"Guaraná"));
		
		//Preecher todas as posições com um apalavra só
		Collections.fill(lista, "Acaí");
		System.out.println(lista);
		
		//Criar coleção que não pode se modificada
		Collection<String> constante= Collections.unmodifiableCollection(lista);
		
		
		
	}

}
