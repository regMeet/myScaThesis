package tesis.android.entities;

import java.util.Hashtable;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class DatosSocioEconomicos implements KvmSerializable {

	protected DatosSocioEconomicosGenerales datosSocioEconomicosGenerales;
	protected DatosSocioEconomicosSalud datosSocioEconomicosSalud;
	protected DatosSocioEconomicosSituacionLaboralPadres datosSocioEconomicosSituacionLaboralPadres;
	protected DatosSocioEconomicosSituacionLaboralPersonal datosSocioEconomicosSituacionLaboralPersonal;

	public DatosSocioEconomicos(SoapObject obj) {
		this.datosSocioEconomicosGenerales = new DatosSocioEconomicosGenerales((SoapObject) obj.getProperty("datosSocioEconomicosGenerales"));
		this.datosSocioEconomicosSalud = new DatosSocioEconomicosSalud((SoapObject) obj.getProperty("datosSocioEconomicosSalud"));
		this.datosSocioEconomicosSituacionLaboralPersonal = new DatosSocioEconomicosSituacionLaboralPersonal((SoapObject) obj.getProperty("datosSocioEconomicosSituacionLaboralPersonal"));
		this.datosSocioEconomicosSituacionLaboralPadres = new DatosSocioEconomicosSituacionLaboralPadres((SoapObject) obj.getProperty("datosSocioEconomicosSituacionLaboralPadres"));
	}

	public DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales() {
		return datosSocioEconomicosGenerales;
	}

	public void setDatosSocioEconomicosGenerales(
			DatosSocioEconomicosGenerales value) {
		this.datosSocioEconomicosGenerales = value;
	}

	public DatosSocioEconomicosSalud getDatosSocioEconomicosSalud() {
		return datosSocioEconomicosSalud;
	}

	public void setDatosSocioEconomicosSalud(DatosSocioEconomicosSalud value) {
		this.datosSocioEconomicosSalud = value;
	}

	public DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres() {
		return datosSocioEconomicosSituacionLaboralPadres;
	}

	public void setDatosSocioEconomicosSituacionLaboralPadres(
			DatosSocioEconomicosSituacionLaboralPadres value) {
		this.datosSocioEconomicosSituacionLaboralPadres = value;
	}

	public DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal() {
		return datosSocioEconomicosSituacionLaboralPersonal;
	}

	public void setDatosSocioEconomicosSituacionLaboralPersonal(
			DatosSocioEconomicosSituacionLaboralPersonal value) {
		this.datosSocioEconomicosSituacionLaboralPersonal = value;
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
