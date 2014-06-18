package tesis.android;

import java.io.IOException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.widget.TextView;

public class ServiceConection extends Activity {

	private static ServiceConection INSTANCE = null;
	private String dni; 
	
    // Private constructor suppresses 
    private ServiceConection() {}
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new ServiceConection();
        }
    }
 
    public static ServiceConection getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
		
	public SoapObject llamadaAlServicio(String methodName) {

		ServiceData service = new ServiceData();
		
		SoapObject request = null;
		
		SoapObject body = null;

		// Se crea un objeto SoapObject para poder realizar la peticion
		// para consumir el ws SOAP. El constructor recibe
		// el namespace.
		request = new SoapObject(service.getNamespace(),
				methodName);
		
		// Se les pasa el DNI
		request.addProperty("dniAlumno", this.dni);

		// Se crea un objeto SoapSerializationEnvelope para serealizar la
		// peticion SOAP.
		// el constructor recibe la version de SOAP
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

		// Se envuelve la peticion soap
		envelope.setOutputSoapObject(request);
		envelope.dotNet = true;

		// Objeto que representa el modelo de transporte
		// Recibe la URL del ws
		HttpTransportSE transporte = new HttpTransportSE(service.getUrl());

		try {
			// Hace la llamada al ws
			transporte.call(service.getSoap_action(), envelope);
			// Se crea un SoapObjectP y se obtiene la respuesta
			// de la peticion
			body = (SoapObject) envelope.getResponse();
		} catch (IOException e) {
			TextView oopsMessage = (TextView) findViewById(R.id.textView3);
			oopsMessage.setText("El servicio no esta disponible");
			oopsMessage.setGravity(0x01);
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		}

		return body;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
