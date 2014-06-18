package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosFormacionSecundaria implements KvmSerializable {

	protected String anioEgresoSecundario;
	protected String codigoColegioSecundario;
	protected String codigoTituloSecundario;
	protected String nombreColegioSecundario;
	protected String nombreTituloSecundario;
	protected String orientacionVocacionalRecibida;

	public DatosFormacionSecundaria(SoapObject obj) {
		
		this.anioEgresoSecundario = obj.getPropertySafelyAsString("anioEgresoSecundario");
		this.codigoColegioSecundario = obj.getPropertySafelyAsString("codigoColegioSecundario");
		this.codigoTituloSecundario = obj.getPropertySafelyAsString("codigoTituloSecundario");
		this.nombreColegioSecundario = obj.getPropertySafelyAsString("nombreColegioSecundario");
		this.nombreTituloSecundario = obj.getPropertySafelyAsString("nombreTituloSecundario");
		this.orientacionVocacionalRecibida = obj.getPropertySafelyAsString("orientacionVocacionalRecibida");
		
	}
	
	public String getAnioEgresoSecundario() {
		return anioEgresoSecundario;
	}

	public void setAnioEgresoSecundario(String value) {
		this.anioEgresoSecundario = value;
	}

	public String getCodigoColegioSecundario() {
		return codigoColegioSecundario;
	}

	public void setCodigoColegioSecundario(String value) {
		this.codigoColegioSecundario = value;
	}

	public String getCodigoTituloSecundario() {
		return codigoTituloSecundario;
	}

	public void setCodigoTituloSecundario(String value) {
		this.codigoTituloSecundario = value;
	}

	public String getNombreColegioSecundario() {
		return nombreColegioSecundario;
	}

	public void setNombreColegioSecundario(String value) {
		this.nombreColegioSecundario = value;
	}

	public String getNombreTituloSecundario() {
		return nombreTituloSecundario;
	}

	public void setNombreTituloSecundario(String value) {
		this.nombreTituloSecundario = value;
	}

	public String getOrientacionVocacionalRecibida() {
		return orientacionVocacionalRecibida;
	}

	public void setOrientacionVocacionalRecibida(String value) {
		this.orientacionVocacionalRecibida = value;
	}

	@Override
	public Object getProperty(int arg0) {
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 0;
	}

	@Override
	public void getPropertyInfo(int arg0,
			@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo arg2) {
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}

}
