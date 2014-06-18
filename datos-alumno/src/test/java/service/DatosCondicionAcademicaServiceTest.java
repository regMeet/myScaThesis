package service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.api.DatosCondicionAcademicaService;
import entity.datosAlumno.datosCondicionAcademica.Carrera;
import entity.datosAlumno.datosCondicionAcademica.DatosCondicionAcademica;

public class DatosCondicionAcademicaServiceTest {

	private static final String APPLICATION_CONTEXT_UNIT_TEST_XML = "ApplicationContext-UnitTest.xml";
	private static final String DATOS_CONDICION_ACADEMICA = "datosCondicionAcademicaService";

	private DatosCondicionAcademicaService datosCondicionAcademicaService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_UNIT_TEST_XML);
		datosCondicionAcademicaService = (DatosCondicionAcademicaService) context.getBean(DATOS_CONDICION_ACADEMICA);
	}

	@Test
	public void testDatosCondicionAcademica() throws Exception {
		String dniAlumno = "32175766";
		DatosCondicionAcademica datosCondicionAcademica = datosCondicionAcademicaService.getDatosCondicionAcademica(dniAlumno);

		List<Carrera> carreras = datosCondicionAcademica.getCarreras();
		
		for (Carrera carrera : carreras) {
			String codigoCarrera = carrera.getCodigoCarrera();
			String nombreCarrera = carrera.getNombreCarrera();
			int ultimaReincripcion = carrera.getUltimaReincripcion();
			String egresado = carrera.getEgresado();
			String activo = carrera.getActivo();
			String fechaUltimoExamen = carrera.getFechaUltimoExamen();
			
			System.out.println(codigoCarrera);
			System.out.println(nombreCarrera);
			System.out.println(ultimaReincripcion);
			System.out.println(egresado);
			System.out.println(activo);
			System.out.println(fechaUltimoExamen);
			
			assertNotNull("Codigo carrera should not be null", codigoCarrera);
			assertNotNull("Nombre carrera should not be null", nombreCarrera);
			assertNotNull("ultimaReincripcion should not be null", ultimaReincripcion);
			assertNotNull("egresado should not be null", egresado);
			assertNotNull("activo should not be null", activo);
			assertNotNull("fechaUltimoExamen should not be null", fechaUltimoExamen);
			
		}
	}

}
