package guarani.Transformer;

import guarani.DTO.datosAlumno.datosFamiliares.DatosFamiliaresDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DatosFamiliaresTransformer extends PATransformer {

	public static DatosFamiliaresDTO getDatosFamiliares(ResultSet rs) {
		DatosFamiliaresDTO datosFamiliares = null;
		// Columna 1 (tipo: varchar) (nombre: estado civil) valor: Soltero
		// Columna 2 (tipo: varchar) (nombre: hijos) valor: No tiene
		// Columna 3 (tipo: varchar) (nombre: hijos a cargo) valor: No tiene
		// Columna 4 (tipo: varchar) (nombre: con quien vive) valor: Con familia de origen (padres, hermanos, abuelos)

		if (rs != null) {
			try {
				rs.next();
				String estadoCivil = rs.getString(1);
				String cantidadDeHijos = rs.getString(2);
				String cantidadDeHijosACargo = rs.getString(3);
				String conQuienVive = rs.getString(4);

				datosFamiliares = new DatosFamiliaresDTO(estadoCivil, cantidadDeHijos, cantidadDeHijosACargo,
						conQuienVive);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return datosFamiliares;
	}

}
