package Guarani;

import static org.junit.Assert.assertNotNull;
import guarani.DAO.datosAlumno.DatosPrincipalesDAO;
import guarani.DTO.datosAlumno.datosPrincipales.DatosPrincipalesDTO;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Testea el DAO de datos principales
 */
public class DatosPrincipalesDAOTest {
	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "guaraniBD-Context.xml";
	private static final String DATOS_PRINCIPALES_DAO = "datosPrincipalesDAO";
	private DatosPrincipalesDAO datosPrincipalesDAO;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		datosPrincipalesDAO = (DatosPrincipalesDAO) context.getBean(DATOS_PRINCIPALES_DAO);
	}

	@Test
	public void testMainData() throws Exception {
		String dniAlumno = "31997627";
		DatosPrincipalesDTO datosPrincipalesDTO = datosPrincipalesDAO.getDatosPrincipales(dniAlumno);

		String firstName = datosPrincipalesDTO.getNombre();
		System.out.println("firstName: " + firstName);
		assertNotNull("FirstName Should not be null", firstName);

		String lastName = datosPrincipalesDTO.getApellido();
		System.out.println("lastName: " + lastName);
		assertNotNull("LastName Should not be null", lastName);

		String dni = datosPrincipalesDTO.getDni();
		System.out.println("dni: " + dni);
		assertNotNull("Dni Should not be null", dni);

		assertNotNull("Cuil Should not be null", datosPrincipalesDTO.getCuil());
		assertNotNull("Genre Should not be null", datosPrincipalesDTO.getGenero());
		assertNotNull("Email Should not be null", datosPrincipalesDTO.getEmail());
		assertNotNull("Telephone Should not be null", datosPrincipalesDTO.getTelefonoFijo());
		assertNotNull("Mobile Should not be null", datosPrincipalesDTO.getTelefonoMovil());
		assertNotNull("Birthday Should not be null", datosPrincipalesDTO.getFechaDeNacimiento());
		assertNotNull("Nacionality Should not be null", datosPrincipalesDTO.getNacionalidad());

	}

}
