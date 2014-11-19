package com.up.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.up.dao.UsuarioDAO;
import com.up.dto.UsuarioDto;
import com.up.model.Usuario;
import com.up.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private UsuarioDAO usuarioDAO;
	private ModelMapper modelMapper = new ModelMapper();
	 
    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
	
	@Override
	@Transactional
	public UsuarioDto addUsuario(UsuarioDto user) {
		// TODO Auto-generated method stub
		Usuario usuario = modelMapper.map(user, Usuario.class);
		
		Usuario salvo = this.usuarioDAO.save(usuario);
		UsuarioDto retorno = modelMapper.map(salvo, UsuarioDto.class);
		
		return retorno;
	}

	@Override
	@Transactional
	public void updateUsuario(UsuarioDto p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<UsuarioDto> listUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public UsuarioDto getUsuarioById(String id) {
		// TODO Auto-generated method stub
	
		Usuario retBase = this.usuarioDAO.get(id);
		
		UsuarioDto retorno = modelMapper.map(retBase, UsuarioDto.class);
		
		return retorno;
	}

	@Override
	@Transactional
	public void removeUsuario(String id) {
		// TODO Auto-generated method stub
		
	}

}
