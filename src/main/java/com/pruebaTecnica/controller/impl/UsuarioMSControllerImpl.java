package com.pruebaTecnica.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.controller.contract.IUsuarioMSController;
import com.pruebaTecnica.model.Usuario;
import com.pruebaTecnica.model.UsuarioInterno;
import com.pruebaTecnica.model.usuarioExterno;
import com.pruebaTecnica.service.contract.IUsuarioMSService;

@RestController
@RequestMapping("/v1/usuario/ms")
public class UsuarioMSControllerImpl implements IUsuarioMSController {

	@Autowired
	private IUsuarioMSService service;

	@Override
	public ResponseEntity<?> guardarUsuario(Usuario usuario) {
		try {
			service.guardarusuario(usuario);
		} catch (Exception ex) {
			return new ResponseEntity<String>("ERROR AL GUARDAR", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("GUARDADO CON EXITO", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> consultarUsuario(String tipoUsuario) {
		List<usuarioExterno> responseUsuarioExterno = new ArrayList();
		List<UsuarioInterno> responseUsuarioInterno = new ArrayList();
		try {
			if (tipoUsuario.toUpperCase().equalsIgnoreCase("INTERNO")) {
				responseUsuarioInterno = service.consultarUsuarioInterno();
				if (responseUsuarioInterno == null) {
					return new ResponseEntity<String>("NO EXISTEN DATOS", HttpStatus.NOT_FOUND);
				}
				return new ResponseEntity<List<UsuarioInterno>>(responseUsuarioInterno, HttpStatus.OK);
			} else if (tipoUsuario.toUpperCase().equalsIgnoreCase("EXTERNO")) {
				responseUsuarioExterno = service.consultarUsuarioExterno();
				if (responseUsuarioExterno == null) {
					return new ResponseEntity<String>("NO EXISTEN DATOS", HttpStatus.NOT_FOUND);
				}
				return new ResponseEntity<List<usuarioExterno>>(responseUsuarioExterno, HttpStatus.OK);
			}
		} catch (Exception ex) {
			return new ResponseEntity<String>("ERROR AL CONSULTAR", HttpStatus.BAD_REQUEST);
		}
		return null;
	}

}
