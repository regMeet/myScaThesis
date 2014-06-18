package entity.datosAlumno.datosSocioEconomicos;

public class DatosSocioEconomicosSituacionLaboralPadres {

	private boolean viveElPadre;
	private String nivelDeEstudiosPadre;
	private DatosLaborales datosDeTrabajoPadre;
	private boolean viveLaMadre;
	private String nivelDeEstudiosMadre;
	private DatosLaborales datosDeTrabajoMadre;

	public DatosSocioEconomicosSituacionLaboralPadres(){
	}

	public boolean isViveElPadre() {
		return viveElPadre;
	}

	public void setViveElPadre(boolean viveElPadre) {
		this.viveElPadre = viveElPadre;
	}

	public String getNivelDeEstudiosPadre() {
		return nivelDeEstudiosPadre;
	}

	public void setNivelDeEstudiosPadre(String nivelDeEstudiosPadre) {
		this.nivelDeEstudiosPadre = nivelDeEstudiosPadre;
	}

	public DatosLaborales getDatosDeTrabajoPadre() {
		return datosDeTrabajoPadre;
	}

	public void setDatosDeTrabajoPadre(DatosLaborales datosDeTrabajoPadre) {
		this.datosDeTrabajoPadre = datosDeTrabajoPadre;
	}

	public boolean isViveLaMadre() {
		return viveLaMadre;
	}

	public void setViveLaMadre(boolean viveLaMadre) {
		this.viveLaMadre = viveLaMadre;
	}

	public String getNivelDeEstudiosMadre() {
		return nivelDeEstudiosMadre;
	}

	public void setNivelDeEstudiosMadre(String nivelDeEstudiosMadre) {
		this.nivelDeEstudiosMadre = nivelDeEstudiosMadre;
	}

	public DatosLaborales getDatosDeTrabajoMadre() {
		return datosDeTrabajoMadre;
	}

	public void setDatosDeTrabajoMadre(DatosLaborales datosDeTrabajoMadre) {
		this.datosDeTrabajoMadre = datosDeTrabajoMadre;
	}

}
