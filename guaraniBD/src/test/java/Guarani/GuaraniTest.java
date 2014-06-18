package Guarani;

import guarani.Conexion.ConexionInformix;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GuaraniTest {
	private static final String VARCHAR = "varchar";
	private static final String CHAR = "char";
	private static final String DECIMAL = "decimal";
	private static final String INT = "int";
	private static final String DATE = "date";

	public static void main(String[] args) throws SQLException {
		ResultSet ws;
		String dni = "35551521";
		
		final Connection conexion = ConexionInformix.getConexionLocal();

		for (int i = 97; i <= 108; i++) {
			System.out.println("ws_" + (char) i);
			ws = ws(conexion, "ws_" + (char) i, dni);
			imprimirData(ws);
			System.out.println();
		}

		ConexionInformix.closeConnection();
		System.out.println("Fin");
	}

	private static void imprimirData(ResultSet rs) throws SQLException {
		ResultSetMetaData rsmtadta = rs.getMetaData();
		int colCount = rsmtadta.getColumnCount();
		System.out.println(colCount + " columnas");

		while (rs.next()) {
			for (int i = 1; i <= colCount; i++) {
				final String nroColumna = "Columna " + i;
				final String columnTypeName = rsmtadta.getColumnTypeName(i);
				final String tipoDeDato = " (tipo: " + columnTypeName + ")";

				System.out.print(nroColumna + tipoDeDato);
				System.out.print(" (nombre: )");

				System.out.print(" valor: ");

				if (columnTypeName.equals(VARCHAR)) {
					System.out.print(rs.getString(i));
				} else if (columnTypeName.equals(DECIMAL)) {
					System.out.print(rs.getLong(i));
				} else if (columnTypeName.equals(INT)) {
					System.out.print(rs.getInt(i));
				} else if (columnTypeName.equals(DATE)) {
					System.out.print(rs.getDate(i));
				} else if (columnTypeName.equals(CHAR)) {
					System.out.print(rs.getString(i));
				}

				System.out.println();
			}
		}
		rs.close();
	}

	static ResultSet ws(Connection conexion, String sp, String dni) throws SQLException {
		CallableStatement cstmt = null;
		ResultSet ws_a = null;

		cstmt = conexion.prepareCall("{call " + sp + "(?)}", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		cstmt.setString(1, dni);

		cstmt.execute();
		ws_a = cstmt.getResultSet();

		return ws_a;
	}

}