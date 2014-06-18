package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosExtranjerosService;

public class DatosExtranjerosServiceFactoryBean implements FactoryBean {
	private SCADomain scaDomain;
	
	public DatosExtranjerosServiceFactoryBean(SCADomain scaDomain){
		this.scaDomain = scaDomain;
	}
	
	public Object getObject() {
		return scaDomain.getService(DatosExtranjerosService.class, "DatosExtranjerosServiceComponent");
	}

	public Class<DatosExtranjerosService> getObjectType() {
		return DatosExtranjerosService.class;
	}

	public boolean isSingleton() {
		return true;
	}
}