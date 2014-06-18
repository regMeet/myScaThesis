package service.api;

import javax.jws.WebParam;

import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicos;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGenerales;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSalud;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadres;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonal;


public interface DatosSocioEconomicosService {

	DatosSocioEconomicos getDatosSocioEconomicos(@WebParam(name = "dniAlumno") String dniAlumno);

	DatosSocioEconomicosGenerales getDatosSocioEconomicosGenerales(@WebParam(name = "dniAlumno") String dniAlumno);

	DatosSocioEconomicosSalud getDatosSocioEconomicosSalud(@WebParam(name = "dniAlumno") String dniAlumno);

	DatosSocioEconomicosSituacionLaboralPadres getDatosSocioEconomicosSituacionLaboralPadres(@WebParam(name = "dniAlumno") String dniAlumno);

	DatosSocioEconomicosSituacionLaboralPersonal getDatosSocioEconomicosSituacionLaboralPersonal(@WebParam(name = "dniAlumno") String dniAlumno);

}
