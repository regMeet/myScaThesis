package tesis.android.entities;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosCondicionAcademica implements KvmSerializable {

	protected List<Carrera> carreras;

	public DatosCondicionAcademica(SoapObject obj)
	{
		KvmSerializable response = (KvmSerializable) obj;
		List<Carrera> carreras = new ArrayList<Carrera>();
		for(int i=0; i<response.getPropertyCount(); i++){
			Carrera carrera = new Carrera((SoapObject) response.getProperty(i));
			carreras.add(carrera);
		}
		this.carreras = carreras;		
	}
	
	public List<Carrera> getCarreras() {
		if (carreras == null) {
			carreras = new ArrayList<Carrera>();
		}
		return this.carreras;
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
