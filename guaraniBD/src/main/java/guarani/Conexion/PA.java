package guarani.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PA {

	public static final String DATOS_PRINCIPALES = "ws_a";
	public static final String DATOS_FAMILIARES = "ws_b";
	public static final String DATOS_EXTRANJEROS = "ws_c";
	public static final String DATOS_SOCIO_ECONOMICOS_SALUD = "ws_d";
	public static final String DATOS_SOCIO_ECONOMICOS_LABORAL_PERSONAL = "ws_e";
	public static final String DATOS_SOCIO_ECONOMICOS_GENERAL = "ws_f";
	public static final String DATOS_SOCIO_ECONOMICOS_LABORAL_PADRES = "ws_g";
	public static final String DATOS_FORMACION_IDIOMAS = "ws_h";
	public static final String DATOS_FORMACION_SECUNDARIA = "ws_i";
	public static final String DATOS_CONDICION_ACADEMICA = "ws_j";
	public static final String DATOS_DOMICILIO = "ws_k";
	public static final String DATOS_FORMACION_SUPERIOR = "ws_l";

	public static ResultSet getPA(Connection conexion, String sp, String dni) {
		ResultSet resultSet = null;

		try {
			final String nombrePA = "{call " + sp + "(?)}";
			CallableStatement cstmt = null;

			cstmt = conexion.prepareCall(nombrePA, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			cstmt.setString(1, dni);

			cstmt.execute();
			resultSet = cstmt.getResultSet();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultSet;
	}

}
