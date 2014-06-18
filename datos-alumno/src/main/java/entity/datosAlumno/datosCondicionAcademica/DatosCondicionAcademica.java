package entity.datosAlumno.datosCondicionAcademica;

import java.util.ArrayList;
import java.util.List;

public class DatosCondicionAcademica {
	List<Carrera> carreras;

	public DatosCondicionAcademica() {
	}

	public List<Carrera> getCarreras() {
		if (carreras == null) {
			carreras = new ArrayList<Carrera>();
		}

		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

}
