package guarani.DAO.datosAlumno;

import guarani.Conexion.ConexionInformix;
import guarani.Conexion.PA;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGeneralesDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSaludDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadresDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonalDTO;
import guarani.Transformer.DatosSocioEconomicosTransformer;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatosSocioEconomicosDAO {
	private Connection conexion;

	public DatosSocioEconomicosDAO() {
		conexion = ConexionInformix.getConexion();
	}

	public DatosSocioEconomicosDTO getDatosSocioEconomicos(String dniAlumno) {
		DatosSocioEconomicosGeneralesDTO datosSocioEconomicosGenerales = getDatosSocioEconomicosGenerales(dniAlumno);
		DatosSocioEconomicosSaludDTO datosSocioEconomicosSalud = getDatosSocioEconomicosSalud(dniAlumno);
		DatosSocioEconomicosSituacionLaboralPadresDTO datosSocioEconomicosSituacionLaboralPadres = getDatosSocioEconomicosSituacionLaboralPadres(dniAlumno);
		DatosSocioEconomicosSituacionLaboralPersonalDTO datosSocioEconomicosSituacionLaboralPersonal = getDatosSocioEconomicosSituacionLaboralPersonal(dniAlumno);

		DatosSocioEconomicosDTO datosSocioEconomicos = new DatosSocioEconomicosDTO(datosSocioEconomicosGenerales,
				datosSocioEconomicosSalud, datosSocioEconomicosSituacionLaboralPadres,
				datosSocioEconomicosSituacionLaboralPersonal);

		return datosSocioEconomicos;
	}

	public DatosSocioEconomicosGeneralesDTO getDatosSocioEconomicosGenerales(String dniAlumno) {
		// ws_f -- socio-economico - general
		ResultSet rs = PA.getPA(conexion, PA.DATOS_SOCIO_ECONOMICOS_GENERAL, dniAlumno);

		return DatosSocioEconomicosTransformer.getDatosSocioEconomicosGenerales(rs);
	}

	public DatosSocioEconomicosSaludDTO getDatosSocioEconomicosSalud(String dniAlumno) {
		// ws_d -- socio-economico - salud
		ResultSet rs = PA.getPA(conexion, PA.DATOS_SOCIO_ECONOMICOS_SALUD, dniAlumno);

		return DatosSocioEconomicosTransformer.getDatosSocioEconomicosSalud(rs);
	}

	public DatosSocioEconomicosSituacionLaboralPadresDTO getDatosSocioEconomicosSituacionLaboralPadres(String dniAlumno) {
		// ws_g
		ResultSet rs = PA.getPA(conexion, PA.DATOS_SOCIO_ECONOMICOS_LABORAL_PADRES, dniAlumno);

		return DatosSocioEconomicosTransformer.getDatosSocioEconomicosSituacionLaboralPadres(rs);
	}

	public DatosSocioEconomicosSituacionLaboralPersonalDTO getDatosSocioEconomicosSituacionLaboralPersonal(
			String dniAlumno) {
		// ws_e
		ResultSet rs = PA.getPA(conexion, PA.DATOS_SOCIO_ECONOMICOS_LABORAL_PERSONAL, dniAlumno);

		return DatosSocioEconomicosTransformer.getDatosSocioEconomicosSituacionLaboralPersonal(rs);
	}

}
