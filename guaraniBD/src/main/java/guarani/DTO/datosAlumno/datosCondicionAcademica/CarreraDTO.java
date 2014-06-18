package guarani.DTO.datosAlumno.datosCondicionAcademica;

public class CarreraDTO {
	private String codigoCarrera;
	private String nombreCarrera;
	private int ultimaReincripcion;
	private String egresado;
	private String activo;
	private String fechaUltimoExamen;

	public CarreraDTO(String codigoCarrera, String nombreCarrera, int ultimaReincripcion, String egresado,
			String activo, String fechaUltimoExamen) {
		super();
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
		this.ultimaReincripcion = ultimaReincripcion;
		this.egresado = egresado;
		this.activo = activo;
		this.fechaUltimoExamen = fechaUltimoExamen;
	}

	public String getCodigoCarrera() {
		return codigoCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public int getUltimaReincripcion() {
		return ultimaReincripcion;
	}

	public String getEgresado() {
		return egresado;
	}

	public String getActivo() {
		return activo;
	}

	public String getFechaUltimoExamen() {
		return fechaUltimoExamen;
	}

}
