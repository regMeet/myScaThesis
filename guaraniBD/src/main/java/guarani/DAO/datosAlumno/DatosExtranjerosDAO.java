package guarani.DAO.datosAlumno;

import guarani.Conexion.ConexionInformix;
import guarani.Conexion.PA;
import guarani.DTO.datosAlumno.datosExtranjeros.DatosExtranjerosDTO;
import guarani.Transformer.DatosExtranjerosTransformer;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatosExtranjerosDAO {
	private Connection conexion;

	public DatosExtranjerosDAO() {
		conexion = ConexionInformix.getConexion();
	}

	public DatosExtranjerosDTO getDatosExtranjeros(String dniAlumno) {
		// ws_c -- datos extranjeros
		ResultSet rs = PA.getPA(conexion, PA.DATOS_EXTRANJEROS, dniAlumno);

		return DatosExtranjerosTransformer.getDatosExtranjeros(rs);
	}
}
