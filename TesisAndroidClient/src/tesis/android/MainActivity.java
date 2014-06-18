package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosPrincipales;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button buttonAceptar = (Button) findViewById(R.id.button1);
		
		buttonAceptar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				EditText dni = (EditText) findViewById(R.id.editText1);
				if(dni.getText().toString().length()==8){
					ServiceConection conexion = ServiceConection.getInstance();
					conexion.setDni(dni.getText().toString());
					
					SoapObject response = conexion.llamadaAlServicio("getDatosPrincipales");
					DatosPrincipales datos = new DatosPrincipales((SoapObject) response);
					if(datos.getDni().equals("")){
						mensajeError("El alumno con DNI " + conexion.getDni() + " no se encuentra.");
					}else{
						Intent opciones = new Intent(MainActivity.this,
						OptionsActivity.class);
						startActivity(opciones);
					}
				}else{
					mensajeError("Debe introducir un DNI valido para continuar");
				}
			}
		});

	}
	
	public void mensajeError(String mensaje){
		TextView error = (TextView) findViewById(R.id.textView1);
		error.setText(mensaje);
		error.setTextColor(Color.RED);
	}
	
}