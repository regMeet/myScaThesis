package entity.datosAlumno.datosSocioEconomicos;

import java.util.List;

public class DatosSocioEconomicosGenerales {

	private List<String> disponibilidadPC;
	private List<String> accesoInternet;
	private List<String> usoInternet;
	private String regularidadAccesoInternet;

	public DatosSocioEconomicosGenerales() {
	}

	public List<String> getDisponibilidadPC() {
		return disponibilidadPC;
	}

	public void setDisponibilidadPC(List<String> disponibilidadPC) {
		this.disponibilidadPC = disponibilidadPC;
	}

	public List<String> getAccesoInternet() {
		return accesoInternet;
	}

	public void setAccesoInternet(List<String> accesoInternet) {
		this.accesoInternet = accesoInternet;
	}

	public List<String> getUsoInternet() {
		return usoInternet;
	}

	public void setUsoInternet(List<String> usoInternet) {
		this.usoInternet = usoInternet;
	}

	public String getRegularidadAccesoInternet() {
		return regularidadAccesoInternet;
	}

	public void setRegularidadAccesoInternet(String regularidadAccesoInternet) {
		this.regularidadAccesoInternet = regularidadAccesoInternet;
	}

}
