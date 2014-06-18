package guarani.DAO.datosAlumno;

import guarani.Conexion.ConexionInformix;
import guarani.Conexion.PA;
import guarani.DTO.datosAlumno.datosPrincipales.DatosDomicilioDTO;
import guarani.DTO.datosAlumno.datosPrincipales.DatosPrincipalesDTO;
import guarani.Transformer.DatosPrincipalesTransformer;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatosPrincipalesDAO {
	private Connection conexion;

	public DatosPrincipalesDAO() {
		conexion = ConexionInformix.getConexion();
	}

	public DatosPrincipalesDTO getDatosPrincipales(String dniAlumno) {
		// ws_a -- datos principales
		ResultSet rs = PA.getPA(conexion, PA.DATOS_PRINCIPALES, dniAlumno);
		return DatosPrincipalesTransformer.getDatosPrincipales(rs);
	}

	public DatosDomicilioDTO getDatosDomicilio(String dniAlumno) {
		// ws_k -- datos domicilio
		ResultSet rs = PA.getPA(conexion, PA.DATOS_DOMICILIO, dniAlumno);
		return DatosPrincipalesTransformer.getDatosDomicilio(rs);
	}

}
