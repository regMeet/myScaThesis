package guarani.DTO.datosAlumno.datosFamiliares;

public class DatosFamiliaresDTO {

	private String estadoCivil;
	private String cantidadDeHijos;
	private String cantidadDeHijosACargo;
	private String conQuienVive;

	public DatosFamiliaresDTO(String estadoCivil, String cantidadDeHijos, String cantidadDeHijosACargo,
			String conQuienVive) {
		super();
		this.estadoCivil = estadoCivil;
		this.cantidadDeHijos = cantidadDeHijos;
		this.cantidadDeHijosACargo = cantidadDeHijosACargo;
		this.conQuienVive = conQuienVive;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public String getCantidadDeHijosACargo() {
		return cantidadDeHijosACargo;
	}

	public String getConQuienVive() {
		return conQuienVive;
	}

}