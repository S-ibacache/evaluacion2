package cl.inacap.RegistroCivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.RegistroCivilModel.dto.Solicitud;

@Local
public interface SolicitudesLocal {

	void add(Solicitud solicitud);
	List<Solicitud> getAll();
	void remove(Solicitud solicitud);
	//List<Solicitud> filterTipo(Solicitud tipo);
	
	
}
