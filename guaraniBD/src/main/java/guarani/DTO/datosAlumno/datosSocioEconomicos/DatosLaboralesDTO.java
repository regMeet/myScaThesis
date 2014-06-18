package guarani.DTO.datosAlumno.datosSocioEconomicos;

public class DatosLaboralesDTO {

	private String situacionLaboral;
	private String categoriaOcupacional;
	private String actividadEconomica;
	private String detalleRamaActividadEconomica;

	public DatosLaboralesDTO(String situacionLaboral, String categoriaOcupacional, String actividadEconomica,
			String detalleRamaActividadEconomica) {
		super();
		this.situacionLaboral = situacionLaboral;
		this.categoriaOcupacional = categoriaOcupacional;
		this.actividadEconomica = actividadEconomica;
		this.detalleRamaActividadEconomica = detalleRamaActividadEconomica;
	}

	public String getSituacionLaboral() {
		return situacionLaboral;
	}

	public String getCategoriaOcupacional() {
		return categoriaOcupacional;
	}

	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public String getDetalleRamaActividadEconomica() {
		return detalleRamaActividadEconomica;
	}

}
