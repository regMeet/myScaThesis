package guarani.DTO.datosAlumno.datosCondicionAcademica;

import java.util.ArrayList;
import java.util.List;

public class DatosCondicionAcademicaDTO {
	List<CarreraDTO> carreras;

	public DatosCondicionAcademicaDTO() {
	}

	public List<CarreraDTO> getCarreras() {
		if (carreras == null) {
			carreras = new ArrayList<CarreraDTO>();
		}

		return carreras;
	}
}
