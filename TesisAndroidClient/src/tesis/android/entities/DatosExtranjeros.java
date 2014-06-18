package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosExtranjeros implements KvmSerializable {

	protected String fechaDeOtorgamientoDeLaResidencia;
	protected String fechaDeVencimientoDeLaResidencia;
	protected String fechaIngresoAlPais;
	protected String fechaOtorgamientoVisa;
	protected String fechaVencimientoVisa;
	protected String tipoDeResidencia;

	public DatosExtranjeros(SoapObject obj) {
		this.fechaDeOtorgamientoDeLaResidencia = obj.getPropertySafelyAsString("fechaDeOtorgamientoDeLaResidencia");
		this.fechaDeVencimientoDeLaResidencia = obj.getPropertySafelyAsString("fechaDeVencimientoDeLaResidencia");
		this.fechaIngresoAlPais = obj.getPropertySafelyAsString("fechaIngresoAlPais");
		this.fechaOtorgamientoVisa = obj.getPropertySafelyAsString("fechaOtorgamientoVisa");
		this.fechaVencimientoVisa = obj.getPropertySafelyAsString("fechaVencimientoVisa");
		this.tipoDeResidencia = obj.getPropertySafelyAsString("tipoDeResidencia");
	}
	
	public String getFechaDeOtorgamientoDeLaResidencia() {
		return fechaDeOtorgamientoDeLaResidencia;
	}

	public void setFechaDeOtorgamientoDeLaResidencia(String value) {
		this.fechaDeOtorgamientoDeLaResidencia = value;
	}

	public String getFechaDeVencimientoDeLaResidencia() {
		return fechaDeVencimientoDeLaResidencia;
	}

	public void setFechaDeVencimientoDeLaResidencia(String value) {
		this.fechaDeVencimientoDeLaResidencia = value;
	}

	public String getFechaIngresoAlPais() {
		return fechaIngresoAlPais;
	}

	public void setFechaIngresoAlPais(String value) {
		this.fechaIngresoAlPais = value;
	}

	public String getFechaOtorgamientoVisa() {
		return fechaOtorgamientoVisa;
	}

	public void setFechaOtorgamientoVisa(String value) {
		this.fechaOtorgamientoVisa = value;
	}

	public String getFechaVencimientoVisa() {
		return fechaVencimientoVisa;
	}

	public void setFechaVencimientoVisa(String value) {
		this.fechaVencimientoVisa = value;
	}

	public String getTipoDeResidencia() {
		if(!tipoDeResidencia.equals("anyType{}"))
			return tipoDeResidencia;
		else 
			return "";
	}

	public void setTipoDeResidencia(String value) {
		this.tipoDeResidencia = value;
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
