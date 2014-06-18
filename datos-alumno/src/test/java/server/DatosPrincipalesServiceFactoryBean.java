package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosPrincipalesService;

public class DatosPrincipalesServiceFactoryBean implements FactoryBean {
	private SCADomain scaDomain;
	
	public DatosPrincipalesServiceFactoryBean(SCADomain scaDomain){
		this.scaDomain = scaDomain;
	}
	
	public Object getObject() {
		return scaDomain.getService(DatosPrincipalesService.class, "DatosPrincipalesServiceComponent");
	}

	public Class<DatosPrincipalesService> getObjectType() {
		return DatosPrincipalesService.class;
	}

	public boolean isSingleton() {
		return true;
	}
}