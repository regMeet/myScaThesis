package guarani.DTO.datosAlumno.datosFormacion;

import java.util.List;

public class DatosFormacionDTO {

	private List<String> idiomas;
	private DatosFormacionSecundariaDTO datosFormacionSecundaria;
	private DatosFormacionSuperiorDTO datosFormacionSuperior;

	public DatosFormacionDTO(List<String> idiomas, DatosFormacionSecundariaDTO datosFormacionSecundaria,
			DatosFormacionSuperiorDTO datosFormacionSuperior) {
		super();
		this.idiomas = idiomas;
		this.datosFormacionSecundaria = datosFormacionSecundaria;
		this.datosFormacionSuperior = datosFormacionSuperior;
	}

	public List<String> getIdiomas() {
		return idiomas;
	}

	public DatosFormacionSecundariaDTO getDatosFormacionSecundaria() {
		return datosFormacionSecundaria;
	}

	public DatosFormacionSuperiorDTO getDatosFormacionSuperior() {
		return datosFormacionSuperior;
	}

}
