package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosFamiliares implements KvmSerializable {

	protected String cantidadDeHijos;
	protected String cantidadDeHijosACargo;
	protected String conQuienVive;
	protected String estadoCivil;

	public DatosFamiliares(SoapObject obj){
		this.cantidadDeHijos = obj.getPropertySafelyAsString("cantidadDeHijos");
		this.cantidadDeHijosACargo = obj.getPropertySafelyAsString("cantidadDeHijosACargo");
		this.conQuienVive = obj.getPropertySafelyAsString("conQuienVive");
		this.estadoCivil = obj.getPropertySafelyAsString("estadoCivil");
	}

	public String getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(String value) {
		this.cantidadDeHijos = value;
	}

	public String getCantidadDeHijosACargo() {
		return cantidadDeHijosACargo;
	}

	public void setCantidadDeHijosACargo(String value) {
		this.cantidadDeHijosACargo = value;
	}

	public String getConQuienVive() {
		return conQuienVive;
	}

	public void setConQuienVive(String value) {
		this.conQuienVive = value;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String value) {
		this.estadoCivil = value;
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
	public void getPropertyInfo(int arg0, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo arg2) {
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}

}
