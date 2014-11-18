package com.up.service;

import java.util.List;

import com.up.model.Usuario;

public interface UsuarioService {

	public Usuario addUsuario(Usuario user);
    public void updateUsuario(Usuario p);
    public List<Usuario> listUsuario();
    public Usuario getUsuarioById(String id);
    public void removeUsuario(String id);
}
