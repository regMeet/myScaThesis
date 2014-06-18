package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.Carrera;
import tesis.android.entities.DatosCondicionAcademica;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosCondicionAcademicaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();
		setContentView(R.layout.datos_condicion_academica);

		SoapObject response = conection
				.llamadaAlServicio("getDatosCondicionAcademica");

		DatosCondicionAcademica datos = new DatosCondicionAcademica(
				(SoapObject) response);

		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Condición Academica");

		TextView informacion = (TextView) findViewById(R.id.textView1);
		informacion.append("---------------------------\n\n");
		
		for (Carrera carrera : datos.getCarreras()) {
			
			informacion.append("Carrera: " + carrera.getNombreCarrera() + "\n\n");
			
			informacion.append("Activo: " + carrera.getActivo() + "\n\n");
			
			informacion.append("Egresado: " + carrera.getEgresado() + "\n\n");
			
			informacion.append("Fecha ultimo examen: "
					+ carrera.getFechaUltimoExamen() + "\n\n");
			
			informacion.append("Codigo de Carrera: "
					+ carrera.getCodigoCarrera() + "\n\n");
			
			informacion.append("Ultima Reincripcion: "
					+ carrera.getUltimaReincripcion() + "\n\n");
			
			informacion.append("---------------------------\n\n");
			
		}

	}

}
