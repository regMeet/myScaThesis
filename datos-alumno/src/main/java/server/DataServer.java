package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.apache.tuscany.sca.node.SCANode;
import org.apache.tuscany.sca.node.SCANodeFactory;

import service.api.DatosExtranjerosService;
import service.api.DatosPrincipalesService;


public class DataServer {
	SCADomain scaDomain;
	
	public DataServer() {
		scaDomain = SCADomain.newInstance("datosPersonalesSpring.composite");
	}
	
	public DatosPrincipalesService getDatosPrincipalesService() {
		DatosPrincipalesService service = scaDomain.getService(DatosPrincipalesService.class, "DatosPrincipalesServiceComponent");
		return service;
	}
	
	public DatosExtranjerosService getDatosExtranjerosService() {
		DatosExtranjerosService service = scaDomain.getService(DatosExtranjerosService.class, "DatosExtranjerosServiceComponent");
		return service;		
	}
	
	public void closeDomain(){
		scaDomain.close();
	}

	public static void main(String[] args) throws Exception {
		 long timeout = -1L;
		 if (args.length > 0) {
		 timeout = Long.parseLong(args[0]);
		 }
		
		 System.out.println("Starting the Sample SCA Spring Alumno server...");
		
		 SCANodeFactory factory = SCANodeFactory.newInstance();
		 SCANode node = factory.createSCANodeFromClassLoader("datosPersonalesSpring.composite",
				 DatosPrincipalesService.class.getClassLoader());
		 
		 node.start();
		
		 if (timeout < 0) {
		 System.out.println("Press Enter to Exit...");
		 System.in.read();
		 } else {
		 Thread.sleep(timeout);
		 }
		
		 node.stop();
	}

}
