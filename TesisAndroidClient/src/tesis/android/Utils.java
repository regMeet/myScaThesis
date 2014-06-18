package tesis.android;

import org.ksoap2.serialization.SoapObject;

import android.widget.TextView;

public class Utils {

	// Metodo que popula los datos en eel layout de la actividad.
	public void popularDatos(SoapObject body, String titulo,
			String propertyName, TextView textview) {

		String text = body.getPropertySafelyAsString(propertyName);
		if (text.length() == 0)
			text = "No hay datos";
		if(text.equals(true))
			text = "Si";
		if(text.equals(false))
			text = "No";
		textview.setText(titulo + text);

	}

}
