package service.lib;

import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import service.api.AlumnoService;
import service.api.DatosPersonalesService;
import entity.datosAlumno.DatosPersonales;
import entity.datosAlumno.datosCondicionAcademica.DatosCondicionAcademica;
import entity.datosAlumno.datosExtranjeros.DatosExtranjeros;
import entity.datosAlumno.datosFamiliares.DatosFamiliares;
import entity.datosAlumno.datosFormacion.DatosFormacion;
import entity.datosAlumno.datosFormacion.DatosFormacionSecundaria;
import entity.datosAlumno.datosFormacion.DatosFormacionSuperior;
import entity.datosAlumno.datosPrincipales.DatosDomicilio;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicos;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGenerales;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSalud;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadres;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonal;

@Service(AlumnoService.class)
public class AlumnoServiceImpl implements AlumnoService {

	private DatosPersonalesService datosPersonalesService;

	@Reference
	public void setDatosPersonalesService(DatosPersonalesService DatosPersonalesService) {
		this.datosPersonalesService = DatosPersonalesService;
	}

	@Override
	public DatosPersonales getDatosPersonales(String dniAlumno) {
		return datosPersonalesService.getDatosPersonales(dniAlumno);
	}

	@Override
	public DatosPrincipales getDatosPrincipales(String dniAlumno) {
		return datosPersonalesService.getDatosPrincipales(dniAlumno);
	}

	@Override
	public DatosDomicilio getDatosDomicilio(String dniAlumno) {
		return datosPersonalesService.getDatosDomicilio(dniAlumno);
	}

	@Override
	public DatosFamiliares getDatosFamiliares(String dniAlumno) {
		return datosPersonalesService.getDatosFamiliares(dniAlumno);
	}

	@Override
	public DatosExtranjeros getDatosExtranjeros(String dniAlumno) {
		return datosPersonalesService.getDatosExtranjeros(dniAlumno);
	}

	@Override
	public DatosFormacion getDatosFormacion(String dniAlumno) {
		return datosPersonalesService.getDatosFormacion(dniAlumno);
	}

	@Override
	public DatosFormacionSecundaria getDatosFormacionSecundaria(String dniAlumno) {
		return datosPersonalesService.getDatosFormacionSecundaria(dniAlumno);
	}

	@Override
	public DatosFormacionSuperior getDatosFormacionSuperior(String dniAlumno) {
		return datosPersonalesService.getDatosFormacionSuperior(dniAlumno);
	}

	@Override
	public DatosSocioEconomicos getDatosSocioEconomicos(String dniAlumno) {
		return datosPersonalesService.getDatosSocioEconomicos(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales(String dniAlumno) {
		return datosPersonalesService.getDatosSocioEconomicosGenerales(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosSalud getDatosSocioEconomicosSalud(String dniAlumno) {
		return datosPersonalesService.getDatosSocioEconomicosSalud(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres(String dniAlumno) {
		return datosPersonalesService.getDatosSocioEconomicosSituacionLaboralPadres(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal(String dniAlumno) {
		return datosPersonalesService.getDatosSocioEconomicosSituacionLaboralPersonal(dniAlumno);
	}

	@Override
	public DatosCondicionAcademica getDatosCondicionAcademica(String dniAlumno) {
		return datosPersonalesService.getDatosCondicionAcademica(dniAlumno);
	}

}
