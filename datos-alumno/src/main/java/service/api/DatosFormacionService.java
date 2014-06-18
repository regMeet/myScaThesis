package service.api;

import javax.jws.WebParam;

import entity.datosAlumno.datosFormacion.DatosFormacion;
import entity.datosAlumno.datosFormacion.DatosFormacionSecundaria;
import entity.datosAlumno.datosFormacion.DatosFormacionSuperior;

public interface DatosFormacionService {

	public DatosFormacion getDatosFormacion(@WebParam(name = "dniAlumno") String dniAlumno);
	
	public DatosFormacionSecundaria getDatosFormacionSecundaria(@WebParam(name = "dniAlumno") String dniAlumno);

	public DatosFormacionSuperior getDatosFormacionSuperior(@WebParam(name = "dniAlumno") String dniAlumno);

}
