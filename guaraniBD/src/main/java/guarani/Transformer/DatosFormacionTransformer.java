package guarani.Transformer;

import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionSecundariaDTO;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionSuperiorDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class DatosFormacionTransformer extends PATransformer {

	// Columna 1 (tipo: varchar) (nombre: Conocimientos en idioma inglés) valor: Básico
	// Columna 2 (tipo: varchar) (nombre: Conocimientos en idioma francés) valor: Desconoce
	// Columna 3 (tipo: varchar) (nombre: Conocimientos en idioma portugués) valor: Desconoce
	// Columna 4 (tipo: varchar) (nombre: Conocimientos en idioma italiano) valor: Desconoce
	// Columna 5 (tipo: varchar) (nombre: Conocimientos en idioma alemán) valor: Desconoce
	// Columna 6 (tipo: varchar) (nombre: Conocimientos en otros idiomas) valor: null
	public static List<String> getDatosFormacionIdiomas(ResultSet rs) {
		List<String> idiomas = null;

		if (rs != null) {
			try {
				rs.next();
				idiomas = new ArrayList<String>();

				String ingles = rs.getString(1);
				String frances = rs.getString(2);
				String portugues = rs.getString(3);
				String italiano = rs.getString(4);
				String aleman = rs.getString(5);
				String otrosIdiomas = rs.getString(6);

				idiomas.add("Ingles: " + ingles);
				idiomas.add("Frances: " + frances);
				idiomas.add("Portugues: " + portugues);
				idiomas.add("Italiano: " + italiano);
				idiomas.add("Aleman: " + aleman);
				
				if (otrosIdiomas != null) {
					idiomas.add("Otros idiomas: " + otrosIdiomas);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return idiomas;
	}

	// Columna 1 (tipo: int) (nombre: cod colegio secundario) valor: 1402959
	// Columna 2 (tipo: varchar) (nombre: nombre colegio) valor: C.E.N.M.A. DEAN FUNES
	// Columna 3 (tipo: int) (nombre: codigo titulo sec) valor: 397
	// Columna 4 (tipo: varchar) (nombre: nombre titulo) valor: BACHILLER CON ORIENTACION EN ECONOMIA Y GESTION.
	// Columna 5 (tipo: varchar) (nombre: orientacion vocacional recibida) valor: Ninguna
	// Columna 6 (tipo: int) (nombre: año de egreso sec) valor: 2010
	public static DatosFormacionSecundariaDTO getDatosFormacionSecundaria(ResultSet rs) {

		DatosFormacionSecundariaDTO datosFormacionSecundaria = null;

		if (rs != null) {
			try {
				rs.next();
				String codigoColegioSecundario = String.valueOf(rs.getInt(1));
				String nombreColegioSecundario = rs.getString(2);
				String codigoTituloSecundario = String.valueOf(rs.getInt(3));
				String nombreTituloSecundario = rs.getString(4);
				String orientacionVocacionalRecibida = rs.getString(5);
				String anioEgresoSecundario = String.valueOf(rs.getInt(6));

				datosFormacionSecundaria = new DatosFormacionSecundariaDTO(codigoColegioSecundario,
						nombreColegioSecundario, codigoTituloSecundario, nombreTituloSecundario,
						orientacionVocacionalRecibida, anioEgresoSecundario);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosFormacionSecundaria;
	}

	// ws_l -- datos formacion
	// Columna 1 (tipo: varchar) (nombre: tipo) valor: Pública
	// Columna 2 (tipo: varchar) (nombre: area) valor: Sin especificación
	// Columna 3 (tipo: varchar) (nombre: carrera) valor: INGENIERIA CIVIL
	// Columna 4 (tipo: varchar) (nombre: establecimiento) valor: FACULTAD DE CIENCIAS EXACTAS,etc - UNC
	// Columna 5 (tipo: varchar) (nombre: estado) valor: Continúa
	// Columna 6 (tipo: varchar) (nombre: nivel) valor: Universitario
	// Columna 7 (tipo: int) (nombre: año egreso) valor: 0
	public static DatosFormacionSuperiorDTO getDatosFormacionSuperior(ResultSet rs) {

		DatosFormacionSuperiorDTO datosFormacionSuperior = null;
		if (rs != null) {
			try {
				rs.next();
				String tipo = rs.getString(1);
				String area = rs.getString(2);
				String carrera = rs.getString(3);
				String establecimiento = rs.getString(4);
				String nivel = rs.getString(6);
				String anioEgreso = String.valueOf(rs.getInt(7));

				datosFormacionSuperior = new DatosFormacionSuperiorDTO(tipo, area, carrera, establecimiento, nivel,
						anioEgreso);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosFormacionSuperior;
	}

}
