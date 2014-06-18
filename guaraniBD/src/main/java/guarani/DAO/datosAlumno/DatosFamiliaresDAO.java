package guarani.DAO.datosAlumno;

import guarani.Conexion.ConexionInformix;
import guarani.Conexion.PA;
import guarani.DTO.datosAlumno.datosFamiliares.DatosFamiliaresDTO;
import guarani.Transformer.DatosFamiliaresTransformer;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatosFamiliaresDAO {
	private Connection conexion;

	public DatosFamiliaresDAO() {
		conexion = ConexionInformix.getConexion();
	}

	public DatosFamiliaresDTO getDatosFamiliares(String dniAlumno) {
		// ws_b -- datos familiares
		ResultSet rs = PA.getPA(conexion, PA.DATOS_FAMILIARES, dniAlumno);

		return DatosFamiliaresTransformer.getDatosFamiliares(rs);
	}

}
