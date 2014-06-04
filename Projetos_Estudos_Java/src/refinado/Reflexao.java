package refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {
	public static void main(String[] args) throws ClassNotFoundException {
		String nome ="OO.Conta";
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
		
		/**Retorna os métodos da classe, Somente os métodos publicos*/
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		/**Retorna os métodos da classe todos os métodos*/
		Method[] m = classe.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method);
			System.out.println(method.getName());
		}
		
		/**Retorna os métodos construtores da classe */
		
		Constructor[] c = classe.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
	}
}
