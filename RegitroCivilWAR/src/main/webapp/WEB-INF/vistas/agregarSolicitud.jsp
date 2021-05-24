<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container">

	<c:if test="${mensaje != null}">
		<div class="columns is-centered mb-4">
			<div class="column is-6">
				<div class="notification is-info">
					<p>${mensaje}</p>
				</div>
			</div>
		</div>
	</c:if>
	<c:if test="${errores != null}">
		<div class="columns is-centered mb-4">
			<div class="column is-6">
				<div class="notification is-warning">
					<ul>
						<c:forEach var="error" items="${errores}">
							<p>${error}</p>
						</c:forEach>
					
					</ul>
				</div>
			</div>
		</div>
	</c:if>
	<div class="columns is-centered">
		<div class="column is-6">
			<form method="post" action="AgregarSolicitudController.do">
				<div class="card">
					<div class="card-header has-background-primary">
						<span class="card-header-title">Agregar Solicitud</span>

					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="rut-txt">RUT:</label>
							<div class="control">
								<input class="input" type="text" id="rut-txt" name="rut-txt" />
							</div>
						</div>

						<div class="field">
							<label class="label" for="nombre-txt">Nombre:</label>
							<div class="control">
								<input class="input" type="text" id="nombre-txt"
									name="nombre-txt" />
							</div>
						</div>

						<div class="field">
							<label class="label" for="apellido-txt">Apellido:</label>
							<div class="control">
								<input class="input" type="text" id="apellido-txt"
									name="apellido-txt" />
							</div>
						</div>

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
						</div>

					</div>

					<div class="card-footer has-text-centered">
						<div class="card-footer-item">
							<button type="submit" class="button is-primary">Ingresar
								Solicitud</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>

</main>



</body>
</html>