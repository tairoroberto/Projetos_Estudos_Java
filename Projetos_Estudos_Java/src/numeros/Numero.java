package numeros;

import java.text.NumberFormat;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) {

		double saldo = 123_456.789;
		
		/******************************************************
		 *  	Formatação do número	no formato double	  *
		 * ***************************************************/
		NumberFormat format_1 = NumberFormat.getInstance();
		System.out.println(format_1.format(saldo));
		
		/******************************************************
		 *  	Formatação do número no formato  inteiro	  *
		 * ***************************************************/
		NumberFormat format_2 = NumberFormat.getIntegerInstance();
		System.out.println(format_2.format(saldo));
		
		/******************************************************
		 *  	Formatação do número no formato  Porcentagem  *
		 * ***************************************************/
		NumberFormat format_3 = NumberFormat.getPercentInstance();
		System.out.println(format_3.format(saldo));
		
		/******************************************************
		 *  	Formatação do número no formato  de Moedas	  *
		 * ***************************************************/
		NumberFormat format_4 = NumberFormat.getCurrencyInstance();
		System.out.println(format_4.format(saldo));
		
		// e podemos configurar os numeros de casas decimais.
		format_4.setMaximumFractionDigits(1);
		System.out.println(format_4.format(saldo));
			
		// e podemos configurar os numeros de cada pais.
		NumberFormat format_5 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(format_5.format(saldo));
		
		
	}

}
