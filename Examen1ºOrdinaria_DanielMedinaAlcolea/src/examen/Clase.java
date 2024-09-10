package examen;

public class Clase {
	public String dia;
	public String mes;
	public String año;
	public String codigoClase;
	public String hora;
	public String codigoMonitor;
	public String numeroParticipantes;
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getCodigoClase() {
		return codigoClase;
	}
	public void setCodigoClase(String codigoClase) {
		this.codigoClase = codigoClase;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getCodigoMonitor() {
		return codigoMonitor;
	}
	public void setCodigoMonitor(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}
	public String getNumeroParticipantes() {
		return numeroParticipantes;
	}
	public void setNumeroParticipantes(String numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}
	public Clase(String dia, String mes, String año, String codigoClase, String hora, String codigoMonitor,
			String numeroParticipantes) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.codigoClase = codigoClase;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.numeroParticipantes = numeroParticipantes;
	}
	public Clase() {
		super();
		this.dia = "";
		this.mes = "";
		this.año = "";
		this.codigoClase = "";
		this.hora = "";
		this.codigoMonitor = "";
		this.numeroParticipantes = "";
	}
	@Override
	public String toString() {
		return "Clase [dia=" + dia + ", mes=" + mes + ", año=" + año + ", codigoClase=" + codigoClase + ", hora=" + hora
				+ ", codigoMonitor=" + codigoMonitor + ", numeroParticipantes=" + numeroParticipantes + "]";
	}
	
	
	
	

}
