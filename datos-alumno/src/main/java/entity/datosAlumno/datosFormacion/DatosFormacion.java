package entity.datosAlumno.datosFormacion;

import java.util.List;

public class DatosFormacion {

	private List<String> idiomas;
	private DatosFormacionSecundaria datosFormacionSecundaria;
	private DatosFormacionSuperior datosFormacionSuperior;

	public DatosFormacion(){
	}

	public List<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}

	public DatosFormacionSecundaria getDatosFormacionSecundaria() {
		return datosFormacionSecundaria;
	}

	public void setDatosFormacionSecundaria(DatosFormacionSecundaria datosFormacionSecundaria) {
		this.datosFormacionSecundaria = datosFormacionSecundaria;
	}

	public DatosFormacionSuperior getDatosFormacionSuperior() {
		return datosFormacionSuperior;
	}

	public void setDatosFormacionSuperior(DatosFormacionSuperior datosFormacionSuperior) {
		this.datosFormacionSuperior = datosFormacionSuperior;
	}

}
