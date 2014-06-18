package Guarani;

import static org.junit.Assert.assertNotNull;
import guarani.DAO.datosAlumno.DatosSocioEconomicosDAO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGeneralesDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSaludDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadresDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonalDTO;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Tests out the Main Data Service
 * 
 */
public class DatosSocioEconomicosDAOTest {
	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "guaraniBD-Context.xml";
	private static final String DATOS_SOCIO_ECONOMICOS_DAO = "datosSocioEconomicosDAO";
	private DatosSocioEconomicosDAO datosSocioEconomicosDAO;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		datosSocioEconomicosDAO = (DatosSocioEconomicosDAO) context.getBean(DATOS_SOCIO_ECONOMICOS_DAO);
	}

	@Test
	public void testMainData() throws Exception {
		String dniAlumno = "31997627";
		
		DatosSocioEconomicosDTO datosSocioEconomicos = datosSocioEconomicosDAO.getDatosSocioEconomicos(dniAlumno);
		assertNotNull("datosSocioEconomicos Should not be null", datosSocioEconomicos);
		
		DatosSocioEconomicosGeneralesDTO generales = datosSocioEconomicosDAO.getDatosSocioEconomicosGenerales(dniAlumno);
		assertNotNull("generales Should not be null", generales);
		
		DatosSocioEconomicosSaludDTO salud = datosSocioEconomicosDAO.getDatosSocioEconomicosSalud(dniAlumno);
		assertNotNull("salud Should not be null", salud);
		
		DatosSocioEconomicosSituacionLaboralPadresDTO laboralPadres = datosSocioEconomicosDAO.getDatosSocioEconomicosSituacionLaboralPadres(dniAlumno);
		assertNotNull("laboralPadres Should not be null", laboralPadres);
		
		DatosSocioEconomicosSituacionLaboralPersonalDTO laboralPersonal = datosSocioEconomicosDAO.getDatosSocioEconomicosSituacionLaboralPersonal(dniAlumno);
		assertNotNull("laboralPersonal Should not be null", laboralPersonal);
	}

}
