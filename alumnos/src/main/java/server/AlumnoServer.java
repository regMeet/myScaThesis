package server;

import org.apache.tuscany.sca.node.SCANode;
import org.apache.tuscany.sca.node.SCANodeFactory;

import service.api.AlumnoService;

public class AlumnoServer {

	public static void main(String[] args) throws Exception {
		long timeout = -1L;
		if (args.length > 0) {
			timeout = Long.parseLong(args[0]);
		}

		System.out.println("Arrancando el servidor AlumnoServer ...");

		SCANodeFactory factory = SCANodeFactory.newInstance();
		SCANode node = factory.createSCANodeFromClassLoader("alumno.composite", AlumnoService.class.getClassLoader());
		node.start();

		if (timeout < 0) {
			System.out.println("");
			System.out.println("AlumnoServer Running");
			System.out.println("wsdl -> http://localhost:8081/services/AlumnoService?wsdl");
			System.out.println("Presione Enter para salir...");
			System.in.read();
		} else {
			Thread.sleep(timeout);
		}

		node.stop();
	}

}
