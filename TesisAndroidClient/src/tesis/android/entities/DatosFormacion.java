package tesis.android.entities;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosFormacion implements KvmSerializable {

	protected DatosFormacionSecundaria datosFormacionSecundaria;
	protected DatosFormacionSuperior datosFormacionSuperior;
	protected List<String> idiomas;

	public DatosFormacion(SoapObject obj) {
		
		this.datosFormacionSecundaria = new DatosFormacionSecundaria((SoapObject) obj.getProperty("datosFormacionSecundaria"));
		
		this.datosFormacionSuperior = new DatosFormacionSuperior((SoapObject) obj.getProperty("datosFormacionSuperior"));
		
		List<String> idiomas = new ArrayList<String>();
		for(int i=2; i<obj.getPropertyCount(); i++){
			idiomas.add(obj.getProperty(i).toString());
		}
		
		this.idiomas = idiomas;
		
	}

	public DatosFormacionSecundaria getDatosFormacionSecundaria() {
		return datosFormacionSecundaria;
	}

	public void setDatosFormacionSecundaria(DatosFormacionSecundaria value) {
		this.datosFormacionSecundaria = value;
	}

	public DatosFormacionSuperior getDatosFormacionSuperior() {
		return datosFormacionSuperior;
	}

	public void setDatosFormacionSuperior(DatosFormacionSuperior value) {
		this.datosFormacionSuperior = value;
	}

	public List<String> getIdiomas() {
		if (idiomas == null) {
			idiomas = new ArrayList<String>();
		}
		return this.idiomas;
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
