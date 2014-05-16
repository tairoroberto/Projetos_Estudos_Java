package datas;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {

		/* 01 de Janeiro de 1970 */
		System.out.println(System.currentTimeMillis());

		/* Data atual */
		Date agora = new Date();
		System.out.println(agora);

		/* GregorianCalendar */

		/*
		 * Lembrando que a classe "Calendar" é uma classe estatica e não pode
		 * ser inicializada com o "new"
		 */
		Calendar c = Calendar.getInstance();
		c.set(1988, Calendar.JULY, 15);

		/* Retorna a data atual do calemdario */
		System.out.println(c.getTime());

		System.out.println(c.get(Calendar.YEAR));// Ano.
		System.out.println(c.get(Calendar.MONTH));// Mês.
		System.out.println(c.get(Calendar.DAY_OF_MONTH));// Dia do mês.

		/* Altera o Calendario */

		c.set(Calendar.YEAR, 2000); // Altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH);// Altera o mês
		c.set(Calendar.DAY_OF_MONTH, 25);// Altera o dia do Mês

		/* Limpar um campo do calandario */

		c.clear(Calendar.MINUTE);// Limpa o campo de minutos
		c.clear(Calendar.SECOND);// Limpa o campo de segundos

		/* Adicionar tempo */

		c.add(Calendar.DAY_OF_MONTH, 1);// Adicionado "1" dia ao dia do mês.
		c.add(Calendar.YEAR, 2); // Adicionado "2" anos ao ano corrente.

		System.out.println(c.getTime());

		/* Saudação , Bom Dia, Boa Tarde, Boa Noite */
		Calendar c1 = Calendar.getInstance();

		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if (hora <= 12) {
			System.out.println("Bom Dia...!!!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa Tarde...!!!");
		} else
			System.out.println("Boa Noite...!!!");

	}

}
