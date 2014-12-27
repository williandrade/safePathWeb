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
	public void addUsuario(Usuario user) {
		// TODO Auto-generated method stub
		this.usuarioDAO.save(user);
	}

	@Override
	public void updateUsuario(Usuario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuarioById(String id) {
		// TODO Auto-generated method stub
		this.usuarioDAO.get(id);
		
		return null;
	}

	@Override
	public void removeUsuario(String id) {
		// TODO Auto-generated method stub
		
	}

}
