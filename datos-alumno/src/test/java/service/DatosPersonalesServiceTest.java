package service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosPersonalesService;
import entity.datosAlumno.DatosPersonales;

public class DatosPersonalesServiceTest {

	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_PERSONALES_SERVICE = "datosPersonalesService";

	private DatosPersonalesService DatosPersonalesService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		DatosPersonalesService = (DatosPersonalesService) context.getBean(DATOS_PERSONALES_SERVICE);
	}

	@Test
	public void testDatosPrincipales() throws Exception {
		String dniAlumno = "32450266";
		DatosPersonales DatosPersonales = DatosPersonalesService.getDatosPersonales(dniAlumno);
		
		System.out.println(DatosPersonales.getDatosPrincipales().getNombre());

	}

}
