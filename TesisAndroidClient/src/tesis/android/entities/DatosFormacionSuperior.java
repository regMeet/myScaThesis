package tesis.android.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosFormacionSuperior implements KvmSerializable {

	protected String anioEgreso;
	protected String area;
	protected String carrera;
	protected String establecimiento;
	protected String nivel;
	protected String tipo;

	public DatosFormacionSuperior(SoapObject obj) {

		this.anioEgreso = obj.getPropertySafelyAsString("anioEgreso");
		this.area = obj.getPropertySafelyAsString("area");
		this.carrera = obj.getPropertySafelyAsString("carrera");
		this.establecimiento = obj.getPropertySafelyAsString("establecimiento");
		this.nivel = obj.getPropertySafelyAsString("nivel");
		this.tipo = obj.getPropertySafelyAsString("tipo");

	}

	public String getAnioEgreso() {
		return anioEgreso;
	}

	public void setAnioEgreso(String value) {
		this.anioEgreso = value;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String value) {
		this.area = value;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String value) {
		this.carrera = value;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String value) {
		this.establecimiento = value;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String value) {
		this.nivel = value;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String value) {
		this.tipo = value;
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
