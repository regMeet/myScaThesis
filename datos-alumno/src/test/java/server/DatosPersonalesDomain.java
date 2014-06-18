package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

public class DatosPersonalesDomain implements FactoryBean {
	private SCADomain scaDomain;

	public Object getObject() {
		scaDomain = SCADomain.newInstance("datosPersonalesSpring.composite");
		return scaDomain;
	}

	public Class<SCADomain> getObjectType() {
		return SCADomain.class;
	}

	public boolean isSingleton() {
		return true;
	}
	
	public void closeDomain(){
		scaDomain.close();
	}

}
