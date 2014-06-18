package com.tesis.guarani;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import service.api.AlumnoService;
import service.api.DatosPrincipales;

@Ignore
public class ClienteTest {
	
	private AlumnoService alumnoService;

	@Before
	public void setUp() throws Exception {
		Cliente cliente = new Cliente();
		alumnoService = cliente.getAlumnoService();
	}
	
	@Test
	public void testDatosPrincipales() {
		DatosPrincipales datosPrincipales = alumnoService.getDatosPrincipales("1234321");
		String apellido = datosPrincipales.getApellido();
		System.out.println("Apellido: " + apellido);
		
		assertNotNull("El apellido no deberia ser nulo", apellido);
		assertEquals("Los apellidos deberian coincidir", apellido, "Albertengo");
	}

}