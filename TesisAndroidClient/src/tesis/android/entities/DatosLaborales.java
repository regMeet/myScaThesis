package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosLaborales implements KvmSerializable {

	protected String actividadEconomica;
	protected String categoriaOcupacional;
	protected String detalleRamaActividadEconomica;
	protected String situacionLaboral;

	public DatosLaborales(SoapObject obj) {
		
		this.actividadEconomica = obj.getPropertySafelyAsString("actividadEconomica");
		this.categoriaOcupacional = obj.getPropertySafelyAsString("categoriaOcupacional");
		this.detalleRamaActividadEconomica = obj.getPropertySafelyAsString("detalleRamaActividadEconomica");
		this.situacionLaboral = obj.getPropertySafelyAsString("situacionLaboral");
		
	}
	
	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(String value) {
		this.actividadEconomica = value;
	}

	public String getCategoriaOcupacional() {
		return categoriaOcupacional;
	}

	public void setCategoriaOcupacional(String value) {
		this.categoriaOcupacional = value;
	}

	public String getDetalleRamaActividadEconomica() {
		return detalleRamaActividadEconomica;
	}

	public void setDetalleRamaActividadEconomica(String value) {
		this.detalleRamaActividadEconomica = value;
	}

	public String getSituacionLaboral() {
		return situacionLaboral;
	}

	public void setSituacionLaboral(String value) {
		this.situacionLaboral = value;
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
