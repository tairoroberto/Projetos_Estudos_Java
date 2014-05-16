package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		
		//Adiciona elemetos a coleção
		c.add("A");
		c.add("E");
		c.add("I");
		
		System.out.println(c.toString());//Converte coleção para String
		System.out.println(c.isEmpty());//Verifica se coleção está vazia
		System.out.println(c.contains("A"));//Verifica se na coleção rtem a letra "A"
		
		//Remove letra "A" da coleção
		c.remove("A");
		System.out.println(c.toString());
		
		/**TRABALHANDO COM GRUPOS*/
		Collection<String> c2 = Arrays.asList("O","U");
		
		//Adicionando uma coleção a outra coleção
		c.addAll(c2);
		System.out.println(c.toString());
		
		//Verificar se todos os elemento da coleção 2 está na coleção 1
		System.out.println(c.containsAll(c2));
		
		//remove todos os elementos da coleção 2 da coleção 1
		c.removeAll(c2);
		System.out.println(c.toString());
		
		//Percorrer um acoleção
		for (String string : c) {
			System.out.println(string);
		}
		
		//Converter uma coleçao em um array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		//Limpartoda a coleção
		c.clear();
		System.out.println(c.toString());
		
	}

}
