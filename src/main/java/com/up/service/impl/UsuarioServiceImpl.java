package com.up.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.up.dao.UsuarioDAO;
import com.up.model.Usuario;
import com.up.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private UsuarioDAO usuarioDAO;
	 
    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
	
	@Override
	@Transactional
	public Usuario addUsuario(Usuario user) {
		// TODO Auto-generated method stub
		return this.usuarioDAO.save(user);
	}

	@Override
	@Transactional
	public void updateUsuario(Usuario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Usuario> listUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Usuario getUsuarioById(String id) {
		// TODO Auto-generated method stub
		return this.usuarioDAO.get(id);
	}

	@Override
	@Transactional
	public void removeUsuario(String id) {
		// TODO Auto-generated method stub
		
	}

}
