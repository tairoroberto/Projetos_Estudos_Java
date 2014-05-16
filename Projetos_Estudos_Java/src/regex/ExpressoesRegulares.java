package regex;

public class ExpressoesRegulares {

	public static void main(String[] args) {

		boolean b = "Java".matches("java");
		// MODIFICADORES
		/*
		 * (?i)-->ignora Maiúculas e Minúsculas, (?x)-->Conmentários,
		 * (?m)-->Multilinhas, (?s)-->Dottal.
		 */

		b = "java".matches("(?i)Java"); // Procura a palavra "Java" ignorando
										// Maiúsculas e Minúsculas
		System.out.println(b);

		// METACARACTERES
		// . --> Qualquer caractere
		// \d --> Digitos [0-9]
		// \D --> Não é Digito [^0-9]
		// \s --> Espaços [ \t \n \x0B \f \r]
		// \S --> Não é espaço [^\s]
		// \w --> Letra [a-zA-Z_0-9]
		// \W --> Não é Letra

		b = "@".matches("."); // se procurar qualquer coisa
		b = "2".matches("\\d");// se procurar número
		b = "a".matches("\\w");// se procurar letras e números
		b = " ".matches("\\s");// s eprocurar Espaços

		b = "P".matches("."); // Procura uma única ocorrencia de caractere
		b = "Pi".matches(".."); // Procura duas ocorrencias de caracteres
		b = "Pie".matches("..."); // Procura três ocorrencias de caracteres

		b = "21".matches("\\d\\d"); // Procura uma única ocorrencia de Dígito

		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";// expressão para validação de
													// CEP.
		b = "02169-130".matches(cep); // Procura várias ocorrências de Dígitos

		// QUANTIFICADORES
		// X{n} --> X, exatamente n vezes
		// X{n,} --> X, pelo menos n vezes
		// X{n,m} --> X, pelo menos n ,mas não mais que m vezes
		// X? --> X, 0 ou 1 vez
		// X* --> X, 0 ou + vez
		// X+ --> X, 1 ou + vezes

		b = "12".matches("\\d{2}"); // procura exatamente 2 Dígitos
		b = "123".matches("\\d{2,}"); // procura pelo menos 2 Dígitos
		b = "12345".matches("\\d{2,5}"); // procura pelo menos 2, mas não mais
											// que 5 Digitos
		b = "".matches(".?"); // procura qualquer caracter 0 ou 1 vez
		b = "ab".matches(".*"); // procura qualquer caracter 0 ou + vez
		b = "123".matches(".+"); // procura qualquer caracter 1 ou + vez

		cep = "\\d{5}-\\d{3}"; // Procuca 5 Dígitos - mais 3 Dígitos
		b = "02169-130".matches(cep);

		String data = "\\d{2}/\\d{2}/\\d{4}"; // Procura 2 Dígitos / 2 Dígitos /
												// 4 Dígitos
		b = "15/07/1988".matches(data);

		// META CARACTERES DE FRONTEIRA

		// ^--> Inicia
		// $--> Finalliza
		// |--> Ou

		b = "Pier21".matches("^Pier.*"); // começa com "Pier" e pode ter
											// qualquer coisa depois
		b = "Pier21".matches(".*21$");// começa com qualquer coisa e termina com
										// "21"
		b = "Tem Java aqui".matches(".*Java.*"); // Procura a palavra Java
													// "pode ter qualquer coisa antes e qualquer coisa depois"
		b = "Sim".matches("Sim|Não");// Procura pela palavra "Sim" ou pela
										// palavra "Não"
		// AGRUPADORES

		// [...] --> Agrupamento
		// [a-z] --> Alcance
		// [a-e][i-u] --> União
		// [a-z&&[aeiou]] --> Interseção
		// [^abc] --> Exceção
		// [a-z&&[^m-p]] --> Subtração
		// \x --> Fuga literal

		b = "x".matches("[a-z]");// Procura qualquer ocorrencia entre "a" e "z"
		b = "123".matches("[0-9]");// Procura qualquer ocorrencia entre "0" e
									// "9"
		b = "true".matches("[tT]rue");// Procura a ocorrência de "True" tanto
										// com 'T' ou 't'
		b = "Beatriz".matches("[A-Z][a-zA-Z]*");
		b = "Alho".matches("^[abc]lho");// não começa com {a,b ou c}
		b = "creu".matches("cr[ae]u"); // procura a ocorrência de crau ou creu
		System.out.println(b);
		b = "tairoroberto@hotmail.com".matches("\\w*@\\*.\\w*");

	}

}
