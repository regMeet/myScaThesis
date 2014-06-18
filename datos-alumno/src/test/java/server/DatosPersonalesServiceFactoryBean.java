package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosPersonalesService;

public class DatosPersonalesServiceFactoryBean implements FactoryBean {

	private SCADomain scaDomain;

	public DatosPersonalesServiceFactoryBean(SCADomain scaDomain) {
		this.scaDomain = scaDomain;
	}

	public Object getObject() {
		return scaDomain.getService(DatosPersonalesService.class, "DatosPersonalesServiceComponent");
	}

	public Class<DatosPersonalesService> getObjectType() {
		return DatosPersonalesService.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
