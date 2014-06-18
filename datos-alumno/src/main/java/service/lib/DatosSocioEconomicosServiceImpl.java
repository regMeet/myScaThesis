package service.lib;

import entity.datosAlumno.datosSocioEconomicos.DatosLaborales;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicos;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGenerales;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSalud;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadres;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonal;
import guarani.DAO.datosAlumno.DatosSocioEconomicosDAO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosLaboralesDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGeneralesDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSaludDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadresDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonalDTO;

import org.osoa.sca.annotations.Service;

import service.api.DatosSocioEconomicosService;

@Service(DatosSocioEconomicosService.class)
public class DatosSocioEconomicosServiceImpl implements DatosSocioEconomicosService {
	private final DatosSocioEconomicosDAO datosSocioEconomicosDAO;

	public DatosSocioEconomicosServiceImpl(DatosSocioEconomicosDAO datosSocioEconomicosDAO) {
		this.datosSocioEconomicosDAO = datosSocioEconomicosDAO;
	}

	@Override
	public DatosSocioEconomicos getDatosSocioEconomicos(String dniAlumno) {
		DatosSocioEconomicos datosSocioEconomicos = new DatosSocioEconomicos();

		datosSocioEconomicos.setDatosSocioEconomicosGenerales(getDatosSocioEconomicosGenerales(dniAlumno));
		datosSocioEconomicos.setDatosSocioEconomicosSalud(getDatosSocioEconomicosSalud(dniAlumno));
		datosSocioEconomicos
				.setDatosSocioEconomicosSituacionLaboralPadres(getDatosSocioEconomicosSituacionLaboralPadres(dniAlumno));
		datosSocioEconomicos
				.setDatosSocioEconomicosSituacionLaboralPersonal(getDatosSocioEconomicosSituacionLaboralPersonal(dniAlumno));

		return datosSocioEconomicos;
	}

	@Override
	public DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales(String dniAlumno) {
		DatosSocioEconomicosGeneralesDTO dto = datosSocioEconomicosDAO.getDatosSocioEconomicosGenerales(dniAlumno);

		DatosSocioEconomicosGenerales datos = new DatosSocioEconomicosGenerales();

		datos.setDisponibilidadPC(dto.getDisponibilidadPC());
		datos.setAccesoInternet(dto.getAccesoInternet());
		datos.setUsoInternet(dto.getUsoInternet());
		datos.setRegularidadAccesoInternet(dto.getRegularidadAccesoInternet());

		return datos;
	}

	@Override
	public DatosSocioEconomicosSalud getDatosSocioEconomicosSalud(String dniAlumno) {
		DatosSocioEconomicosSaludDTO dto = datosSocioEconomicosDAO.getDatosSocioEconomicosSalud(dniAlumno);

		DatosSocioEconomicosSalud datos = new DatosSocioEconomicosSalud();

		datos.setCoberturaDeSalud(dto.getCoberturaDeSalud());
		datos.setPracticaDeporte(dto.isPracticaDeporte());
		datos.setDeportes(dto.getDeportes());
		datos.setLugaresPractica(dto.getLugaresPractica());

		return datos;
	}

	@Override
	public DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres(String dniAlumno) {
		DatosSocioEconomicosSituacionLaboralPadresDTO dto = datosSocioEconomicosDAO
				.getDatosSocioEconomicosSituacionLaboralPadres(dniAlumno);

		DatosSocioEconomicosSituacionLaboralPadres datos = new DatosSocioEconomicosSituacionLaboralPadres();

		datos.setViveElPadre(dto.isViveElPadre());
		datos.setNivelDeEstudiosPadre(dto.getNivelDeEstudiosPadre());
		DatosLaboralesDTO datosDeTrabajoPadreDTO = dto.getDatosDeTrabajoPadre();
		DatosLaborales datosTrabajoPadre = getDatosTrabajo(datosDeTrabajoPadreDTO);
		datos.setDatosDeTrabajoPadre(datosTrabajoPadre);

		datos.setViveLaMadre(dto.isViveLaMadre());
		datos.setNivelDeEstudiosMadre(dto.getNivelDeEstudiosMadre());
		DatosLaboralesDTO datosDeTrabajoMadreDTO = dto.getDatosDeTrabajoMadre();
		DatosLaborales datosTrabajoMadre = getDatosTrabajo(datosDeTrabajoMadreDTO);
		datos.setDatosDeTrabajoMadre(datosTrabajoMadre);

		return datos;
	}

	@Override
	public DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal(String dniAlumno) {
		DatosSocioEconomicosSituacionLaboralPersonalDTO dto = datosSocioEconomicosDAO
				.getDatosSocioEconomicosSituacionLaboralPersonal(dniAlumno);

		DatosSocioEconomicosSituacionLaboralPersonal datos = new DatosSocioEconomicosSituacionLaboralPersonal();

		DatosLaboralesDTO datosDeTrabajoDTO = dto.getDatosDeTrabajo();
		DatosLaborales datosTrabajo = getDatosTrabajo(datosDeTrabajoDTO);
		datos.setDatosDeTrabajo(datosTrabajo);

		datos.setTrabajoQueHaceElAlumno(dto.getTrabajoQueHaceElAlumno());
		datos.setEmpresaFamiliar(dto.getEmpresaFamiliar());
		datos.setHorasSemanales(dto.getHorasSemanales());
		datos.setRemuneracion(dto.getRemuneracion());
		datos.setDescuentoJubilatorios(dto.getDescuentoJubilatorios());
		datos.setTareaQueRealiza(dto.getTareaQueRealiza());

		return datos;
	}

	/**
	 * Transforms a DatosLaboralesDTO into a DatosLaborales
	 * 
	 * @param DatosLaboralesDTO
	 * @return DatosLaborales
	 */
	private DatosLaborales getDatosTrabajo(DatosLaboralesDTO dto) {
		DatosLaborales datosLaborales = null;

		if (dto != null) {
			datosLaborales = new DatosLaborales();
			datosLaborales.setSituacionLaboral(dto.getSituacionLaboral());
			datosLaborales.setCategoriaOcupacional(dto.getCategoriaOcupacional());
			datosLaborales.setActividadEconomica(dto.getActividadEconomica());
			datosLaborales.setDetalleRamaActividadEconomica(dto.getDetalleRamaActividadEconomica());
		}

		return datosLaborales;
	}

}
