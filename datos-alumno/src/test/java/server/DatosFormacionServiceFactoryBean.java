package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosFormacionService;

public class DatosFormacionServiceFactoryBean implements FactoryBean {

	private SCADomain scaDomain;

	public DatosFormacionServiceFactoryBean(SCADomain scaDomain) {
		this.scaDomain = scaDomain;
	}

	public Object getObject() {
		return scaDomain.getService(DatosFormacionService.class, "DatosFormacionServiceComponent");
	}

	public Class<DatosFormacionService> getObjectType() {
		return DatosFormacionService.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
