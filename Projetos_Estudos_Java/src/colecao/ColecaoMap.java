package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>();
		pais.put("Br", "Brasil");
		pais.put("Ru", "Russia");
		pais.put("In", "Índia");
		pais.put("CN", "China");
		pais.put("EUA", "Estados Unidos");
		pais.put("CAN", "Canadá");
		
		System.out.println(pais);

		// Verificar se a chave existe no mapa
		System.out.println(pais.containsKey("Br"));

		// Verificar se a Valor existe no mapa
		System.out.println(pais.containsValue("Brasil"));
		
		// Recuperar o Valor pela chave
		System.out.println(pais.get("Br"));
		
		// Remover o Valor pela chave
		
		pais.remove("EUA");
		System.out.println(pais);
		
		Set<String> keys =pais.keySet();
		
		//Podemos mostrar um array com as chaves
		System.out.println(keys);
		
		// Ou podemos fazer um foreach para pegar as chaves e os valores
		for (String key : keys) {
			System.out.println(key + ": " + pais.get(key));
		}

	}

}
