package tesis.android.entities;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosSocioEconomicosGenerales implements KvmSerializable {

	protected List<String> accesoInternet;

	protected List<String> disponibilidadPC;
	protected String regularidadAccesoInternet;

	protected List<String> usoInternet;

	public DatosSocioEconomicosGenerales(SoapObject obj) {

		List<String> accesos = new ArrayList<String>();
		List<String> disponibilidades = new ArrayList<String>();
		List<String> usos = new ArrayList<String>();
		
		for (int i = 0; i < obj.getPropertyCount(); i++) {

			PropertyInfo property = new PropertyInfo();
			obj.getPropertyInfo(i, property);
			property.getName();
			
			if (property.getName().equals("accesoInternet")) {
				accesos.add(obj.getProperty(i).toString());
			}
			
			if (property.getName().equals("disponibilidadPC")) {
				disponibilidades.add(obj.getProperty(i).toString());
			}
			
			if (property.getName().equals("usoInternet")) {
				usos.add(obj.getProperty(i).toString());
			}
			
			if (property.getName().equals("regularidadAccesoInternet")) {
				this.regularidadAccesoInternet = obj.getProperty(i).toString();
			}
			
			this.usoInternet = usos;
			this.accesoInternet = accesos;
			this.disponibilidadPC = disponibilidades;

		}
		
	}

	public List<String> getAccesoInternet() {
		if (accesoInternet == null) {
			accesoInternet = new ArrayList<String>();
		}
		return this.accesoInternet;
	}

	public List<String> getDisponibilidadPC() {
		if (disponibilidadPC == null) {
			disponibilidadPC = new ArrayList<String>();
		}
		return this.disponibilidadPC;
	}

	public String getRegularidadAccesoInternet() {
		return regularidadAccesoInternet;
	}

	public void setRegularidadAccesoInternet(String value) {
		this.regularidadAccesoInternet = value;
	}

	public List<String> getUsoInternet() {
		if (usoInternet == null) {
			usoInternet = new ArrayList<String>();
		}
		return this.usoInternet;
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
