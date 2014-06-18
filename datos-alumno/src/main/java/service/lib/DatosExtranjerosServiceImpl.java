package service.lib;

import entity.datosAlumno.datosExtranjeros.DatosExtranjeros;
import guarani.DAO.datosAlumno.DatosExtranjerosDAO;
import guarani.DTO.datosAlumno.datosExtranjeros.DatosExtranjerosDTO;

import org.osoa.sca.annotations.Service;

import service.api.DatosExtranjerosService;

@Service(DatosExtranjerosService.class)
public class DatosExtranjerosServiceImpl implements DatosExtranjerosService {
	private final DatosExtranjerosDAO datosExtranjerosDAO;

	public DatosExtranjerosServiceImpl(DatosExtranjerosDAO datosExtranjerosDAO) {
		this.datosExtranjerosDAO = datosExtranjerosDAO;
	}

	@Override
	public DatosExtranjeros getDatosExtranjeros(String dniAlumno) {
		DatosExtranjerosDTO dto = datosExtranjerosDAO.getDatosExtranjeros(dniAlumno);

		DatosExtranjeros datos = new DatosExtranjeros();
		
		datos.setFechaIngresoAlPais(dto.getFechaIngresoAlPais());
		datos.setFechaDeOtorgamientoDeLaResidencia(dto.getFechaDeOtorgamientoDeLaResidencia());
		datos.setFechaDeVencimientoDeLaResidencia(dto.getFechaDeVencimientoDeLaResidencia());
		datos.setTipoDeResidencia(dto.getTipoDeResidencia());
		datos.setFechaDeVencimientoDeLaResidencia(dto.getFechaDeVencimientoDeLaResidencia());
		datos.setFechaOtorgamientoVisa(dto.getFechaOtorgamientoVisa());
		datos.setFechaVencimientoVisa(dto.getFechaVencimientoVisa());
		
		return datos;
	}

}
