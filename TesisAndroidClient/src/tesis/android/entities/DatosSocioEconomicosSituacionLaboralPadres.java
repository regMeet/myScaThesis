package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosSocioEconomicosSituacionLaboralPadres implements KvmSerializable{

	protected DatosLaborales datosDeTrabajoMadre;
	protected DatosLaborales datosDeTrabajoPadre;
	protected String nivelDeEstudiosMadre;
	protected String nivelDeEstudiosPadre;
	protected String viveElPadre;
	protected String viveLaMadre;

	public DatosSocioEconomicosSituacionLaboralPadres(SoapObject obj) {
		this.datosDeTrabajoMadre = new DatosLaborales((SoapObject) obj.getProperty("datosDeTrabajoMadre"));
		this.datosDeTrabajoPadre = new DatosLaborales((SoapObject) obj.getProperty("datosDeTrabajoPadre"));
		this.nivelDeEstudiosMadre = obj.getPropertySafelyAsString("nivelDeEstudiosMadre");
		this.nivelDeEstudiosPadre = obj.getPropertySafelyAsString("nivelDeEstudiosPadre");
		this.viveElPadre = obj.getPropertySafelyAsString("viveElPadre");
		this.viveLaMadre = obj.getPropertySafelyAsString("viveLaMadre");
	}
	
	public DatosLaborales getDatosDeTrabajoMadre() {
		return datosDeTrabajoMadre;
	}

	public void setDatosDeTrabajoMadre(DatosLaborales value) {
		this.datosDeTrabajoMadre = value;
	}

	public DatosLaborales getDatosDeTrabajoPadre() {
		return datosDeTrabajoPadre;
	}

	public void setDatosDeTrabajoPadre(DatosLaborales value) {
		this.datosDeTrabajoPadre = value;
	}

	public String getNivelDeEstudiosMadre() {
		return nivelDeEstudiosMadre;
	}

	public void setNivelDeEstudiosMadre(String value) {
		this.nivelDeEstudiosMadre = value;
	}

	public String getNivelDeEstudiosPadre() {
		return nivelDeEstudiosPadre;
	}

	public void setNivelDeEstudiosPadre(String value) {
		this.nivelDeEstudiosPadre = value;
	}

	public String getViveElPadre() {
		if(viveElPadre.equals("true"))
			return "Si";
		else
			return "NO";
	}


	public void setViveElPadre(String viveElPadre) {
		this.viveElPadre = viveElPadre;
	}


	public String getViveLaMadre() {
		if(viveLaMadre.equals("true"))
			return "Si";
		else
			return "No";
	}


	public void setViveLaMadre(String viveLaMadre) {
		this.viveLaMadre = viveLaMadre;
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
