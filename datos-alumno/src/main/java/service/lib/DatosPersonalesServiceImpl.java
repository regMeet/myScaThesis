package service.lib;

import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import service.api.DatosCondicionAcademicaService;
import service.api.DatosExtranjerosService;
import service.api.DatosFamiliaresService;
import service.api.DatosFormacionService;
import service.api.DatosPersonalesService;
import service.api.DatosPrincipalesService;
import service.api.DatosSocioEconomicosService;
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

@Service(DatosPersonalesService.class)
public class DatosPersonalesServiceImpl implements DatosPersonalesService {

	private DatosPrincipalesService datosPrincipalesService;
	private DatosFamiliaresService datosFamiliaresService;
	private DatosFormacionService datosFormacionService;
	private DatosExtranjerosService datosExtranjerosService;
	private DatosSocioEconomicosService datosSocioEconomicosService;
	private DatosCondicionAcademicaService datosCondicionAcademicaService;

	@Override
	public DatosPersonales getDatosPersonales(String dniAlumno) {
		DatosPersonales datosPersonales = new DatosPersonales();

		datosPersonales.setDatosPrincipales(getDatosPrincipales(dniAlumno));
		datosPersonales.setDatosFamiliares(getDatosFamiliares(dniAlumno));
		datosPersonales.setDatosExtranjeros(getDatosExtranjeros(dniAlumno));
		datosPersonales.setDatosFormacion(getDatosFormacion(dniAlumno));
		datosPersonales.setDatosSocioEconomicos(getDatosSocioEconomicos(dniAlumno));
		datosPersonales.setDatosCondicionAcademica(getDatosCondicionAcademica(dniAlumno));

		return datosPersonales;
	}

	@Override
	public DatosPrincipales getDatosPrincipales(String dniAlumno) {
		return datosPrincipalesService.getDatosPrincipales(dniAlumno);
	}

	@Override
	public DatosDomicilio getDatosDomicilio(String dniAlumno) {
		return datosPrincipalesService.getDatosDomicilio(dniAlumno);
	}

	@Override
	public DatosFamiliares getDatosFamiliares(String dniAlumno) {
		return datosFamiliaresService.getDatosFamiliares(dniAlumno);
	}

	@Override
	public DatosExtranjeros getDatosExtranjeros(String dniAlumno) {
		return datosExtranjerosService.getDatosExtranjeros(dniAlumno);
	}

	@Override
	public DatosFormacion getDatosFormacion(String dniAlumno) {
		return datosFormacionService.getDatosFormacion(dniAlumno);
	}

	@Override
	public DatosFormacionSecundaria getDatosFormacionSecundaria(String dniAlumno) {
		return datosFormacionService.getDatosFormacionSecundaria(dniAlumno);
	}

	@Override
	public DatosFormacionSuperior getDatosFormacionSuperior(String dniAlumno) {
		return datosFormacionService.getDatosFormacionSuperior(dniAlumno);
	}

	@Override
	public DatosSocioEconomicos getDatosSocioEconomicos(String dniAlumno) {

		return datosSocioEconomicosService.getDatosSocioEconomicos(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales(String dniAlumno) {

		return datosSocioEconomicosService.getDatosSocioEconomicosGenerales(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosSalud getDatosSocioEconomicosSalud(String dniAlumno) {
		return datosSocioEconomicosService.getDatosSocioEconomicosSalud(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres(String dniAlumno) {
		return datosSocioEconomicosService.getDatosSocioEconomicosSituacionLaboralPadres(dniAlumno);
	}

	@Override
	public DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal(String dniAlumno) {
		return datosSocioEconomicosService.getDatosSocioEconomicosSituacionLaboralPersonal(dniAlumno);
	}

	@Override
	public DatosCondicionAcademica getDatosCondicionAcademica(String dniAlumno) {
		return datosCondicionAcademicaService.getDatosCondicionAcademica(dniAlumno);
	}

	@Reference
	public void setDatosPrincipalesService(DatosPrincipalesService datosPrincipalesService) {
		this.datosPrincipalesService = datosPrincipalesService;
	}

	@Reference
	public void setDatosFamiliaresService(DatosFamiliaresService datosFamiliaresService) {
		this.datosFamiliaresService = datosFamiliaresService;
	}

	@Reference
	public void setDatosFormacionService(DatosFormacionService datosFormacionService) {
		this.datosFormacionService = datosFormacionService;
	}

	@Reference
	public void setDatosExtranjerosService(DatosExtranjerosService datosExtranjerosService) {
		this.datosExtranjerosService = datosExtranjerosService;
	}

	@Reference
	public void setDatosSocioEconomicosService(DatosSocioEconomicosService datosSocioEconomicosService) {
		this.datosSocioEconomicosService = datosSocioEconomicosService;
	}

	@Reference
	public void setDatosCondicionAcademicaService(DatosCondicionAcademicaService datosCondicionAcademicaService) {
		this.datosCondicionAcademicaService = datosCondicionAcademicaService;
	}

}
