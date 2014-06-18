package com.tesis.guarani;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import service.api.AlumnoService;
import service.api.AlumnoServiceService;

public class Cliente {
	private Logger LOG = Logger.getLogger(Cliente.class);

	private static final String WSDL = "http://localhost:8081/services/AlumnoService?wsdl";
	private static final String NAMESPACE_URI = "http://api.service/";
	private static final String LOCAL_PART = "AlumnoServiceService";

	private AlumnoService alumnoService;

	public Cliente() {
		URL wsdlLocation;
		try {
			wsdlLocation = new URL(WSDL);
			QName serviceName = new QName(NAMESPACE_URI, LOCAL_PART);
			AlumnoServiceService alumnoServiceService = new AlumnoServiceService(wsdlLocation, serviceName);
			alumnoService = alumnoServiceService.getAlumnoServicePort();
		} catch (MalformedURLException e) {
			LOG.error("There is an error on the creation of the client. Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public AlumnoService getAlumnoService() {
		return alumnoService;
	}

}
