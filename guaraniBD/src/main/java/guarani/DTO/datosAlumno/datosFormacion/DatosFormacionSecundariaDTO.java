package guarani.DTO.datosAlumno.datosFormacion;

public class DatosFormacionSecundariaDTO {

	private String codigoColegioSecundario;
	private String nombreColegioSecundario;
	private String codigoTituloSecundario;
	private String nombreTituloSecundario;
	private String orientacionVocacionalRecibida;
	private String anioEgresoSecundario;

	public DatosFormacionSecundariaDTO(String codigoColegioSecundario, String nombreColegioSecundario,
			String codigoTituloSecundario, String nombreTituloSecundario, String orientacionVocacionalRecibida,
			String anioEgresoSecundario) {
		super();
		this.codigoColegioSecundario = codigoColegioSecundario;
		this.nombreColegioSecundario = nombreColegioSecundario;
		this.codigoTituloSecundario = codigoTituloSecundario;
		this.nombreTituloSecundario = nombreTituloSecundario;
		this.orientacionVocacionalRecibida = orientacionVocacionalRecibida;
		this.anioEgresoSecundario = anioEgresoSecundario;
	}

	public String getCodigoColegioSecundario() {
		return codigoColegioSecundario;
	}

	public String getNombreColegioSecundario() {
		return nombreColegioSecundario;
	}

	public String getCodigoTituloSecundario() {
		return codigoTituloSecundario;
	}

	public String getNombreTituloSecundario() {
		return nombreTituloSecundario;
	}

	public String getOrientacionVocacionalRecibida() {
		return orientacionVocacionalRecibida;
	}

	public String getAnioEgresoSecundario() {
		return anioEgresoSecundario;
	}

}
