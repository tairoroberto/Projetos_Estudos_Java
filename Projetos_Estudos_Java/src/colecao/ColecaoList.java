package colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Futebol");
		list.add("Basquete");
		list.add("Tenis");
		list.add("Vôlei");
		list.add("Natacao");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			String letra = list.get(i); 
			list.set(i, letra.toUpperCase());
		}
		System.out.println(list.toString());
		
		System.out.println(list.indexOf("BOXE"));
		System.out.println(list.subList(2, 4));
		
		list.subList(2, 4).clear();
		System.out.println(list.toString());
		
		
	}

}
