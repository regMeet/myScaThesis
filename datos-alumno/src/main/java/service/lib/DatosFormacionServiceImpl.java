package service.lib;

import entity.datosAlumno.datosFormacion.DatosFormacion;
import entity.datosAlumno.datosFormacion.DatosFormacionSecundaria;
import entity.datosAlumno.datosFormacion.DatosFormacionSuperior;
import guarani.DAO.datosAlumno.DatosFormacionDAO;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionDTO;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionSecundariaDTO;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionSuperiorDTO;

import org.osoa.sca.annotations.Service;

import service.api.DatosFormacionService;

@Service(DatosFormacionService.class)
public class DatosFormacionServiceImpl implements DatosFormacionService {
	private final DatosFormacionDAO datosFormacionDAO;

	public DatosFormacionServiceImpl(DatosFormacionDAO datosFormacionDAO) {
		this.datosFormacionDAO = datosFormacionDAO;
	}

	@Override
	public DatosFormacion getDatosFormacion(String dniAlumno) {
		DatosFormacionDTO dto = datosFormacionDAO.getDatosFormacion(dniAlumno);

		DatosFormacion datos = new DatosFormacion();

		datos.setIdiomas(dto.getIdiomas());
		datos.setDatosFormacionSecundaria(transformDTO(dto.getDatosFormacionSecundaria()));
		datos.setDatosFormacionSuperior(transformDTO(dto.getDatosFormacionSuperior()));

		return datos;
	}

	@Override
	public DatosFormacionSecundaria getDatosFormacionSecundaria(String dniAlumno) {
		DatosFormacionSecundariaDTO dto = datosFormacionDAO.getDatosFormacionSecundaria(dniAlumno);
		DatosFormacionSecundaria datos = transformDTO(dto);
		return datos;
	}

	/**
	 * Transforms DatosFormacionSecundariaDTO into a DatosFormacionSecundaria
	 * 
	 * @param DatosFormacionSecundariaDTO
	 * @return DatosFormacionSecundaria
	 */
	private DatosFormacionSecundaria transformDTO(DatosFormacionSecundariaDTO dto) {
		DatosFormacionSecundaria datos = new DatosFormacionSecundaria();

		datos.setCodigoColegioSecundario(dto.getCodigoColegioSecundario());
		datos.setNombreColegioSecundario(dto.getNombreColegioSecundario());
		datos.setCodigoTituloSecundario(dto.getCodigoTituloSecundario());
		datos.setNombreTituloSecundario(dto.getNombreTituloSecundario());
		datos.setOrientacionVocacionalRecibida(dto.getOrientacionVocacionalRecibida());
		datos.setAnioEgresoSecundario(dto.getAnioEgresoSecundario());

		return datos;
	}

	@Override
	public DatosFormacionSuperior getDatosFormacionSuperior(String dniAlumno) {
		DatosFormacionSuperiorDTO dto = datosFormacionDAO.getDatosFormacionSuperior(dniAlumno);
		DatosFormacionSuperior datos = transformDTO(dto);
		return datos;
	}

	/**
	 * Transforms DatosFormacionSuperiorDTO into a DatosFormacionSuperior
	 * 
	 * @param DatosFormacionSuperiorDTO
	 * @return
	 * @return DatosFormacionSuperior
	 */
	private DatosFormacionSuperior transformDTO(DatosFormacionSuperiorDTO dto) {
		DatosFormacionSuperior datos = new DatosFormacionSuperior();

		datos.setTipo(dto.getTipo());
		datos.setArea(dto.getArea());
		datos.setCarrera(dto.getCarrera());
		datos.setEstablecimiento(dto.getEstablecimiento());
		datos.setNivel(dto.getNivel());
		datos.setAnioEgreso(dto.getAnioEgreso());
		return datos;
	}

}
