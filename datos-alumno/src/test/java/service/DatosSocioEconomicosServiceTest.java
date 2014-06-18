package service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosSocioEconomicosService;
import entity.datosAlumno.datosSocioEconomicos.DatosSocioEconomicos;

public class DatosSocioEconomicosServiceTest {

	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_SOCIOECONOMICOS_SERVICE = "datosSocioEconomicosService";

	private DatosSocioEconomicosService DatosSocioEconomicosService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		DatosSocioEconomicosService = (DatosSocioEconomicosService) context.getBean(DATOS_SOCIOECONOMICOS_SERVICE);
	}

	@Test
	public void testDatosPrincipales() throws Exception {
		String dniAlumno = "31997627";
		DatosSocioEconomicos DatosSocioEconomicos = DatosSocioEconomicosService.getDatosSocioEconomicos(dniAlumno);

		assertNotNull("GeneralData Should not be null", DatosSocioEconomicos.getDatosSocioEconomicosGenerales());
		assertNotNull("HealthData Should not be null", DatosSocioEconomicos.getDatosSocioEconomicosSalud());
		assertNotNull("ParentsJobsituation Should not be null", DatosSocioEconomicos.getDatosSocioEconomicosSituacionLaboralPadres());
		assertNotNull("PersonalJobSitutation Should not be null", DatosSocioEconomicos.getDatosSocioEconomicosSituacionLaboralPersonal());

	}

}
