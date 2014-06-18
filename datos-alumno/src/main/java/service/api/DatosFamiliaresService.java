package service.api;

import javax.jws.WebParam;

import entity.datosAlumno.datosFamiliares.DatosFamiliares;

public interface DatosFamiliaresService {

	DatosFamiliares getDatosFamiliares(@WebParam(name = "dniAlumno") String dniAlumno);

}
