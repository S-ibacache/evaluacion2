<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container">
	<div class="columns is-centered">
		<div class="column is-6">
			<form method="post" action="AgregarSolicitudController.do">
				<div class="card">
					<div class="card-header has-background-primary">
						<span class="card-header-title">Atender Solicitud</span>

					</div>
					<div class="card-content">
						
						

						<div class="field">
							<label class="label" for="tipo-txt">Tipo de solicitud:</label>
							<div="control">
								<div class="select">
									<select id="tipo-txt" name="tipo-txt">
										<option>Solicitud de Cédula de Identidad</option>
										<option>Retiro de Cédula de Identidad</option>
										<option>Solicitud de Certificado de Nacimiento</option>
										<option>Solicitud de Certificado de Defunción</option>
									</select>
								</div>
							</div>
							
							<div class="card-item">
							<button type="submit" class="button is-primary">Filtrar</button>
						</div>
							
							
						</div>
						
						
						
						
						
					</div>

					
					</div>
				</div>
				
				<table class="table is-overed is-fullwidth">
							<thead >
								<tr>
									<th>NºAtencion</th>
									<th>nombre</th>
									<th>tipo solicitud</th>
									<th>atender</th>
								</tr>
								
							
							</thead>
							<tbody>
								<c:forEach var="solicitud" items="${solicitudes}">
									<tr>
									<td >${solicitudes.nroAtencion}</td>
									<td >${solicitudes.nombre}</td>
									<td >${solicitudes.tipo}</td>
									<td> <a href="AtenderSolicitudesController.do?nroAtencionEliminar=${solicitudes.nroAtencion}" 
									class="has-text-danger">eliminar</a>
									</td>
								</tr>
								
								</c:forEach>
							
								
							</tbody>
						
						</table>
			</form>
		</div>
	</div>

</main>



</body>
</html>