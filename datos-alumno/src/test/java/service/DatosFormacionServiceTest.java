package service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosFormacionService;
import entity.datosAlumno.datosFormacion.DatosFormacion;

public class DatosFormacionServiceTest {

	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_FORMACION_SERVICE = "datosFormacionService";

	private DatosFormacionService DatosFormacionService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		DatosFormacionService = (DatosFormacionService) context.getBean(DATOS_FORMACION_SERVICE);
	}

	@Test
	public void testDatosPrincipales() throws Exception {
		String dniAlumno = "32450266";
		DatosFormacion DatosFormacion = DatosFormacionService.getDatosFormacion(dniAlumno);

		List<String> idiomas = DatosFormacion.getIdiomas();
		assertNotNull("idiomas no deberia ser nulo", idiomas);
		System.out.println("Primer idioma" + idiomas.get(0));

	}
}
