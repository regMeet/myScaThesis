package entity.datosAlumno;

import entity.datosAlumno.datosCondicionAcademica.DatosCondicionAcademica;
import entity.datosAlumno.datosExtranjeros.DatosExtranjeros;
import entity.datosAlumno.datosFamiliares.DatosFamiliares;
import entity.datosAlumno.datosFormacion.DatosFormacion;
import entity.datosAlumno.datosPrincipales.DatosDomicilio;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicos;

public class DatosPersonales {

	private DatosPrincipales datosPrincipales;
	private DatosDomicilio datosDomicilio;
	private DatosFamiliares datosFamiliares;
	private DatosExtranjeros datosExtranjeros;
	private DatosFormacion datosFormacion;
	private DatosSocioEconomicos datosSocioEconomicos;
	private DatosCondicionAcademica datosCondicionAcademica;

	public DatosPersonales() {
	}

	public DatosPrincipales getDatosPrincipales() {
		return datosPrincipales;
	}

	public void setDatosPrincipales(DatosPrincipales datosPrincipales) {
		this.datosPrincipales = datosPrincipales;
	}

	public DatosDomicilio getDatosDomicilio() {
		return datosDomicilio;
	}

	public void setDatosDomicilio(DatosDomicilio datosDomicilio) {
		this.datosDomicilio = datosDomicilio;
	}

	public DatosFamiliares getDatosFamiliares() {
		return datosFamiliares;
	}

	public void setDatosFamiliares(DatosFamiliares datosFamiliares) {
		this.datosFamiliares = datosFamiliares;
	}

	public DatosExtranjeros getDatosExtranjeros() {
		return datosExtranjeros;
	}

	public void setDatosExtranjeros(DatosExtranjeros datosExtranjeros) {
		this.datosExtranjeros = datosExtranjeros;
	}

	public DatosFormacion getDatosFormacion() {
		return datosFormacion;
	}

	public void setDatosFormacion(DatosFormacion datosFormacion) {
		this.datosFormacion = datosFormacion;
	}

	public DatosSocioEconomicos getDatosSocioEconomicos() {
		return datosSocioEconomicos;
	}

	public void setDatosSocioEconomicos(DatosSocioEconomicos datosSocioEconomicos) {
		this.datosSocioEconomicos = datosSocioEconomicos;
	}

	public DatosCondicionAcademica getDatosCondicionAcademica() {
		return datosCondicionAcademica;
	}

	public void setDatosCondicionAcademica(DatosCondicionAcademica datosCondicionAcademica) {
		this.datosCondicionAcademica = datosCondicionAcademica;
	}

}
