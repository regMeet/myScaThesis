package guarani.DAO.datosAlumno;

import guarani.Conexion.ConexionInformix;
import guarani.Conexion.PA;
import guarani.DTO.datosAlumno.datosCondicionAcademica.DatosCondicionAcademicaDTO;
import guarani.Transformer.DatosCondicionAcademicaTransformer;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatosCondicionAcademicaDAO {
	 private Connection conexion;

	public DatosCondicionAcademicaDAO() {
		 conexion = ConexionInformix.getConexion();
	}

	public DatosCondicionAcademicaDTO getDatosCondicionAcademica(String dniAlumno) {
		 ResultSet rs = PA.getPA(conexion, PA.DATOS_CONDICION_ACADEMICA, dniAlumno);

		return DatosCondicionAcademicaTransformer.getDatosCondicionAcadmica(rs);
	}
}
