package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosPrincipales;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosPrincipalesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();

		setContentView(R.layout.datos_principales);

		SoapObject response = conection
				.llamadaAlServicio("getDatosPrincipales");

		DatosPrincipales datos = new DatosPrincipales((SoapObject) response);

		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Datos Principales");

		TextView informacion = (TextView) findViewById(R.id.textView1);
		
		informacion.append("---------------------------\n\n");

		informacion.append("Apellido: " + datos.getApellido() + "\n\n");

		informacion.append("Nombre: " + datos.getNombre() + "\n\n");

		informacion.append("Fecha de nacimiento: "
				+ datos.getFechaDeNacimiento() + "\n\n");

		informacion.append("DNI: " + datos.getDni() + "\n\n");

		informacion.append("E-Mail: " + datos.getEmail() + "\n\n");

		informacion.append("Genero: " + datos.getGenero() + "\n\n");

		informacion.append("Nacionalidad: " + datos.getNacionalidad() + "\n\n");

		informacion.append("Cuil: " + datos.getCuil() + "\n\n");

		informacion.append("Telefono: " + datos.getTelefonoFijo() + "\n\n");

		informacion.append("celular: " + datos.getTelefonoMovil() + "\n\n");

		informacion.append("---------------------------\n\n");

	}

}
