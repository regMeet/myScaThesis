package entity.datosAlumno.datosSocioEconomicos;

public class DatosSocioEconomicos {

	private DatosSocioEconomicosGenerales datosSocioEconomicosGenerales;
	private DatosSocioEconomicosSalud datosSocioEconomicosSalud;
	private DatosSocioEconomicosSituacionLaboralPadres datosSocioEconomicosSituacionLaboralPadres;
	private DatosSocioEconomicosSituacionLaboralPersonal datosSocioEconomicosSituacionLaboralPersonal;

	public DatosSocioEconomicos() {
	}

	public DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales() {
		return datosSocioEconomicosGenerales;
	}

	public void setDatosSocioEconomicosGenerales(DatosSocioEconomicosGenerales datosSocioEconomicosGenerales) {
		this.datosSocioEconomicosGenerales = datosSocioEconomicosGenerales;
	}

	public DatosSocioEconomicosSalud getDatosSocioEconomicosSalud() {
		return datosSocioEconomicosSalud;
	}

	public void setDatosSocioEconomicosSalud(DatosSocioEconomicosSalud datosSocioEconomicosSalud) {
		this.datosSocioEconomicosSalud = datosSocioEconomicosSalud;
	}

	public DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres() {
		return datosSocioEconomicosSituacionLaboralPadres;
	}

	public void setDatosSocioEconomicosSituacionLaboralPadres(
			DatosSocioEconomicosSituacionLaboralPadres datosSocioEconomicosSituacionLaboralPadres) {
		this.datosSocioEconomicosSituacionLaboralPadres = datosSocioEconomicosSituacionLaboralPadres;
	}

	public DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal() {
		return datosSocioEconomicosSituacionLaboralPersonal;
	}

	public void setDatosSocioEconomicosSituacionLaboralPersonal(
			DatosSocioEconomicosSituacionLaboralPersonal datosSocioEconomicosSituacionLaboralPersonal) {
		this.datosSocioEconomicosSituacionLaboralPersonal = datosSocioEconomicosSituacionLaboralPersonal;
	}

}
