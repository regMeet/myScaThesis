package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosSocioEconomicosSituacionLaboralPersonal implements KvmSerializable{

	protected DatosLaborales datosDeTrabajo;
	protected String descuentoJubilatorios;
	protected String empresaFamiliar;
	protected String horasSemanales;
	protected String remuneracion;
	protected String tareaQueRealiza;
	protected String trabajoQueHaceElAlumno;

	public DatosSocioEconomicosSituacionLaboralPersonal(SoapObject obj) {
		this.datosDeTrabajo = new DatosLaborales((SoapObject) obj.getProperty("datosDeTrabajo"));
		this.descuentoJubilatorios = obj.getPropertySafelyAsString("descuentoJubilatorios");
		this.empresaFamiliar = obj.getPropertySafelyAsString("empresaFamiliar");
		this.horasSemanales = obj.getPropertySafelyAsString("horasSemanales");
		this.remuneracion = obj.getPropertySafelyAsString("remuneracion");
		this.tareaQueRealiza = obj.getPropertySafelyAsString("tareaQueRealiza");
		this.trabajoQueHaceElAlumno = obj.getPropertySafelyAsString("trabajoQueHaceElAlumno");
	}
	
	public DatosLaborales getDatosDeTrabajo() {
		return datosDeTrabajo;
	}

	public void setDatosDeTrabajo(DatosLaborales value) {
		this.datosDeTrabajo = value;
	}

	public String getDescuentoJubilatorios() {
		return descuentoJubilatorios;
	}

	public void setDescuentoJubilatorios(String value) {
		this.descuentoJubilatorios = value;
	}

	public String getEmpresaFamiliar() {
		return empresaFamiliar;
	}

	public void setEmpresaFamiliar(String value) {
		this.empresaFamiliar = value;
	}

	public String getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(String value) {
		this.horasSemanales = value;
	}

	public String getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(String value) {
		this.remuneracion = value;
	}

	public String getTareaQueRealiza() {
		return tareaQueRealiza;
	}

	public void setTareaQueRealiza(String value) {
		this.tareaQueRealiza = value;
	}

	public String getTrabajoQueHaceElAlumno() {
		return trabajoQueHaceElAlumno;
	}

	public void setTrabajoQueHaceElAlumno(String value) {
		this.trabajoQueHaceElAlumno = value;
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
