package service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosPrincipalesService;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;

public class DatosPrincipalesServiceTest {
	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_PRINCIPALES_SERVICE = "datosPrincipalesService";
	private DatosPrincipalesService DatosPrincipalesService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		DatosPrincipalesService = (DatosPrincipalesService) context.getBean(DATOS_PRINCIPALES_SERVICE);
	}

	@Test
	public void testDatosPrincipales() throws Exception {
		String dniAlumno = "32450266";
		DatosPrincipales DatosPrincipales = DatosPrincipalesService.getDatosPrincipales(dniAlumno);

		String nombre = DatosPrincipales.getNombre();
		System.out.println("firstName: " + nombre);
		assertNotNull("FirstName Should not be null", nombre);

		String apellido = DatosPrincipales.getApellido();
		System.out.println("lastName: " + apellido);
		assertNotNull("LastName Should not be null", apellido);

		String dni = DatosPrincipales.getDni();
		System.out.println("dni: " + dni);
		assertNotNull("Dni Should not be null", dni);

		String cuil = DatosPrincipales.getCuil();
		System.out.println("Cuil: " + cuil);
		assertNotNull("Cuil Should not be null", cuil);

		assertNotNull("Cuil Should not be null", DatosPrincipales.getCuil());
		assertNotNull("Genre Should not be null", DatosPrincipales.getGenero());
		assertNotNull("Email Should not be null", DatosPrincipales.getEmail());
		assertNotNull("Telephone Should not be null", DatosPrincipales.getTelefonoFijo());
		assertNotNull("Mobile Should not be null", DatosPrincipales.getTelefonoMovil());
		assertNotNull("Birthday Should not be null", DatosPrincipales.getFechaDeNacimiento());
		assertNotNull("Nacionality Should not be null", DatosPrincipales.getNacionalidad());

	}

}
