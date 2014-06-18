package guarani.Transformer;

import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosLaboralesDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosGeneralesDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSaludDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPadresDTO;
import guarani.DTO.datosAlumno.datosSocioEconomicos.DatosSocioEconomicosSituacionLaboralPersonalDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class DatosSocioEconomicosTransformer extends PATransformer {

	public static DatosSocioEconomicosGeneralesDTO getDatosSocioEconomicosGenerales(ResultSet rs) {
		DatosSocioEconomicosGeneralesDTO datosSocioEconomicosGenerales = null;

		if (rs != null) {
			try {
				rs.next();

				// Columna 1 (tipo: varchar) (nombre: Con quien vive) valor: Otros

				// Columna 2 (tipo: char) (nombre: Dispone de PC en su casa ) valor: S
				// Columna 3 (tipo: char) (nombre: Dispone de PC en el trabajo) valor: N
				// Columna 4 (tipo: char) (nombre: Dispone de PC en la universidad) valor: S
				// Columna 5 (tipo: char) (nombre: Dispone de PC en otro lugar) valor: S
				List<String> disponibilidadPC = new ArrayList<String>();
				disponibilidadPC.add("Casa: " + rs.getString(2));
				disponibilidadPC.add("Trabajo: " + rs.getString(3));
				disponibilidadPC.add("Universidad: " + rs.getString(4));
				disponibilidadPC.add("Otro lugar: " + rs.getString(5));

				// Columna 6 (tipo: char) (nombre: Accede a internet en su casa) valor: S
				// Columna 7 (tipo: char) (nombre: Accede a internet en el trabajo) valor: N
				// Columna 8 (tipo: char) (nombre: Accede a internet en la universidad) valor: S
				// Columna 9 (tipo: char) (nombre: Accede a internet en el cyber) valor: S
				// Columna 10 (tipo: char) (nombre: Accede a internet en otro lugar) valor: S
				List<String> accesoInternet = new ArrayList<String>();
				accesoInternet.add("Casa: " + rs.getString(6));
				accesoInternet.add("Trabajo: " + rs.getString(7));
				accesoInternet.add("Universidad: " + rs.getString(8));
				accesoInternet.add("Cyber: " + rs.getString(9));
				accesoInternet.add("Otro lugar: " + rs.getString(10));

				// Columna 11 (tipo: char) (nombre: Utiliza internet para chat y juegos) valor: S
				// Columna 12 (tipo: char) (nombre: Utiliza internet para capacitación ) valor: N
				// Columna 13 (tipo: char) (nombre: Utiliza internet para estudios o trabajo) valor: S
				// Columna 14 (tipo: char) (nombre: Utiliza internet para intereses personales) valor: S
				// Columna 15 (tipo: char) (nombre: Utiliza internet para correo electrónico) valor: S
				// Columna 16 (tipo: varchar) (nombre: Regularidad de acceso a internet) valor: Todos los días
				List<String> usoInternet = new ArrayList<String>();
				usoInternet.add("Chat y juegos: " + rs.getString(6));
				usoInternet.add("Capacitacion: " + rs.getString(6));
				usoInternet.add("Estudios o trabajo: " + rs.getString(6));
				usoInternet.add("Intereses personales: " + rs.getString(6));
				usoInternet.add("Correo electronico: " + rs.getString(6));

				String regularidadAccesoInternet = "diaria";

				datosSocioEconomicosGenerales = new DatosSocioEconomicosGeneralesDTO(disponibilidadPC, accesoInternet,
						usoInternet, regularidadAccesoInternet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosSocioEconomicosGenerales;
	}

	public static DatosSocioEconomicosSaludDTO getDatosSocioEconomicosSalud(ResultSet rs) {
		DatosSocioEconomicosSaludDTO datosSocioEconomicosSalud = null;

		if (rs != null) {
			try {
				rs.next();
				// Columna 1 (tipo: varchar) (nombre: Cobertura de salud) valor: Otorgada por la universidad (por ser
				// estudiante)
				String coberturaDeSalud = rs.getString(1);
				// Columna 2 (tipo: char) (nombre: Practica deportes) valor: S
				boolean practicaDeporte = getBooleanFromChar(rs.getString(2));

				// Columna 3 (tipo: char) (nombre: Practica Futbol) valor: N
				// Columna 4 (tipo: char) (nombre: Practica Basquet) valor: N
				// Columna 5 (tipo: char) (nombre: Practica Voley) valor: N
				// Columna 6 (tipo: char) (nombre: Practica Gimnasia) valor: N
				// Columna 7 (tipo: char) (nombre: Practica Tesis) valor: S
				// Columna 8 (tipo: char) (nombre: Practica Natacion) valor: S
				// Columna 9 (tipo: char) (nombre: Practica Handball) valor: N
				// Columna 10 (tipo: char) (nombre: Practica otros deportes) valor: N
				List<String> deportes = null;
				if (practicaDeporte) {
					deportes = new ArrayList<String>();
					deportes.add("Futbol: " + rs.getString(3));
					deportes.add("Basquet: " + rs.getString(4));
					deportes.add("Voley: " + rs.getString(5));
					deportes.add("Gimnasia: " + rs.getString(6));
					deportes.add("Tesis: " + rs.getString(7));
					deportes.add("Natacion: " + rs.getString(8));
					deportes.add("Handball: " + rs.getString(9));
					deportes.add("Otros: " + rs.getString(10));
				}

				// Columna 11 (tipo: char) (nombre: Lo practica en la universidad) valor: N
				// Columna 12 (tipo: char) (nombre: Lo practica en un gimnasio privado) valor: S
				// Columna 13 (tipo: char) (nombre: Lo practica en forma particular) valor: S
				// Columna 14 (tipo: char) (nombre: Lo practica en otros lugares) valor: N
				List<String> lugaresPractica = null;
				if (practicaDeporte) {
					lugaresPractica = new ArrayList<String>();
					lugaresPractica.add("Universidad: " + rs.getString(11));
					lugaresPractica.add("Gimnasio privado: " + rs.getString(12));
					lugaresPractica.add("Oarticular: " + rs.getString(13));
					lugaresPractica.add("Otros: " + rs.getString(14));
				}

				datosSocioEconomicosSalud = new DatosSocioEconomicosSaludDTO(coberturaDeSalud, practicaDeporte,
						deportes, lugaresPractica);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosSocioEconomicosSalud;
	}

	// Columna 1 (tipo: varchar) (nombre: Situación laboral del alumno) valor: null
	// Columna 2 (tipo: varchar) (nombre: Trabajo que hace el alumno) valor: Obrero o empleado (asalariado)
	// Columna 3 (tipo: varchar) (nombre: Categoria ocupacional del alumno) valor: null
	// Columna 4 (tipo: int) (nombre: Actividad económica del alumno) valor: 0
	// Columna 5 (tipo: char) (nombre: Trabaja en una empresa familiar) valor: N
	// Columna 6 (tipo: varchar) (nombre: Rama de la actividad del alumno) valor: null
	// Columna 7 (tipo: varchar) (nombre: Horas semanales que trabaja el alumno) valor: Más de 20 y menos de 35 horas
	// Columna 8 (tipo: char) (nombre: Renumeracion) valor: S
	// Columna 9 (tipo: char) (nombre: Descuentos jubilatorios) valor: N
	// Columna 10 (tipo: varchar) (nombre: Tarea que realiza) valor: AYUDANTE ALUMNO
	public static DatosSocioEconomicosSituacionLaboralPersonalDTO getDatosSocioEconomicosSituacionLaboralPersonal(
			ResultSet rs) {
		DatosSocioEconomicosSituacionLaboralPersonalDTO datosSocioEconomicosSituacionLaboralPersonal = null;

		if (rs != null) {
			try {
				rs.next();

				String situacionLaboral = rs.getString(1);
				String categoriaOcupacional = rs.getString(3);
				String actividadEconomica = String.valueOf(rs.getInt(4));
				String detalleRamaActividadEconomica = rs.getString(6);
				DatosLaboralesDTO datosDeTrabajo = new DatosLaboralesDTO(situacionLaboral, categoriaOcupacional,
						actividadEconomica, detalleRamaActividadEconomica);

				String empresaFamiliar = rs.getString(5);
				String trabajoQueHaceElAlumno = rs.getString(2);
				String horasSemanales = rs.getString(7);
				String remuneracion = rs.getString(8);
				String descuentoJubilatorios = rs.getString(9);
				String tareaQueRealiza = rs.getString(10);

				datosSocioEconomicosSituacionLaboralPersonal = new DatosSocioEconomicosSituacionLaboralPersonalDTO(
						datosDeTrabajo, trabajoQueHaceElAlumno, empresaFamiliar, horasSemanales, remuneracion,
						descuentoJubilatorios, tareaQueRealiza);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosSocioEconomicosSituacionLaboralPersonal;
	}

	public static DatosSocioEconomicosSituacionLaboralPadresDTO getDatosSocioEconomicosSituacionLaboralPadres(
			ResultSet rs) {
		DatosSocioEconomicosSituacionLaboralPadresDTO datosSocioEconomicosSituacionLaboralPadres = null;

		if (rs != null) {
			try {
				rs.next();

				DatosLaboralesDTO datosDeTrabajoPadre = null;
				String nivelEstudiosPadre = null;
				// Columna 1 (tipo: char) (nombre: vive el padre) valor: S
				boolean vivePadre = getBooleanFromChar(rs.getString(1));
				if(vivePadre){
					// Columna 2 (tipo: varchar) (nombre: nivel estudios padre) valor: Estudios secundarios incompletos
					nivelEstudiosPadre = rs.getString(2);
					// Columna 3 (tipo: varchar) (nombre: situacion laboral) valor: Ocupado
					// Columna 4 (tipo: varchar) (nombre: categoria ocupacional) valor: null
					// Columna 5 (tipo: int) (nombre: actividad economica padre) valor: 0
					// Columna 6 (tipo: varchar) (nombre: detalle de rama de actividad padre) valor: null
					String situacionLaboral = rs.getString(3);
					String categoriaOcupacional = rs.getString(4);
					String actividadEconomica = String.valueOf(rs.getInt(5));
					String detalleRamaActividadEconomica = rs.getString(6);
					datosDeTrabajoPadre = new DatosLaboralesDTO(situacionLaboral, categoriaOcupacional,
							actividadEconomica, detalleRamaActividadEconomica);
				}

				DatosLaboralesDTO datosDeTrabajoMadre = null;
				String nivelEstudiosMadre = null;
				// Columna 7 (tipo: char) (nombre: vive la madre) valor: S
				boolean viveMadre = getBooleanFromChar(rs.getString(7));
				if(viveMadre){
					// Columna 8 (tipo: varchar) (nombre: nivel estudios madre) valor: Estudios secundarios completos
					nivelEstudiosMadre = rs.getString(8);
					// Columna 9 (tipo: varchar) (nombre: situacion laboral) valor: DesOcupado
					// Columna 10 (tipo: varchar) (nombre: categoria ocupacional) valor: null
					// Columna 11 (tipo: int) (nombre: actividad economica madre) valor: 0
					// Columna 12 (tipo: varchar) (nombre: detalle de rama de actividad madre) valor: null
					String situacionLaboral = rs.getString(9);
					String categoriaOcupacional = rs.getString(10);
					String actividadEconomica = String.valueOf(rs.getInt(11));
					String detalleRamaActividadEconomica = rs.getString(12);
					datosDeTrabajoMadre = new DatosLaboralesDTO(situacionLaboral, categoriaOcupacional,
							actividadEconomica, detalleRamaActividadEconomica);
				}
				datosSocioEconomicosSituacionLaboralPadres = new DatosSocioEconomicosSituacionLaboralPadresDTO(vivePadre,
						nivelEstudiosPadre, datosDeTrabajoPadre, viveMadre, nivelEstudiosMadre, datosDeTrabajoMadre);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosSocioEconomicosSituacionLaboralPadres;
	}

}
