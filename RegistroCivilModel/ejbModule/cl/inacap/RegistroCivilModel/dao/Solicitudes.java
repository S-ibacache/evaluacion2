package cl.inacap.RegistroCivilModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.RegistroCivilModel.dto.Solicitud;

/**
 * Session Bean implementation class Solicitudes
 */
@Stateless
@LocalBean
public class Solicitudes implements SolicitudesLocal {

	private static List<Solicitud> solicitudes = new ArrayList<>();
    /**
     * Default constructor. 
     */
    public Solicitudes() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void add(Solicitud solicitud) {
		solicitudes.add(solicitud);
		
	}

	@Override
	public List<Solicitud> getAll() {
		// TODO Auto-generated method stub
		return solicitudes;
	}

	@Override
	public void remove(Solicitud solicitud) {
		solicitudes.remove(solicitud);
		
	}

	@Override
	public List<Solicitud> filterTipo(Solicitud tipo) {
		
		return solicitudes.stream().filter(s->s.getTipo().contains(tipo)).collect(Collectors.toList());
	}

}
