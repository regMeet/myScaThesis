package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosDomicilio implements KvmSerializable {

	protected String calle;
	protected int codigoPostal;
	protected String departamento;
	protected String edificio;
	protected String localidad;
	protected String numero;
	protected String piso;

	public DatosDomicilio(SoapObject obj) {
		this.calle = obj.getPropertySafelyAsString("calle");
		this.departamento = obj.getPropertySafelyAsString("departamento");
		this.edificio = obj.getPropertySafelyAsString("edificio");
		this.localidad = obj.getPropertySafelyAsString("localidad");
		this.numero = obj.getPropertySafelyAsString("numero");
		this.piso = obj.getPropertySafelyAsString("piso");
		this.codigoPostal = Integer.parseInt(obj.getPropertySafelyAsString("codigoPostal"));
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String value) {
		this.calle = value;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int value) {
		this.codigoPostal = value;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String value) {
		this.departamento = value;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String value) {
		this.edificio = value;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String value) {
		this.localidad = value;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String value) {
		this.numero = value;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String value) {
		this.piso = value;
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
