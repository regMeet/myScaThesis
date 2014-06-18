package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosPrincipales implements KvmSerializable {

	protected String apellido;
	protected String cuil;
	protected String dni;
	protected String email;
	protected String fechaDeNacimiento;
	protected String genero;
	protected String nacionalidad;
	protected String nombre;
	protected String telefonoFijo;
	protected String telefonoMovil;

	public DatosPrincipales(SoapObject obj) {

		this.apellido = obj.getPropertySafelyAsString("apellido");
		this.cuil = obj.getPropertySafelyAsString("cuil");
		this.dni = obj.getPropertySafelyAsString("dni");
		this.email = obj.getPropertySafelyAsString("email");
		this.fechaDeNacimiento = obj.getPropertySafelyAsString("fechaDeNacimiento");
		this.genero = obj.getPropertySafelyAsString("genero");
		this.nacionalidad = obj.getPropertySafelyAsString("nacionalidad");
		this.nombre = obj.getPropertySafelyAsString("nombre");
		this.telefonoFijo = obj.getPropertySafelyAsString("telefonoFijo");
		this.telefonoMovil = obj.getPropertySafelyAsString("telefonoMovil");

	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String value) {
		this.apellido = value;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String value) {
		this.cuil = value;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String value) {
		this.dni = value;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String value) {
		this.fechaDeNacimiento = value;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String value) {
		this.genero = value;
	}

	public String getNacionalidad() {
		if(!nacionalidad.equals("anyType{}")){
			return nacionalidad;
		}else return "";
	}

	public void setNacionalidad(String value) {
		this.nacionalidad = value;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String value) {
		this.nombre = value;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String value) {
		this.telefonoFijo = value;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String value) {
		this.telefonoMovil = value;
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
