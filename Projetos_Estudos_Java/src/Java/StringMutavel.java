package Java;
public class StringMutavel {

	public static void main(String[] args) {

		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Tairo Roberto Miguel de Assunção");

		System.out.println(s0.capacity()); /*
											 * capacity() motra o tamenho da
											 * capacidade da String
											 */
		System.out.println(s1.capacity());
		System.out.println(s1.reverse());/* reverse mostra a String invertida */
		System.out.println(s1.reverse());

		s1.append(" - El Magrelo 'The Butcher'");/*
												 * append() adiciona uma Strind
												 * a outra String sem
												 * necessidade da criação de
												 * outra variável
												 */
		System.out.println(s1);

		s1.delete(0, 35); /*
						 * delete() remove da String o que estiver dentro dos
						 * parametros "Posição inicial e Posição final"
						 */
		System.out.println(s1);
	}

}
