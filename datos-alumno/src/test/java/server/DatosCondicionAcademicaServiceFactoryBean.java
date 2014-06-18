package server;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.beans.factory.FactoryBean;

import service.api.DatosCondicionAcademicaService;

public class DatosCondicionAcademicaServiceFactoryBean implements FactoryBean {
	private SCADomain scaDomain;
	
	public DatosCondicionAcademicaServiceFactoryBean(SCADomain scaDomain){
		this.scaDomain = scaDomain;
	}
	
	public Object getObject() {
		return scaDomain.getService(DatosCondicionAcademicaService.class, "DatosCondicionAcademicaServiceComponent");
	}

	public Class<DatosCondicionAcademicaService> getObjectType() {
		return DatosCondicionAcademicaService.class;
	}

	public boolean isSingleton() {
		return true;
	}
}