package service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosFamiliaresService;
import entity.datosAlumno.datosFamiliares.DatosFamiliares;

public class DatosFamiliaresServiceTest {

	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_FAMILIARES_SERVICE = "datosFamiliaresService";

	private DatosFamiliaresService DatosFamiliaresService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		DatosFamiliaresService = (DatosFamiliaresService) context.getBean(DATOS_FAMILIARES_SERVICE);
	}

	@Test
	public void testDatosFamiliares() throws Exception {
		DatosFamiliares datosFamiliares = DatosFamiliaresService.getDatosFamiliares("");

		String maritalStatus = datosFamiliares.getEstadoCivil();
		System.out.println("MaritalStatus: " + maritalStatus);
		assertNotNull("MaritalStatus Should not be null", maritalStatus);
		
		assertNotNull("NumberOfChildrens Should not be null", datosFamiliares.getCantidadDeHijos());
		assertNotNull("NumberOfSonsOncharge Should not be null", datosFamiliares.getCantidadDeHijosACargo());
		assertNotNull("LivesWith Should not be null", datosFamiliares.getConQuienVive());
	}

}
