package cl.inacap.RegitroCivilWAR.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.RegistroCivilModel.dao.SolicitudesLocal;
import cl.inacap.RegistroCivilModel.dto.Solicitud;

/**
 * Servlet implementation class AgregarSolicitudController
 */
@WebServlet("/AgregarSolicitudController.do")
public class AgregarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      @Inject
      private SolicitudesLocal solicitudesDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/agregarSolicitud.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> errores = new ArrayList<>();
		
		String nombre= request.getParameter("nombre-txt").trim();
		if(nombre.isEmpty()) {
			errores.add("ingrese un nombre");
		}
		String apellido= request.getParameter("apellido-txt").trim();
		if(apellido.isEmpty()) {
			errores.add("ingrese un apellido");
			
		}
		String tipo= request.getParameter("tipo-txt");
		if(tipo.isEmpty()) {
			errores.add("selecione tipo de solicitud");
			
		}
		String rut = request.getParameter("rut-txt").trim();	
		if(rut.isEmpty()) {
			errores.add("selecione tipo de rut");
			
		}
		
		
		int num=0;
		try {
			num= Integer.parseInt(rut);
		}catch(Exception ex) {
			
		}
		
		
		
		if(errores.isEmpty()) {
			
			Solicitud solicitud= new Solicitud();
			solicitud.setTipo(tipo);
			solicitud.setNombre(nombre+""+apellido);
			solicitud.setRut(rut);
			solicitud.setNroAtencion(11);
			request.setAttribute("mensaje", "solicitud registrada correctamente");
			
		}else {
			request.setAttribute("errores", errores);
			
			
			
		}
		doGet(request, response);
	}

}
