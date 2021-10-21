package com.pruebaTecnica.controller.contract;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pruebaTecnica.model.Usuario;

import io.swagger.annotations.ApiOperation;

public interface IUsuarioMSController {

	/**
	 * POST
	 * @param usuario
	 * @return
	 */
	@PostMapping(produces = "application/json")
	@ApiOperation(value = "Crear nueva Persona", notes="Creamos un nuevos registros de persona")
	ResponseEntity<?> guardarUsuario(@RequestBody Usuario usuario);
	
	/**
	 * GET 
	 * @param tipoUsuario
	 * @return
	 */
	@GetMapping(value="/{tipoUsuario}",produces = "application/json")
	@ApiOperation(value = "Consultar por tipo de usuario", notes="Retorna los datos de la persona sugerida")
	ResponseEntity<?> consultarUsuario(@PathVariable("tipoUsuario") String tipoUsuario);
}
