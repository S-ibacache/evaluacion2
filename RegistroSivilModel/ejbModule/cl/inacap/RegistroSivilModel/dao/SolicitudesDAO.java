package cl.inacap.RegistroSivilModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.RegistroSivilModel.dto.Solicitud;

/**
 * Session Bean implementation class SolicitudesDAO
 */
@Stateless
@LocalBean
public class SolicitudesDAO implements SolicitudesDAOLocal {
	List<Solicitud> solicitudes = new ArrayList<>();
    /**
     * Default constructor. 
     */
    public SolicitudesDAO() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void save(Solicitud solicitud) {
		solicitudes.add(solicitud);
		
	}

	@Override
	public List<Solicitud> getAll() {
		// TODO Auto-generated method stub
		return solicitudes;
	}

	@Override
	public void delete(Solicitud solicitud) {
		solicitudes.remove(solicitud);
		
	}

	@Override
	public List<Solicitud> filterTipo(String tipo) {
		// TODO Auto-generated method stub
		return solicitudes.stream().filter(s->s.getTipoSolicitud().contains(tipo)).collect(Collectors.toList());
	}

}
