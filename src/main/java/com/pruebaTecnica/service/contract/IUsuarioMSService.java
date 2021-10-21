package com.pruebaTecnica.service.contract;

import java.util.List;

import com.pruebaTecnica.model.Usuario;
import com.pruebaTecnica.model.UsuarioInterno;
import com.pruebaTecnica.model.usuarioExterno;

public interface IUsuarioMSService {

	void guardarusuario(Usuario usuario);

	Usuario consultarUsuario(String tipoUsuario);

	List<usuarioExterno> consultarUsuarioExterno();

	List<UsuarioInterno> consultarUsuarioInterno();

}
