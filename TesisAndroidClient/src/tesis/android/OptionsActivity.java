package tesis.android;

import tesis.android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OptionsActivity extends Activity {
	/** Called when "ver Datos Condicion" is clicked **/
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);

		Button btnDatosPrincipales = (Button) findViewById(R.id.button1);
		Button btnDomicilio = (Button) findViewById(R.id.button2);
		Button btnFormacion = (Button) findViewById(R.id.button3);
		Button btnFamiliares = (Button) findViewById(R.id.button4);
		Button btnSocioEconomico = (Button) findViewById(R.id.button5);
		Button btnCondicion = (Button) findViewById(R.id.button7);
		Button btnExtranjero = (Button) findViewById(R.id.button6);
		
		btnDatosPrincipales.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosPrincipalesActivity.class);
				startActivity(intent);
			}

		});
			
		btnFormacion.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosFormacionActivity.class);
				startActivity(intent);
			}

		});
		
		btnDomicilio.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosDomicilioActivity.class);
				
				startActivity(intent);
			}

		});
		
		btnFamiliares.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosFamiliaresActivity.class);
				
				startActivity(intent);
			}

		});
		
		btnSocioEconomico.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosSocioEconomicosActivity.class);
				
				startActivity(intent);
			}

		});
		
		btnCondicion.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosCondicionAcademicaActivity.class);
				
				startActivity(intent);
			}

		});
		
		btnExtranjero.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(OptionsActivity.this,
						DatosExtranjerosActivity.class);
				
				startActivity(intent);
			}

		});
		
		
	}
}
