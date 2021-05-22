package cl.inacap.RegistroSivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.RegistroSivilModel.dto.Solicitud;

@Local
public interface SolicitudesDAOLocal {
	void save(Solicitud solicitud);
	List<Solicitud> getAll();
	void delete(Solicitud solicitud);
	List<Solicitud> filterTipo(String tipo);
}
