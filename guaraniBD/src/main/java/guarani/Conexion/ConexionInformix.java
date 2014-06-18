package guarani.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.informix.jdbc.IfxDriver;

public class ConexionInformix {
	private static final String INFORMIX_DRIVER_CLASS_NAME = "com.informix.jdbc.IfxDriver";
	private static Connection informixConnection = null;

	public static Connection getConexion() {
//		String ip = "172.16.16.67"; // Ip informix server
//		String portNumber = "1525";
		String ip = "127.0.0.1";
		String portNumber = "51525";

		return getConexion(ip, portNumber);
	}

	public static Connection getConexionLocal() {
		String ip = "127.0.0.1";
		String portNumber = "51525";

		return getConexion(ip, portNumber);
	}

	private static Connection getConexion(String ip, String portNumber) {
		if (informixConnection == null) {
			final String url = getUrl(ip, portNumber);
			System.out.println(">>> Cargando conexion a la base de datos!! --> test.");

			try {
				String informixDriverName = IfxDriver.class.getName();
				Class.forName(informixDriverName);
				System.out.println("informixDriverName " + informixDriverName);
			} catch (Exception e) {
				System.out.println("ERROR: failed to load Informix JDBC driver.");
				e.printStackTrace();
				return null;
			}

			try {
				informixConnection = DriverManager.getConnection(url);
			} catch (SQLException e) {
				System.out.println("ERROR: failed to connect!");
				System.out.println("ERROR: " + e.getMessage());
				e.printStackTrace();
				return null;
			}

		}
		return informixConnection;
	}

	private static String getUrl(String ip, String portNumber) {
		// Parameters
		String dbName = "ws_pru_guarani";
		String serverName = "ol_testing";
		String userName = "alberten";
		String passwordCode = "Alan+pro";

		final String prefix = "jdbc:informix-sqli://";
		final String informixServer = "INFORMIXSERVER=" + serverName;
		final String user = "user=" + userName;
		final String password = "password=" + passwordCode;

		final String url = prefix + ip + ":" + portNumber + "/" + dbName + ":" + informixServer + ";" + user + ";"
				+ password;

		System.out.println(url);
		return url;
	}

	public static void closeConnection() {
		try {
			informixConnection.close();
		} catch (SQLException e) {
			System.out.println("ERROR: failed to close the connection!");
			e.printStackTrace();
			return;
		}
		System.out.println(">>>End of the test.");
	}

}
