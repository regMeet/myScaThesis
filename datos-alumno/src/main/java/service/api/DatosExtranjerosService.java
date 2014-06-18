package service.api;

import javax.jws.WebParam;

import entity.datosAlumno.datosExtranjeros.DatosExtranjeros;

public interface DatosExtranjerosService {

	DatosExtranjeros getDatosExtranjeros(@WebParam(name = "dniAlumno") String dniAlumno);

}
