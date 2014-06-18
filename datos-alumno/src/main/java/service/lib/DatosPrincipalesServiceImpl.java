package service.lib;

import entity.datosAlumno.datosPrincipales.DatosDomicilio;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;
import guarani.DAO.datosAlumno.DatosPrincipalesDAO;
import guarani.DTO.datosAlumno.datosPrincipales.DatosDomicilioDTO;
import guarani.DTO.datosAlumno.datosPrincipales.DatosPrincipalesDTO;

import org.osoa.sca.annotations.Service;

import service.api.DatosPrincipalesService;

@Service(DatosPrincipalesService.class)
public class DatosPrincipalesServiceImpl implements DatosPrincipalesService {
	private final DatosPrincipalesDAO datosPrincipalesDAO;

	public DatosPrincipalesServiceImpl(DatosPrincipalesDAO datosPrincipalesDAO) {
		this.datosPrincipalesDAO = datosPrincipalesDAO;
	}

	@Override
	public DatosPrincipales getDatosPrincipales(String dniAlumno) {
		DatosPrincipalesDTO dto = datosPrincipalesDAO.getDatosPrincipales(dniAlumno);

		DatosPrincipales datos = new DatosPrincipales();

		datos.setApellido(dto.getApellido());
		datos.setNombre(dto.getNombre());
		datos.setDni(dto.getDni());
		datos.setCuil(dto.getCuil());
		datos.setGenero(dto.getGenero());
		datos.setEmail(dto.getEmail());
		datos.setTelefonoFijo(dto.getTelefonoFijo());
		datos.setTelefonoMovil(dto.getTelefonoMovil());
		datos.setFechaDeNacimiento(dto.getFechaDeNacimiento());
		datos.setNacionalidad(dto.getNacionalidad());

		return datos;
	}

	@Override
	public DatosDomicilio getDatosDomicilio(String dniAlumno) {
		DatosDomicilioDTO dto = datosPrincipalesDAO.getDatosDomicilio(dniAlumno);

		DatosDomicilio datos = new DatosDomicilio();

		datos.setCalle(dto.getCalle());
		datos.setNumero(dto.getNumero());
		datos.setPiso(dto.getPiso());
		datos.setDepartamento(dto.getDepartamento());
		datos.setEdificio(dto.getEdificio());
		datos.setCodigoPostal(dto.getCodigoPostal());
		datos.setLocalidad(dto.getLocalidad());

		return datos;
	}

}
