package guarani.DAO.datosAlumno;

import guarani.Conexion.ConexionInformix;
import guarani.Conexion.PA;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionDTO;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionSecundariaDTO;
import guarani.DTO.datosAlumno.datosFormacion.DatosFormacionSuperiorDTO;
import guarani.Transformer.DatosFormacionTransformer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class DatosFormacionDAO {
	private Connection conexion;

	public DatosFormacionDAO() {
		conexion = ConexionInformix.getConexion();
	}

	public DatosFormacionDTO getDatosFormacion(String dniAlumno) {
		// ws_h -- datos formacion - idiomas
		ResultSet rs = PA.getPA(conexion, PA.DATOS_FORMACION_IDIOMAS, dniAlumno);

		List<String> idiomas = DatosFormacionTransformer.getDatosFormacionIdiomas(rs);
		DatosFormacionSecundariaDTO datosFormacionSecundaria = getDatosFormacionSecundaria(dniAlumno);
		DatosFormacionSuperiorDTO datosFormacionSuperior = getDatosFormacionSuperior(dniAlumno);

		DatosFormacionDTO datosFormacionDTO = new DatosFormacionDTO(idiomas, datosFormacionSecundaria,
				datosFormacionSuperior);

		return datosFormacionDTO;
	}

	public DatosFormacionSecundariaDTO getDatosFormacionSecundaria(String dniAlumno) {
		// ws_i -- datos formacion secundaria
		ResultSet rs = PA.getPA(conexion, PA.DATOS_FORMACION_SECUNDARIA, dniAlumno);

		return DatosFormacionTransformer.getDatosFormacionSecundaria(rs);
	}

	public DatosFormacionSuperiorDTO getDatosFormacionSuperior(String dniAlumno) {
		// ws_l -- datos formacion superior
		ResultSet rs = PA.getPA(conexion, PA.DATOS_FORMACION_SUPERIOR, dniAlumno);

		return DatosFormacionTransformer.getDatosFormacionSuperior(rs);
	}

}
