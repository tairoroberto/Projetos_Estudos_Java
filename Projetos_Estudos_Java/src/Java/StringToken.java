package Java;
public class StringToken {

	public static void main(String[] args) {
		// String a ser quebrada
		String s = " XHTML; CSS; JQUERY; JAVA;";
		s = "Panicobass El Magrelo programing in Java";
		String[] tokens = s.split(" ");// retorna um array de Strings
		System.out.println(tokens.length + " Tokens");
		for (String token : tokens) {
			System.out.println(token);

		}
	}
}
