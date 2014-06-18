package tesis.android;

public class ServiceData {

	private String namespace;
	private String url;
	private String soap_action;

	public ServiceData() {
		namespace = "http://tempuri.org/";
		url = "http://guarani-broker-dev.unc.edu.ar:8081/services/AlumnoService";
		//url = "http://192.168.1.102:8081/services/AlumnoService";
		soap_action = "http://tempuri.org/getDatosCondicionAcademica";
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSoap_action() {
		return soap_action;
	}

	public void setSoap_action(String soap_action) {
		this.soap_action = soap_action;
	}

}
