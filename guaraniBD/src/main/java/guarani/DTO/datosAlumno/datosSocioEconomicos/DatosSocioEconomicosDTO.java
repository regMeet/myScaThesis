package guarani.DTO.datosAlumno.datosSocioEconomicos;

public class DatosSocioEconomicosDTO {

	private DatosSocioEconomicosGeneralesDTO datosSocioEconomicosGenerales;
	private DatosSocioEconomicosSaludDTO datosSocioEconomicosSalud;
	private DatosSocioEconomicosSituacionLaboralPadresDTO datosSocioEconomicosSituacionLaboralPadres;
	private DatosSocioEconomicosSituacionLaboralPersonalDTO datosSocioEconomicosSituacionLaboralPersonal;

	public DatosSocioEconomicosDTO(DatosSocioEconomicosGeneralesDTO datosSocioEconomicosGenerales,
			DatosSocioEconomicosSaludDTO datosSocioEconomicosSalud,
			DatosSocioEconomicosSituacionLaboralPadresDTO datosSocioEconomicosSituacionLaboralPadres,
			DatosSocioEconomicosSituacionLaboralPersonalDTO datosSocioEconomicosSituacionLaboralPersonal) {
		super();
		this.datosSocioEconomicosGenerales = datosSocioEconomicosGenerales;
		this.datosSocioEconomicosSalud = datosSocioEconomicosSalud;
		this.datosSocioEconomicosSituacionLaboralPadres = datosSocioEconomicosSituacionLaboralPadres;
		this.datosSocioEconomicosSituacionLaboralPersonal = datosSocioEconomicosSituacionLaboralPersonal;
	}

	public DatosSocioEconomicosGeneralesDTO getDatosSocioEconomicosGenerales() {
		return datosSocioEconomicosGenerales;
	}

	public DatosSocioEconomicosSaludDTO getDatosSocioEconomicosSalud() {
		return datosSocioEconomicosSalud;
	}

	public DatosSocioEconomicosSituacionLaboralPadresDTO getDatosSocioEconomicosSituacionLaboralPadres() {
		return datosSocioEconomicosSituacionLaboralPadres;
	}

	public DatosSocioEconomicosSituacionLaboralPersonalDTO getDatosSocioEconomicosSituacionLaboralPersonal() {
		return datosSocioEconomicosSituacionLaboralPersonal;
	}

}
