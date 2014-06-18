package guarani.DTO.datosAlumno.datosSocioEconomicos;

import java.util.List;

public class DatosSocioEconomicosSaludDTO {

	private String coberturaDeSalud;
	private boolean practicaDeporte;
	private List<String> deportes;
	private List<String> lugaresPractica;

	public DatosSocioEconomicosSaludDTO(String coberturaDeSalud, boolean practicaDeporte, List<String> deportes,
			List<String> lugaresPractica) {
		super();
		this.coberturaDeSalud = coberturaDeSalud;
		this.practicaDeporte = practicaDeporte;
		this.deportes = deportes;
		this.lugaresPractica = lugaresPractica;
	}

	public String getCoberturaDeSalud() {
		return coberturaDeSalud;
	}

	public boolean isPracticaDeporte() {
		return practicaDeporte;
	}

	public List<String> getDeportes() {
		return deportes;
	}

	public List<String> getLugaresPractica() {
		return lugaresPractica;
	}

}
