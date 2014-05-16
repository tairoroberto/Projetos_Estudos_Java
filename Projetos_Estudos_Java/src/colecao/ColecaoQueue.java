package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		fila.add("Tairo");
		fila.add("Roberto");
		fila.add("MIguel");

		System.out.println(fila);

		// Ver quem é o proximo da fila
		System.out.println(fila.peek());

		// Remover o primeiro elemenro da fila
		fila.poll();
		System.out.println(fila);

		/** Outros métodos diponíveis em LikedList */
		LinkedList<String> f = (LinkedList<String>) fila;
		
		//Addiconar elemento no inicio da fila
		f.addFirst("Magrelo");
		
		//Addiconar elemento no fim da fila
		f.addLast("Panico");
		System.out.println(f);
		
		//Mostra o primeiro elemento da LinkedList
		System.out.println(f.peekFirst());
		
		//Mostra o ultimo elemento da LinkedList
		System.out.println(f.peekLast());
		
		//Remover primeiro elemento da fila
		f.pollFirst();
		
		//Remover ultimo elemento da fila
		f.pollLast();
		
		System.out.println(f);
		
		
	}

}
