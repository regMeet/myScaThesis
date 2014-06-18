package guarani.DTO.datosAlumno.datosExtranjeros;

public class DatosExtranjerosDTO {

	private String fechaIngresoAlPais;
	private String fechaOtorgamientoVisa;
	private String fechaVencimientoVisa;
	private String tipoDeResidencia;
	private String fechaDeOtorgamientoDeLaResidencia;
	private String fechaDeVencimientoDeLaResidencia;

	public DatosExtranjerosDTO(String fechaIngresoAlPais, String fechaOtorgamientoVisa, String fechaVencimientoVisa,
			String tipoDeResidencia, String fechaDeOtorgamientoDeLaResidencia, String fechaDeVencimientoDeLaResidencia) {
		super();
		this.fechaIngresoAlPais = fechaIngresoAlPais;
		this.fechaOtorgamientoVisa = fechaOtorgamientoVisa;
		this.fechaVencimientoVisa = fechaVencimientoVisa;
		this.tipoDeResidencia = tipoDeResidencia;
		this.fechaDeOtorgamientoDeLaResidencia = fechaDeOtorgamientoDeLaResidencia;
		this.fechaDeVencimientoDeLaResidencia = fechaDeVencimientoDeLaResidencia;
	}

	public String getFechaIngresoAlPais() {
		return fechaIngresoAlPais;
	}

	public String getFechaOtorgamientoVisa() {
		return fechaOtorgamientoVisa;
	}

	public String getFechaVencimientoVisa() {
		return fechaVencimientoVisa;
	}

	public String getTipoDeResidencia() {
		return tipoDeResidencia;
	}

	public String getFechaDeOtorgamientoDeLaResidencia() {
		return fechaDeOtorgamientoDeLaResidencia;
	}

	public String getFechaDeVencimientoDeLaResidencia() {
		return fechaDeVencimientoDeLaResidencia;
	}

}
