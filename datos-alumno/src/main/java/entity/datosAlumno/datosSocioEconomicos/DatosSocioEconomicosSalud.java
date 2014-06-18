package entity.datosAlumno.datosSocioEconomicos;

import java.util.List;

public class DatosSocioEconomicosSalud {

	private String coberturaDeSalud;
	private boolean practicaDeporte;
	private List<String> deportes;
	private List<String> lugaresPractica;

	public DatosSocioEconomicosSalud() {
	}

	public String getCoberturaDeSalud() {
		return coberturaDeSalud;
	}

	public void setCoberturaDeSalud(String coberturaDeSalud) {
		this.coberturaDeSalud = coberturaDeSalud;
	}

	public boolean isPracticaDeporte() {
		return practicaDeporte;
	}

	public void setPracticaDeporte(boolean practicaDeporte) {
		this.practicaDeporte = practicaDeporte;
	}

	public List<String> getDeportes() {
		return deportes;
	}

	public void setDeportes(List<String> deportes) {
		this.deportes = deportes;
	}

	public List<String> getLugaresPractica() {
		return lugaresPractica;
	}

	public void setLugaresPractica(List<String> lugaresPractica) {
		this.lugaresPractica = lugaresPractica;
	}

}
