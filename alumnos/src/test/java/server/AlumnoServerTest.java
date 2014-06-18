package server;

import junit.framework.TestCase;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import service.api.AlumnoService;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;

public class AlumnoServerTest extends TestCase {
	private AlumnoService service;
	private SCADomain scaDomain;

	@Before
	protected void setUp() throws Exception {
		scaDomain = SCADomain.newInstance("alumno.composite");
		service = scaDomain.getService(AlumnoService.class, "AlumnoServiceComponent");
	}

	@Test
	public void testDatosPrincipales() {
		String dniAlumno = "32450266";
		DatosPrincipales DatosPrincipales = service.getDatosPrincipales(dniAlumno);
		System.out.println("LastName: " + DatosPrincipales.getApellido());
	}

	@After
	protected void tearDown() {
		scaDomain.close();
		System.out.println("Close Domain");
	}
}
