package tesis.android.entities;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosSocioEconomicosSalud implements KvmSerializable{

	protected String coberturaDeSalud;
	protected List<String> deportes;
	protected List<String> lugaresPractica;
	protected String practicaDeporte;

	public DatosSocioEconomicosSalud(SoapObject obj) {
		
		List<String> deportes = new ArrayList<String>();
		List<String> lugaresPractica = new ArrayList<String>();
		
		for (int i = 0; i < obj.getPropertyCount(); i++) {

			PropertyInfo property = new PropertyInfo();
			obj.getPropertyInfo(i, property);
			property.getName();
			
			if (property.getName().equals("deportes")) {
				deportes.add(obj.getProperty(i).toString());
			}
			
			if (property.getName().equals("lugaresPractica")) {
				lugaresPractica.add(obj.getProperty(i).toString());
			}

		}
		
		this.deportes = deportes;
		this.lugaresPractica = lugaresPractica;
		this.coberturaDeSalud = obj.getProperty("coberturaDeSalud").toString();
		this.practicaDeporte =  obj.getProperty("practicaDeporte").toString();
				
	}
	
	public String getCoberturaDeSalud() {
		return coberturaDeSalud;
	}

	public void setCoberturaDeSalud(String value) {
		this.coberturaDeSalud = value;
	}

	public List<String> getDeportes() {
		if (deportes == null) {
			deportes = new ArrayList<String>();
		}
		return this.deportes;
	}

	public List<String> getLugaresPractica() {
		if (lugaresPractica == null) {
			lugaresPractica = new ArrayList<String>();
		}
		return this.lugaresPractica;
	}

	public String getPracticaDeporte() {
		return practicaDeporte;
	}

	public void setPracticaDeporte(String value) {
		this.practicaDeporte = value;
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
