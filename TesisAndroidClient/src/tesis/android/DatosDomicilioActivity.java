package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosDomicilio;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosDomicilioActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();

		setContentView(R.layout.datos_domicilio);

		SoapObject response = conection.llamadaAlServicio("getDatosDomicilio");

		DatosDomicilio datos = new DatosDomicilio((SoapObject) response);

		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Datos Domicilio");

		TextView informacion = (TextView) findViewById(R.id.textView1);

		informacion.append("---------------------------\n\n");

		informacion.append("Calle: " + datos.getCalle() + "\n\n");

		informacion.append("Departamento: " + datos.getDepartamento() + "\n\n");

		informacion.append("Edificio: " + datos.getEdificio() + "\n\n");

		informacion.append("Número: " + datos.getNumero() + "\n\n");

		informacion.append("Piso: " + datos.getPiso() + "\n\n");

		informacion.append("Localidad: " + datos.getLocalidad() + "\n\n");

		informacion
				.append("Codigo postal: " + datos.getCodigoPostal() + "\n\n");

		informacion.append("---------------------------\n\n");

	}

}