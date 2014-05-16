package datas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();

		c.set(1988, Calendar.JULY, 15);
		System.out.println(c.getTime());
		Date data = c.getTime();

		/* Formatação de Datas */

		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(data));

		/* Formatação de Hora */
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(data));

		/* Formatação de Datae Hora */
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(data));

		/* Estilos de Formatação */

		f = DateFormat.getDateInstance(DateFormat.FULL);
		/* imprime a data completa */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.LONG);
		/* imprime a data em formato longo */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		/* imprime a data em formato Médio */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.SHORT);
		/* imprime a data em formato curto */
		System.out.println(f.format(data));

		Date date2 = f.parse("25/08/2013");
		System.out.println(date2);

		/* SimpleDateFormate */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data));

		/* Conversão de objetos em datas */
		System.out.println(sdf.parseObject("11/11/2011"));

	}
}
