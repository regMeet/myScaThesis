package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosFamiliaresService;

public class DatosFamiliaresServiceFactoryBean implements FactoryBean {

	private SCADomain scaDomain;

	public DatosFamiliaresServiceFactoryBean(SCADomain scaDomain) {
		this.scaDomain = scaDomain;
	}

	public Object getObject() {
		return scaDomain.getService(DatosFamiliaresService.class, "DatosFamiliaresServiceComponent");
	}

	public Class<DatosFamiliaresService> getObjectType() {
		return DatosFamiliaresService.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
