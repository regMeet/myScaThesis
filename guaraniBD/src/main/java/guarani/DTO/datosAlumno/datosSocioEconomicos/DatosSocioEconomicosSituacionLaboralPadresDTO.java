package guarani.DTO.datosAlumno.datosSocioEconomicos;

public class DatosSocioEconomicosSituacionLaboralPadresDTO {

	private boolean viveElPadre;
	private String nivelDeEstudiosPadre;
	private DatosLaboralesDTO datosDeTrabajoPadre;
	private boolean viveLaMadre;
	private String nivelDeEstudiosMadre;
	private DatosLaboralesDTO datosDeTrabajoMadre;

	public DatosSocioEconomicosSituacionLaboralPadresDTO(boolean viveElPadre, String nivelDeEstudiosPadre,
			DatosLaboralesDTO datosDeTrabajoPadre, boolean viveLaMadre, String nivelDeEstudiosMadre,
			DatosLaboralesDTO datosDeTrabajoMadre) {
		super();
		this.viveElPadre = viveElPadre;
		this.nivelDeEstudiosPadre = nivelDeEstudiosPadre;
		this.datosDeTrabajoPadre = datosDeTrabajoPadre;
		this.viveLaMadre = viveLaMadre;
		this.nivelDeEstudiosMadre = nivelDeEstudiosMadre;
		this.datosDeTrabajoMadre = datosDeTrabajoMadre;
	}

	public boolean isViveElPadre() {
		return viveElPadre;
	}

	public String getNivelDeEstudiosPadre() {
		return nivelDeEstudiosPadre;
	}

	public DatosLaboralesDTO getDatosDeTrabajoPadre() {
		return datosDeTrabajoPadre;
	}

	public boolean isViveLaMadre() {
		return viveLaMadre;
	}

	public String getNivelDeEstudiosMadre() {
		return nivelDeEstudiosMadre;
	}

	public DatosLaboralesDTO getDatosDeTrabajoMadre() {
		return datosDeTrabajoMadre;
	}

}
