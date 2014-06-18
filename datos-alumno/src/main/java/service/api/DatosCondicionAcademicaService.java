package service.api;

import javax.jws.WebParam;

import entity.datosAlumno.datosCondicionAcademica.DatosCondicionAcademica;


public interface DatosCondicionAcademicaService {

	DatosCondicionAcademica getDatosCondicionAcademica(@WebParam(name = "dniAlumno") String dniAlumno);

}
