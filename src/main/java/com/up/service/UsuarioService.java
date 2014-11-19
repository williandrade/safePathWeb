package com.up.service;

import java.util.List;

import com.up.dto.UsuarioDto;

public interface UsuarioService {

	public UsuarioDto addUsuario(UsuarioDto user);
    public void updateUsuario(UsuarioDto p);
    public List<UsuarioDto> listUsuario();
    public UsuarioDto getUsuarioById(String id);
    public void removeUsuario(String id);
}
