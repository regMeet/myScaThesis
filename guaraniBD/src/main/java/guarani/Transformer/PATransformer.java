package guarani.Transformer;

import java.sql.Date;
import java.text.SimpleDateFormat;

public abstract class PATransformer {
	private static final String DD_MM_YYYY = "dd/MM/yyyy";
	private static SimpleDateFormat sdf = new SimpleDateFormat(DD_MM_YYYY);

	public static long getLong(String value) {
		long valor = 0L;
		if (value != null) {
			valor = Long.parseLong(value.trim());
		}
		return valor;
	}

	public static String getDate(Date date) {
		String fecha = null;

		if (date != null) {
			fecha = sdf.format(date);
		}
		return fecha;
	}

	public static int getString(String value) {
		int valor = 0;

		if (value != null && !value.isEmpty()) {
			valor = Integer.parseInt(value);
		}
		return valor;
	}

	public static boolean getBooleanFromChar(String value) {
		boolean valor = false;
		if (value != null) {
			if (value.equals("S")) {
				valor = true;
			} else {
				valor = false;
			}
		}
		return valor;
	}

}
