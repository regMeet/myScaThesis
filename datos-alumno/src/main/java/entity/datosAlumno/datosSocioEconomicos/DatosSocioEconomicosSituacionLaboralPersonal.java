package entity.datosAlumno.datosSocioEconomicos;


public class DatosSocioEconomicosSituacionLaboralPersonal {

	private DatosLaborales datosDeTrabajo;
	private String trabajoQueHaceElAlumno;
	private String empresaFamiliar;
	private String horasSemanales;
	private String remuneracion;
	private String descuentoJubilatorios;
	private String tareaQueRealiza;

	public DatosSocioEconomicosSituacionLaboralPersonal() {
	}

	public DatosLaborales getDatosDeTrabajo() {
		return datosDeTrabajo;
	}

	public void setDatosDeTrabajo(DatosLaborales datosTrabajo) {
		this.datosDeTrabajo = datosTrabajo;
	}

	public String getTrabajoQueHaceElAlumno() {
		return trabajoQueHaceElAlumno;
	}

	public void setTrabajoQueHaceElAlumno(String trabajoQueHaceElAlumno) {
		this.trabajoQueHaceElAlumno = trabajoQueHaceElAlumno;
	}

	public String getEmpresaFamiliar() {
		return empresaFamiliar;
	}

	public void setEmpresaFamiliar(String empresaFamiliar) {
		this.empresaFamiliar = empresaFamiliar;
	}

	public String getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(String horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public String getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(String remuneracion) {
		this.remuneracion = remuneracion;
	}

	public String getDescuentoJubilatorios() {
		return descuentoJubilatorios;
	}

	public void setDescuentoJubilatorios(String descuentoJubilatorios) {
		this.descuentoJubilatorios = descuentoJubilatorios;
	}

	public String getTareaQueRealiza() {
		return tareaQueRealiza;
	}

	public void setTareaQueRealiza(String tareaQueRealiza) {
		this.tareaQueRealiza = tareaQueRealiza;
	}

}
