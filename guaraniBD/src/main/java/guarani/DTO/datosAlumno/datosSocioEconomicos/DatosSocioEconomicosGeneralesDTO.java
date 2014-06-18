package guarani.DTO.datosAlumno.datosSocioEconomicos;

import java.util.List;

public class DatosSocioEconomicosGeneralesDTO {

	private List<String> disponibilidadPC;
	private List<String> accesoInternet;
	private List<String> usoInternet;
	private String regularidadAccesoInternet;

	public DatosSocioEconomicosGeneralesDTO(List<String> disponibilidadPC, List<String> accesoInternet,
			List<String> usoInternet, String regularidadAccesoInternet) {
		this.disponibilidadPC = disponibilidadPC;
		this.accesoInternet = accesoInternet;
		this.usoInternet = usoInternet;
		this.regularidadAccesoInternet = regularidadAccesoInternet;
	}

	public List<String> getDisponibilidadPC() {
		return disponibilidadPC;
	}

	public List<String> getAccesoInternet() {
		return accesoInternet;
	}

	public List<String> getUsoInternet() {
		return usoInternet;
	}

	public String getRegularidadAccesoInternet() {
		return regularidadAccesoInternet;
	}

}
