package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosExtranjeros;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosExtranjerosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();

		setContentView(R.layout.datos_extranjeros);

		SoapObject response = conection.llamadaAlServicio("getDatosExtranjeros");

		DatosExtranjeros datos = new DatosExtranjeros((SoapObject) response);

		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Datos Extranjero");

		TextView informacion = (TextView) findViewById(R.id.textView1);
		
		informacion.append("---------------------------\n\n");

		informacion.append("Otorgamiento de residencia: " + datos.getFechaDeOtorgamientoDeLaResidencia() + "\n\n");
		
		informacion.append("Vencimiento de residencia: " + datos.getFechaDeVencimientoDeLaResidencia() + "\n\n");
		
		informacion.append("Ingreso al país: " + datos.getFechaIngresoAlPais() + "\n\n");
		
		informacion.append("Otorgamiento de la Visa: " + datos.getFechaOtorgamientoVisa() + "\n\n");
		
		informacion.append("Vencimiento de la visa: " + datos.getFechaVencimientoVisa() + "\n\n");
		
		informacion.append("Tipo de residencia: " + datos.getTipoDeResidencia() + "\n\n");

		informacion.append("---------------------------\n\n");

	}
}
