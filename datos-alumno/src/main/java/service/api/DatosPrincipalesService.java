package service.api;

import javax.jws.WebParam;

import entity.datosAlumno.datosPrincipales.DatosDomicilio;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;

public interface DatosPrincipalesService {

	public DatosPrincipales getDatosPrincipales(@WebParam(name = "dniAlumno") String dniAlumno);

	public DatosDomicilio getDatosDomicilio(@WebParam(name = "dniAlumno") String dniAlumno);

}
