package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosSocioEconomicosService;

public class DatosSocioEconomicosServiceFactoryBean implements FactoryBean {

	private SCADomain scaDomain;

	public DatosSocioEconomicosServiceFactoryBean(SCADomain scaDomain) {
		this.scaDomain = scaDomain;
	}

	public Object getObject() {
		return scaDomain.getService(DatosSocioEconomicosService.class, "DatosSocioEconomicosServiceComponent");
	}

	public Class<DatosSocioEconomicosService> getObjectType() {
		return DatosSocioEconomicosService.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
