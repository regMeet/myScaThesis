package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosFamiliares;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosFamiliaresActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();

		setContentView(R.layout.datos_principales);

		SoapObject response = conection.llamadaAlServicio("getDatosFamiliares");

		DatosFamiliares datos = new DatosFamiliares((SoapObject) response);

		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Datos Familiares");

		TextView informacion = (TextView) findViewById(R.id.textView1);
		
		informacion.append("---------------------------\n\n");

		informacion.append("Estado Civil: " + datos.getEstadoCivil() + "\n\n");
		
		informacion.append("Vive con: " + datos.getConQuienVive() + "\n\n");
		
		informacion.append("Cantidad de hijos: " + datos.getCantidadDeHijos() + "\n\n");
		
		informacion.append("Hijos a cargo: " + datos.getCantidadDeHijosACargo() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
	}
}
