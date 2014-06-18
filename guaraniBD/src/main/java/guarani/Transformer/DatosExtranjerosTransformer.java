package guarani.Transformer;

import guarani.DTO.datosAlumno.datosExtranjeros.DatosExtranjerosDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DatosExtranjerosTransformer extends PATransformer {

	public static DatosExtranjerosDTO getDatosExtranjeros(ResultSet rs) {
		// Columna 1 (tipo: date) (nombre: ingreso al pais) valor: null
		// Columna 2 (tipo: date) (nombre: otorgamiento visa) valor: null
		// Columna 3 (tipo: date) (nombre: vencimiento visa) valor: null
		// Columna 4 (tipo: varchar) (nombre: tipo de residencia) valor:
		// Columna 5 (tipo: varchar) (nombre: ingreso por cupo) valor:
		// Columna 6 (tipo: date) (nombre: otorgamiento residencia) valor: null
		// Columna 7 (tipo: date) (nombre: vencimiento residencia) valor: null
		DatosExtranjerosDTO datosExtranjeros = null;

		if (rs != null) {
			try {
				rs.next();
				String fechaIngresoAlPais = getDate(rs.getDate(1));
				String fechaOtorgamientoVisa = getDate(rs.getDate(2));
				String fechaVencimientoVisa = getDate(rs.getDate(3));
				String tipoDeResidencia = rs.getString(5);
				String fechaDeOtorgamientoDeLaResidencia = getDate(rs.getDate(6));
				String fechaDeVencimientoDeLaResidencia = getDate(rs.getDate(7));

				datosExtranjeros = new DatosExtranjerosDTO(fechaIngresoAlPais, fechaOtorgamientoVisa,
						fechaVencimientoVisa, tipoDeResidencia, fechaDeOtorgamientoDeLaResidencia,
						fechaDeVencimientoDeLaResidencia);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return datosExtranjeros;
	}

}
