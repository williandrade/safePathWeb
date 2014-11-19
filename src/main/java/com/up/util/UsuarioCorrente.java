package com.up.util;

import com.up.model.Usuario;

public class UsuarioCorrente {

	private static Usuario instance = null;
	
	protected UsuarioCorrente(Usuario instance){
		this.instance = instance;
	}
	
	public Usuario getInstace(){
		return instance;
	}
	
	public void setInstace(Usuario user){
		this.instance = user;
	}
}
