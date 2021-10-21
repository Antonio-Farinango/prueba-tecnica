package com.pruebaTecnica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaTecnica.model.Usuario;
import com.pruebaTecnica.model.UsuarioInterno;
import com.pruebaTecnica.model.usuarioExterno;
import com.pruebaTecnica.repository.UsuarioExternoRepository;
import com.pruebaTecnica.repository.UsuarioInternoRepository;
import com.pruebaTecnica.service.contract.IUsuarioMSService;

@Service
public  class UsuarioMSServiceImpl implements IUsuarioMSService {


	@Autowired
	private UsuarioExternoRepository usuarioExterno;
	@Autowired
	private UsuarioInternoRepository usuarioInterno;
	

	@Override
	public void guardarusuario(Usuario usuario) {
		if(usuario.getTipoUsuario().toUpperCase().equalsIgnoreCase("INTERNO"))
		{
			this.usuarioInterno.save(usuario.getUsuarioInterno());
		} else if(usuario.getTipoUsuario().toUpperCase().equalsIgnoreCase("EXTERNO"))
		{
			this.usuarioExterno.save(usuario.getUsuarioExterno());
		}

	}

	@Override
	public Usuario consultarUsuario(String tipoUsuario) {
		Usuario response = new Usuario();
		
		return response;
	}

	@Override
	public List<usuarioExterno> consultarUsuarioExterno() {
		return this.usuarioExterno.findAll();
	}
	
	@Override
	public List<UsuarioInterno> consultarUsuarioInterno() {
		return this.usuarioInterno.findAll();
	}
	
}
