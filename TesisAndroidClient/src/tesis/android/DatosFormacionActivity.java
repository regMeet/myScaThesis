package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosFormacion;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosFormacionActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();

		setContentView(R.layout.datos_formacion);

		SoapObject response = conection.llamadaAlServicio("getDatosFormacion");

		DatosFormacion datos = new DatosFormacion((SoapObject) response);

		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Datos Formación");

		TextView informacion = (TextView) findViewById(R.id.textView1);
		
		informacion.append("---------------------------\n\n");

		informacion.append("Formación Secundaria\n\n");

		informacion.append("Colegio: " + datos.getDatosFormacionSecundaria().getNombreColegioSecundario() + "\n\n");
		
		informacion.append("Titulo: " + datos.getDatosFormacionSecundaria().getNombreTituloSecundario() + "\n\n");
		
		informacion.append("Año de Egreso: " + datos.getDatosFormacionSecundaria().getAnioEgresoSecundario() + "\n\n");

		informacion.append("Orientación vocacional: " + datos.getDatosFormacionSecundaria().getOrientacionVocacionalRecibida() + "\n\n");
		
		informacion.append("Codigo Titulo: " + datos.getDatosFormacionSecundaria().getCodigoTituloSecundario() + "\n\n");
		
		informacion.append("Codigo Colegio: " + datos.getDatosFormacionSecundaria().getCodigoColegioSecundario() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
		informacion.append("Formación Superior\n\n");
		
		informacion.append("Establecimiento: " + datos.getDatosFormacionSuperior().getEstablecimiento() + "\n\n");
		
		informacion.append("Carrera: " + datos.getDatosFormacionSuperior().getCarrera() + "\n\n");
		
		informacion.append("Area: " + datos.getDatosFormacionSuperior().getArea() + "\n\n");
		
		informacion.append("Año Egreso: " + datos.getDatosFormacionSuperior().getAnioEgreso() + "\n\n");
		
		informacion.append("Nivel: " + datos.getDatosFormacionSuperior().getNivel() + "\n\n");
		
		informacion.append("Tipo: " + datos.getDatosFormacionSuperior().getTipo() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
		informacion.append("Idiomas\n\n");
		
		for (String idioma : datos.getIdiomas()) {

			informacion.append(idioma + "\n\n");

		}

	}

}