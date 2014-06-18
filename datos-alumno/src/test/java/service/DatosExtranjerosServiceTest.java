package service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosExtranjerosService;
import entity.datosAlumno.datosExtranjeros.DatosExtranjeros;

public class DatosExtranjerosServiceTest {
	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_EXTRANJEROS_SERVICE = "datosExtranjerosService";

	private DatosExtranjerosService DatosExtranjerosService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		DatosExtranjerosService = (DatosExtranjerosService) context.getBean(DATOS_EXTRANJEROS_SERVICE);
	}

	@Test
	public void testDatosPrincipales() throws Exception {
		String dniAlumno = "31997627";
		DatosExtranjeros DatosExtranjeros = DatosExtranjerosService.getDatosExtranjeros(dniAlumno);

		String fechaIngresoAlPais = DatosExtranjeros.getFechaIngresoAlPais();
		System.out.println("fechaIngresoAlPais: " + fechaIngresoAlPais);
		assertNotNull("fechaIngresoAlPais Should not be null", fechaIngresoAlPais);
		assertNotNull("VisaIssueDate Should not be null", DatosExtranjeros.getFechaOtorgamientoVisa());
		assertNotNull("VisaExpiryDate Should not be null", DatosExtranjeros.getFechaVencimientoVisa());
		assertNotNull("ResidenceType Should not be null", DatosExtranjeros.getTipoDeResidencia());
		assertNotNull("CheckInResidence Should not be null", DatosExtranjeros.getFechaDeOtorgamientoDeLaResidencia());
		assertNotNull("CheckOutResidence Should not be null", DatosExtranjeros.getFechaDeVencimientoDeLaResidencia());
	}
}
