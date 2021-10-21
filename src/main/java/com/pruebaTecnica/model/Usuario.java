package com.pruebaTecnica.model;

public class Usuario {

	private String tipoUsuario;
	private usuarioExterno usuarioExterno;
	private UsuarioInterno usuarioInterno;

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public usuarioExterno getUsuarioExterno() {
		return usuarioExterno;
	}

	public void setUsuarioExterno(usuarioExterno usuarioExterno) {
		this.usuarioExterno = usuarioExterno;
	}

	public UsuarioInterno getUsuarioInterno() {
		return usuarioInterno;
	}

	public void setUsuarioInterno(UsuarioInterno usuarioInterno) {
		this.usuarioInterno = usuarioInterno;
	}

}
