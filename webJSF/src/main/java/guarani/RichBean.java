package guarani;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import service.api.AlumnoService;
import service.api.AlumnoServiceService;
import service.api.DatosCondicionAcademica;
import service.api.DatosDomicilio;
import service.api.DatosExtranjeros;
import service.api.DatosFamiliares;
import service.api.DatosFormacion;
import service.api.DatosPrincipales;
import service.api.DatosSocioEconomicos;

import com.tesis.guarani.Cliente;

public class RichBean implements Serializable {

	private static final long serialVersionUID = -2403138958014741653L;
	private String name;
	private String dni;
	private boolean invalid = false;
	private DatosPrincipales datosPrincipales;
	private DatosFamiliares datosFamiliares;
	private DatosCondicionAcademica condicionAcademica;
	private DatosExtranjeros datosExtranjeros;
	private DatosDomicilio domicilio;
	private DatosFormacion formacion;
	private DatosSocioEconomicos socioEconomico;
	private String viveLaMadre = "";
	private String viveElPadre = "";
	private String practicaDeporte = "";
	private Logger LOG = Logger.getLogger(Cliente.class);

	private static final String WSDL = "http://guarani-broker-dev.unc.edu.ar:8081/services/AlumnoService?wsdl";
	private static final String NAMESPACE_URI = "http://api.service/";
	private static final String LOCAL_PART = "AlumnoServiceService";
	private boolean logged = false;
	private AlumnoService alumnoService;

	public RichBean() {
		URL wsdlLocation;
		try {
			wsdlLocation = new URL(WSDL);
			QName serviceName = new QName(NAMESPACE_URI, LOCAL_PART);
			AlumnoServiceService alumnoServiceService = new AlumnoServiceService(
					wsdlLocation, serviceName);
			alumnoService = alumnoServiceService.getAlumnoServicePort();
		} catch (MalformedURLException e) {
			LOG.error("There is an error on the creation of the client. Exception: "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

	public void login() {
		DatosPrincipales datosPrincipales = alumnoService.getDatosPrincipales(dni);
		String dni = datosPrincipales.getDni();
		
		if(dni!=null){
			this.datosPrincipales = alumnoService.getDatosPrincipales(this.dni);
			this.datosFamiliares = alumnoService.getDatosFamiliares(this.dni);
			this.condicionAcademica = alumnoService
					.getDatosCondicionAcademica(this.dni);
			this.datosExtranjeros = alumnoService.getDatosExtranjeros(this.dni);
			this.domicilio = alumnoService.getDatosDomicilio(this.dni);
			this.formacion = alumnoService.getDatosFormacion(this.dni);
			this.socioEconomico = alumnoService
					.getDatosSocioEconomicos(this.dni);
			
			if(this.socioEconomico.getDatosSocioEconomicosSituacionLaboralPadres().isViveLaMadre())
				this.viveLaMadre = "Si";
			else
				this.viveLaMadre = "No";
			
			if(this.socioEconomico.getDatosSocioEconomicosSituacionLaboralPadres().isViveElPadre())
				this.viveElPadre = "Si";
			else
				this.viveElPadre = "No";
			
			if(this.socioEconomico.getDatosSocioEconomicosSalud().isPracticaDeporte())
				this.practicaDeporte = "Si";
			else
				this.practicaDeporte = "No";
			
			this.logged = true;
			this.invalid = false;
		} else {
			this.invalid = true;
		}
	}

	public void logOut() {
		this.dni = "";
		this.logged = false;
	}

	public DatosPrincipales getDatosPrincipales() {
		return this.datosPrincipales;
	}

	public AlumnoService getAlumnoService() {
		return this.alumnoService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getLogged() {
		return logged;
	}

	public void setLogged(boolean val) {
		this.logged = val;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean getInvalid() {
		return invalid;
	}

	public DatosFamiliares getDatosFamiliares() {
		return datosFamiliares;
	}

	public void setDatosFamiliares(DatosFamiliares datosFamiliares) {
		this.datosFamiliares = datosFamiliares;
	}

	public DatosCondicionAcademica getCondicionAcademica() {
		return condicionAcademica;
	}

	public void setCondicionAcademica(DatosCondicionAcademica condicionAcademica) {
		this.condicionAcademica = condicionAcademica;
	}

	public DatosExtranjeros getDatosExtranjeros() {
		return datosExtranjeros;
	}

	public void setDatosExtranjeros(DatosExtranjeros datosExtranjeros) {
		this.datosExtranjeros = datosExtranjeros;
	}

	public DatosDomicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(DatosDomicilio domicilio) {
		this.domicilio = domicilio;
	}

	public DatosFormacion getFormacion() {
		return formacion;
	}

	public void setFormacion(DatosFormacion formacion) {
		this.formacion = formacion;
	}

	public DatosSocioEconomicos getSocioEconomico() {
		return socioEconomico;
	}

	public void setSocioEconomico(DatosSocioEconomicos socioEconomico) {
		this.socioEconomico = socioEconomico;
	}

	public void setDatosPrincipales(DatosPrincipales datosPrincipales) {
		this.datosPrincipales = datosPrincipales;
	}

	public String getViveLaMadre() {
		return viveLaMadre;
	}

	public String getViveElPadre() {
		return viveElPadre;
	}

	public String getPracticaDeporte() {
		return practicaDeporte;
	}

	
	
}
