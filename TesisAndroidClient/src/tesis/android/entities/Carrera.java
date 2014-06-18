package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class Carrera implements KvmSerializable {

	protected String activo;
	protected String codigoCarrera;
	protected String egresado;
	protected String fechaUltimoExamen;
	protected String nombreCarrera;
	protected int ultimaReincripcion;

	public Carrera(SoapObject obj) {
		this.nombreCarrera = obj.getPropertySafelyAsString("nombreCarrera");
		this.activo = obj.getPropertySafelyAsString("activo");
		this.codigoCarrera = obj.getPropertySafelyAsString("codigoCarrera");
		this.egresado = obj.getPropertySafelyAsString("egresado");
		this.fechaUltimoExamen = obj.getPropertySafelyAsString("fechaUltimoExamen")
				;
		this.ultimaReincripcion = Integer.parseInt(obj.getPropertySafelyAsString(
				"ultimaReincripcion"));
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String value) {
		this.activo = value;
	}

	public String getCodigoCarrera() {
		return codigoCarrera;
	}

	public void setCodigoCarrera(String value) {
		this.codigoCarrera = value;
	}

	public String getEgresado() {
		return egresado;
	}

	public void setEgresado(String value) {
		this.egresado = value;
	}

	public String getFechaUltimoExamen() {
		return fechaUltimoExamen;
	}

	public void setFechaUltimoExamen(String value) {
		this.fechaUltimoExamen = value;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String value) {
		this.nombreCarrera = value;
	}

	public int getUltimaReincripcion() {
		return ultimaReincripcion;
	}

	public void setUltimaReincripcion(int value) {
		this.ultimaReincripcion = value;
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
