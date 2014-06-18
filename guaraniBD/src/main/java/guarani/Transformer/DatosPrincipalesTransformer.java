package guarani.Transformer;

import guarani.DTO.datosAlumno.datosPrincipales.DatosDomicilioDTO;
import guarani.DTO.datosAlumno.datosPrincipales.DatosPrincipalesDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatosPrincipalesTransformer extends PATransformer {

	// Columna 1 (tipo: varchar) (nombre: apellido) valor: Apellido
	// Columna 2 (tipo: varchar) (nombre: nombre) valor: Nombres
	// Columna 3 (tipo: decimal) (nombre: dni) valor: 31997627
	// Columna 4 (tipo: varchar) (nombre: cuil) valor: 20319976273
	// Columna 5 (tipo: varchar) (nombre: genero) valor: Masculino
	// Columna 6 (tipo: varchar) (nombre: mail) valor: guarani@guarani.unc.edu.ar
	// Columna 7 (tipo: varchar) (nombre: fijo) valor: 4562171
	// Columna 8 (tipo: varchar) (nombre: movil) valor: 0-351-15-3570606
	// Columna 9 (tipo: date) (nombre: fecha nacimiento) valor: 1985-11-22
	// Columna 10 (tipo: varchar) (nombre: nacionalidad) valor:
	public static DatosPrincipalesDTO getDatosPrincipales(ResultSet rs) {
		DatosPrincipalesDTO datosPrincipales = null;

		if (rs != null) {
			try {
				rs.next();
				String apellido = rs.getString(1);
				String nombre = rs.getString(2);
				String dni = rs.getString(3);
				String cuil = rs.getString(4);
				String genero = rs.getString(5);
				String email = rs.getString(6);
				String telefonoFijo = rs.getString(7);
				String telefonoMovil = rs.getString(8);
				String fechaDeNacimiento = getDate(rs.getDate(9));
				String nacionalidad = rs.getString(10);

				datosPrincipales = new DatosPrincipalesDTO(apellido, nombre, dni, cuil, genero, email, telefonoFijo,
						telefonoMovil, fechaDeNacimiento, nacionalidad);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return datosPrincipales;
	}

	// Columna 1 (tipo: varchar) (nombre: calle) valor: SINSACATE
	// Columna 2 (tipo: varchar) (nombre: numero) valor: 2173
	// Columna 3 (tipo: varchar) (nombre: piso) valor: null
	// Columna 4 (tipo: varchar) (nombre: depto) valor: null
	// Columna 5 (tipo: varchar) (nombre: unidad ) valor: null
	// Columna 6 (tipo: varchar) (nombre: ) valor: CORDOBA
	// Columna 7 (tipo: varchar) (nombre: ) valor: 5000
	public static DatosDomicilioDTO getDatosDomicilio(ResultSet rs) {
		DatosDomicilioDTO datosDomicilio = null;
		if (rs != null) {
			try {
				rs.next();
				String calle = rs.getString(1);
				String numero = rs.getString(2);
				String piso = rs.getString(3);
				String departamento = rs.getString(4);
				String edificio = rs.getString(5);
				String localidad = rs.getString(6);
				int codigoPostal = getString(rs.getString(7));

				datosDomicilio = new DatosDomicilioDTO(calle, numero, piso, departamento, edificio, codigoPostal,
						localidad);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return datosDomicilio;
	}

}
