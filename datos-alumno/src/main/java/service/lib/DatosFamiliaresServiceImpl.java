package service.lib;

import entity.datosAlumno.datosFamiliares.DatosFamiliares;
import guarani.DAO.datosAlumno.DatosFamiliaresDAO;
import guarani.DTO.datosAlumno.datosFamiliares.DatosFamiliaresDTO;

import org.osoa.sca.annotations.Service;

import service.api.DatosFamiliaresService;

@Service(DatosFamiliaresService.class)
public class DatosFamiliaresServiceImpl implements DatosFamiliaresService {
	private final DatosFamiliaresDAO datosFamiliaresDAO;

	public DatosFamiliaresServiceImpl(DatosFamiliaresDAO datosFamiliaresDAO) {
		this.datosFamiliaresDAO = datosFamiliaresDAO;
	}

	@Override
	public DatosFamiliares getDatosFamiliares(String dniAlumno) {
		DatosFamiliaresDTO dto = datosFamiliaresDAO.getDatosFamiliares(dniAlumno);

		DatosFamiliares datos = new DatosFamiliares();

		datos.setEstadoCivil(dto.getEstadoCivil());
		datos.setCantidadDeHijos(dto.getCantidadDeHijos());
		datos.setCantidadDeHijosACargo(dto.getCantidadDeHijosACargo());
		datos.setConQuienVive(dto.getConQuienVive());

		return datos;
	}
}
