package service.lib;

import entity.datosAlumno.datosCondicionAcademica.Carrera;
import entity.datosAlumno.datosCondicionAcademica.DatosCondicionAcademica;
import guarani.DAO.datosAlumno.DatosCondicionAcademicaDAO;
import guarani.DTO.datosAlumno.datosCondicionAcademica.CarreraDTO;
import guarani.DTO.datosAlumno.datosCondicionAcademica.DatosCondicionAcademicaDTO;

import java.util.ArrayList;
import java.util.List;

import org.osoa.sca.annotations.Service;

import service.api.DatosCondicionAcademicaService;

@Service(DatosCondicionAcademicaService.class)
public class DatosCondicionAcademicaServiceImpl implements DatosCondicionAcademicaService {
	private final DatosCondicionAcademicaDAO datosCondicionAcademicaDAO;

	public DatosCondicionAcademicaServiceImpl(DatosCondicionAcademicaDAO datosCondicionAcademicaDAO) {
		this.datosCondicionAcademicaDAO = datosCondicionAcademicaDAO;
	}

	@Override
	public DatosCondicionAcademica getDatosCondicionAcademica(String dniAlumno) {
		DatosCondicionAcademicaDTO dto = datosCondicionAcademicaDAO.getDatosCondicionAcademica(dniAlumno);
		List<CarreraDTO> carrerasDTO = dto.getCarreras();

		DatosCondicionAcademica datos = new DatosCondicionAcademica();
		List<Carrera> carreras = getCarreras(carrerasDTO);
		datos.setCarreras(carreras);
		
		return datos;
	}

	/**
	 * Transforms a List<CarreraDTO> into a List<Carrera>
	 * @param List<CarreraDTO>
	 * @return List<Carrera>
	 */
	private List<Carrera> getCarreras(List<CarreraDTO> carrerasDTO) {
		List<Carrera> carreras = null;

		if (carrerasDTO != null) {
			carreras = new ArrayList<Carrera>();
			for (CarreraDTO carreraDTO : carrerasDTO) {
				Carrera carrera = new Carrera();
				
				carrera.setCodigoCarrera(carreraDTO.getCodigoCarrera());
				carrera.setNombreCarrera(carreraDTO.getNombreCarrera());
				carrera.setUltimaReincripcion(carreraDTO.getUltimaReincripcion());
				carrera.setEgresado(carreraDTO.getEgresado());
				carrera.setActivo(carreraDTO.getActivo());
				carrera.setFechaUltimoExamen(carreraDTO.getFechaUltimoExamen());
				carreras.add(carrera);
			}
		}

		return carreras;
	}
}
