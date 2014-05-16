package datas;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(1988, Calendar.JULY, 15);
		Date data = c.getTime();

		Locale locale = Locale.getDefault();
		Locale brasil = new Locale("pt", "BR");
		Locale india = new Locale("hi", "IN");
		Locale eua = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale italia = Locale.ITALIAN;
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		/* Locale Padrão */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		/* Locale Brasil */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.FULL, india);
		/* Locale India */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.FULL, eua);
		/* Locale Estados Unidos */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.FULL, japao);
		/* Locale Japão */
		System.out.println(f.format(data));

		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		/* Locale Itália */
		System.out.println(f.format(data));

	}
}
