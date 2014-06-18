package service.api;

import javax.jws.WebParam;

import org.osoa.sca.annotations.Remotable;

import entity.datosAlumno.DatosPersonales;

@Remotable
public interface DatosPersonalesService extends DatosPrincipalesService,
		DatosFamiliaresService, DatosExtranjerosService, DatosFormacionService,
		DatosSocioEconomicosService, DatosCondicionAcademicaService {

	public DatosPersonales getDatosPersonales(@WebParam(name = "dniAlumno") String dniAlumno);

}
