package guarani.Transformer;

import guarani.DTO.datosAlumno.datosCondicionAcademica.CarreraDTO;
import guarani.DTO.datosAlumno.datosCondicionAcademica.DatosCondicionAcademicaDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DatosCondicionAcademicaTransformer extends PATransformer {

	// ws_j
	// 6 columnas
	// Columna 1 (tipo: varchar) (nombre: código carrera) valor: 601
	// Columna 2 (tipo: varchar) (nombre: nombre carrera) valor: LICENCIATURA EN MATEMATICA
	// Columna 3 (tipo: int) (nombre: última reinscripción en la carrera) valor: 0
	// Columna 4 (tipo: varchar) (nombre: egresado en la carrera) valor: No
	// Columna 5 (tipo: varchar) (nombre: activo en la carrera) valor: Si
	// Columna 6 (tipo: date) (nombre: fecha último examen en la carrera) valor: 2011-11-18
	// Columna 1 (tipo: varchar) (nombre: código carrera) valor: 621
	// Columna 2 (tipo: varchar) (nombre: nombre carrera) valor: LICENCIATURA EN FISICA
	// Columna 3 (tipo: int) (nombre: última reinscripción en la carrera) valor: 0
	// Columna 4 (tipo: varchar) (nombre: egresado en la carrera) valor: No
	// Columna 5 (tipo: varchar) (nombre: activo en la carrera) valor: Si
	// Columna 6 (tipo: date) (nombre: fecha último examen en la carrera) valor: 2011-11-18
	public static DatosCondicionAcademicaDTO getDatosCondicionAcadmica(ResultSet rs) {
		DatosCondicionAcademicaDTO datosCondicionAcademica = null;

		if (rs != null) {
			datosCondicionAcademica = new DatosCondicionAcademicaDTO();

			try {
				while (rs.next()) {
					String codigoCarrera = rs.getString(1);
					String nombreCarrera = rs.getString(2);
					int ultimaReincripcion = rs.getInt(3);
					String egresado = rs.getString(4);
					String activo = rs.getString(5);
					String fechaUltimoExamen = getDate(rs.getDate(6));

					CarreraDTO carrera = new CarreraDTO(codigoCarrera, nombreCarrera, ultimaReincripcion, egresado,
							activo, fechaUltimoExamen);

					datosCondicionAcademica.getCarreras().add(carrera);

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return datosCondicionAcademica;
	}
}
