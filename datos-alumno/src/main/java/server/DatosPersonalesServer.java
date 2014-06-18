package server;

import org.apache.tuscany.sca.node.SCANode;
import org.apache.tuscany.sca.node.SCANodeFactory;

import service.api.DatosPersonalesService;

public class DatosPersonalesServer {

	public static void main(String[] args) throws Exception {
		long timeout = -1L;
		if (args.length > 0) {
			timeout = Long.parseLong(args[0]);
		}

		System.out.println("Arrancando el servidor DatosPersonalesServer ...");

		SCANodeFactory factory = SCANodeFactory.newInstance();
		SCANode node = factory.createSCANodeFromClassLoader("datosPersonalesSpring.composite",
				DatosPersonalesService.class.getClassLoader());
		node.start();

		if (timeout < 0) {
			System.out.println("");
			System.out.println("DatosPersonalesServer Running");
			System.out.println("wsdl -> http://localhost:8082/services/DatosPersonalesService?wsdl");
			System.out.println("Presione Enter para salir...");
			System.in.read();
		} else {
			Thread.sleep(timeout);
		}

		node.stop();
	}

}
