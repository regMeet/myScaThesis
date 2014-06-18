package guarani.DTO.datosAlumno.datosPrincipales;

public class DatosPrincipalesDTO {

	private String apellido;
	private String nombre;
	private String dni;
	private String cuil;
	private String genero;
	private String email;
	private String telefonoFijo;
	private String telefonoMovil;
	private String fechaDeNacimiento;
	private String nacionalidad;

	public DatosPrincipalesDTO(String apellido, String nombre, String dni, String cuil, String genero, String email,
			String telefonoFijo, String telefonoMovil, String fechaDeNacimiento, String nacionalidad) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.cuil = cuil;
		this.genero = genero;
		this.email = email;
		this.telefonoFijo = telefonoFijo;
		this.telefonoMovil = telefonoMovil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getCuil() {
		return cuil;
	}

	public String getGenero() {
		return genero;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

}
