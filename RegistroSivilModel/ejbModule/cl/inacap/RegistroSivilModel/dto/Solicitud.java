package cl.inacap.RegistroSivilModel.dto;

public class Solicitud {

	
	private String rut;
	private String tipoSolicitud;
	private String nombre;
	private int nAtencion;
	
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getnAtencion() {
		return nAtencion;
	}
	public void setnAtencion(int nAtencion) {
		this.nAtencion = nAtencion;
	}
	
	
	
}
