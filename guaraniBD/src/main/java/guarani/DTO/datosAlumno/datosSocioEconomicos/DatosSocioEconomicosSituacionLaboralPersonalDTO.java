package guarani.DTO.datosAlumno.datosSocioEconomicos;

public class DatosSocioEconomicosSituacionLaboralPersonalDTO {

	private DatosLaboralesDTO datosDeTrabajo;
	private String trabajoQueHaceElAlumno;
	private String empresaFamiliar;
	private String horasSemanales;
	private String remuneracion;
	private String descuentoJubilatorios;
	private String tareaQueRealiza;

	public DatosSocioEconomicosSituacionLaboralPersonalDTO(DatosLaboralesDTO datosDeTrabajo,
			String trabajoQueHaceElAlumno, String empresaFamiliar, String horasSemanales, String remuneracion,
			String descuentoJubilatorios, String tareaQueRealiza) {
		this.datosDeTrabajo = datosDeTrabajo;
		this.trabajoQueHaceElAlumno = trabajoQueHaceElAlumno;
		this.empresaFamiliar = empresaFamiliar;
		this.horasSemanales = horasSemanales;
		this.remuneracion = remuneracion;
		this.descuentoJubilatorios = descuentoJubilatorios;
		this.tareaQueRealiza = tareaQueRealiza;
	}

	public DatosLaboralesDTO getDatosDeTrabajo() {
		return datosDeTrabajo;
	}

	public String getTrabajoQueHaceElAlumno() {
		return trabajoQueHaceElAlumno;
	}

	public String getEmpresaFamiliar() {
		return empresaFamiliar;
	}

	public String getHorasSemanales() {
		return horasSemanales;
	}

	public String getRemuneracion() {
		return remuneracion;
	}

	public String getDescuentoJubilatorios() {
		return descuentoJubilatorios;
	}

	public String getTareaQueRealiza() {
		return tareaQueRealiza;
	}

}
