package entity.datosAlumno.datosCondicionAcademica;

public class Carrera {
	private String codigoCarrera;
	private String nombreCarrera;
	private int ultimaReincripcion;
	private String egresado;
	private String activo;
	private String fechaUltimoExamen;

	public Carrera() {
	}

	public String getCodigoCarrera() {
		return codigoCarrera;
	}

	public void setCodigoCarrera(String codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getUltimaReincripcion() {
		return ultimaReincripcion;
	}

	public void setUltimaReincripcion(int ultimaReincripcion) {
		this.ultimaReincripcion = ultimaReincripcion;
	}

	public String getEgresado() {
		return egresado;
	}

	public void setEgresado(String egresado) {
		this.egresado = egresado;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getFechaUltimoExamen() {
		return fechaUltimoExamen;
	}

	public void setFechaUltimoExamen(String fechaUltimoExamen) {
		this.fechaUltimoExamen = fechaUltimoExamen;
	}

}
