package guarani.DTO.datosAlumno.datosFormacion;

public class DatosFormacionSuperiorDTO {

	private String tipo;
	private String area;
	private String carrera;
	private String establecimiento;
	private String nivel;
	private String anioEgreso;

	public DatosFormacionSuperiorDTO(String tipo, String area, String carrera, String establecimiento, String nivel,
			String anioEgreso) {
		super();
		this.tipo = tipo;
		this.area = area;
		this.carrera = carrera;
		this.establecimiento = establecimiento;
		this.nivel = nivel;
		this.anioEgreso = anioEgreso;
	}

	public String getTipo() {
		return tipo;
	}

	public String getArea() {
		return area;
	}

	public String getCarrera() {
		return carrera;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public String getNivel() {
		return nivel;
	}

	public String getAnioEgreso() {
		return anioEgreso;
	}

}
