package guarani.DTO.datosAlumno.datosPrincipales;

public class DatosDomicilioDTO {

	private String calle;
	private String numero;
	private String piso;
	private String departamento;
	private String edificio;
	private int codigoPostal;
	private String localidad;

	public DatosDomicilioDTO(String calle, String numero, String piso, String departamento, String edificio,
			int codigoPostal, String localidad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.edificio = edificio;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
	}

	public String getCalle() {
		return calle;
	}

	public String getNumero() {
		return numero;
	}

	public String getPiso() {
		return piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getEdificio() {
		return edificio;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

}
