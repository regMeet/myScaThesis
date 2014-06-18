package tesis.android;

import org.ksoap2.serialization.SoapObject;

import tesis.android.entities.DatosSocioEconomicos;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosSocioEconomicosActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ServiceConection conection = ServiceConection.getInstance();

		setContentView(R.layout.datos_socio_economicos);

		SoapObject response = conection.llamadaAlServicio("getDatosSocioEconomicos");
		
		DatosSocioEconomicos datos = new DatosSocioEconomicos((SoapObject) response);
		
		TextView titulo = (TextView) findViewById(R.id.textView0);
		titulo.setText("Datos Socioeconomicos");

		TextView informacion = (TextView) findViewById(R.id.textView1);
		
		informacion.append("---------------------------\n\n");
		
		informacion.append("- GENERALES - \n\n");

		informacion.append("Acceso a internet\n\n");

		for (String acceso : datos.getDatosSocioEconomicosGenerales().getAccesoInternet()) {
			informacion.append( acceso + "\n");
		}
		
		informacion.append("\n\nDisponibilidad de PC\n\n");
		
		for (String disponibilidad : datos.getDatosSocioEconomicosGenerales().getDisponibilidadPC()) {
			informacion.append( disponibilidad + "\n");
		}
		
		informacion.append("\n\nUso de internet\n\n");
		
		for (String uso : datos.getDatosSocioEconomicosGenerales().getUsoInternet()) {
			informacion.append( uso+ "\n");
		}
		
		informacion.append("\nRegularidad de Acceso a internet: " + datos.getDatosSocioEconomicosGenerales().getRegularidadAccesoInternet() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
		informacion.append("- SALUD - \n\n");

		informacion.append("Cobertura de salud: " + datos.getDatosSocioEconomicosSalud().getCoberturaDeSalud() + "\n\n");
		informacion.append("Practica deportes: " + datos.getDatosSocioEconomicosSalud().getPracticaDeporte() + "\n\n");
		
		informacion.append("Deportes \n\n");
		
		for (String deportes : datos.getDatosSocioEconomicosSalud().getDeportes()) {
			informacion.append( deportes + "\n");
		}
		
		informacion.append("\nLugares de práctica\n\n");
		
		for (String lugaresDePractica : datos.getDatosSocioEconomicosSalud().getLugaresPractica()) {
			informacion.append( lugaresDePractica + "\n");
		}
				
		informacion.append("\n---------------------------\n\n");
		
		informacion.append("- SITUACIÓN LABORAL PERSONAL - \n\n");

		informacion.append("Situación laboral: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getDatosDeTrabajo().getSituacionLaboral() + "\n");
		informacion.append("Actividad economica: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getDatosDeTrabajo().getActividadEconomica() + "\n");
		informacion.append("Categoria Ocupacional: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getDatosDeTrabajo().getCategoriaOcupacional() + "\n");
		informacion.append("Detalle rama economica: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getDatosDeTrabajo().getDetalleRamaActividadEconomica() + "\n\n");
		
		informacion.append("Trabajo: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getTrabajoQueHaceElAlumno() + "\n");
		informacion.append("Empresa familiar: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getEmpresaFamiliar() + "\n");
		informacion.append("Horas semanales: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getHorasSemanales() + "\n");
		informacion.append("Remuneración: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getRemuneracion() + "\n");
		informacion.append("Descuentos jubilatorios: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getDescuentoJubilatorios() + "\n");
		informacion.append("Tarea: " + datos.getDatosSocioEconomicosSituacionLaboralPersonal().getTareaQueRealiza() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
		informacion.append("- SITUACIÓN LABORAL DEL PADRE - \n\n");
		
		informacion.append("Situación laboral: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoPadre().getSituacionLaboral() + "\n");
		informacion.append("Actividad economica: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoPadre().getActividadEconomica() + "\n");
		informacion.append("Categoria Ocupacional: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoPadre().getCategoriaOcupacional() + "\n");
		informacion.append("Detalle rama economica: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoPadre().getDetalleRamaActividadEconomica() + "\n");
		informacion.append("Nivel de estudios: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getNivelDeEstudiosPadre() + "\n");
		informacion.append("Vive: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getViveElPadre() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
		informacion.append("- SITUACIÓN LABORAL DE LA MADRE - \n\n");
		
		informacion.append("Situación laboral: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoMadre().getSituacionLaboral() + "\n");
		informacion.append("Actividad economica: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoMadre().getActividadEconomica() + "\n");
		informacion.append("Categoria Ocupacional: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoMadre().getCategoriaOcupacional() + "\n");
		informacion.append("Detalle rama economica: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getDatosDeTrabajoMadre().getDetalleRamaActividadEconomica() + "\n");
		informacion.append("Nivel de estudios: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getNivelDeEstudiosMadre() + "\n");
		informacion.append("Vive: " + datos.getDatosSocioEconomicosSituacionLaboralPadres().getViveLaMadre() + "\n\n");
		
		informacion.append("---------------------------\n\n");
		
	}
}
