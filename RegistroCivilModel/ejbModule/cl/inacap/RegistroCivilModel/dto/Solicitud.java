package cl.inacap.RegistroCivilModel.dto;

public class Solicitud {
	private String tipo;
	private String nombre;
	private String rut;
	private int nroAtencion;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getNroAtencion() {
		return nroAtencion;
	}
	public void setNroAtencion(int nroAtencion) {
		this.nroAtencion = nroAtencion;
	}
	
	
}
