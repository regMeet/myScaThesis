package server;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import service.api.DatosPrincipalesService;
import entity.datosAlumno.datosPrincipales.DatosPrincipales;

public class DatosPrincipalesServiceTest {

	private DatosPrincipalesService DatosPrincipalesService;

	@Before
	public void setUp() throws Exception {
		DataServer dataServer = new DataServer();
		DatosPrincipalesService = dataServer.getDatosPrincipalesService();
	}

	@Test
	public void testDatosPrincipales() throws Exception {
		String dniAlumno = "32450266";
		DatosPrincipales datosPrincipales = DatosPrincipalesService.getDatosPrincipales(dniAlumno);

		String apellido = datosPrincipales.getApellido();
		System.out.println("lastName: " + apellido);
		assertNotNull("LastName Should not be null", apellido);

		String nombre = datosPrincipales.getNombre();
		System.out.println("firstName: " + nombre);
		assertNotNull("FirstName Should not be null", nombre);

		String dni = datosPrincipales.getDni();
		System.out.println("dni: " + dni);
		assertNotNull("Dni Should not be null", dni);

		assertNotNull("Cuil Should not be null", datosPrincipales.getCuil());
		assertNotNull("Genre Should not be null", datosPrincipales.getGenero());
		assertNotNull("Email Should not be null", datosPrincipales.getEmail());
		assertNotNull("Telephone Should not be null", datosPrincipales.getTelefonoFijo());
		assertNotNull("Mobile Should not be null", datosPrincipales.getTelefonoMovil());
		assertNotNull("Birthday Should not be null", datosPrincipales.getFechaDeNacimiento());
		assertNotNull("Nacionality Should not be null", datosPrincipales.getNacionalidad());

	}

}
