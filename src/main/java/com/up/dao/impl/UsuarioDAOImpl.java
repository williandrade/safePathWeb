package com.up.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.up.dao.UsuarioDAO;
import com.up.model.Usuario;
import com.up.util.GenericDAOImpl;

@Repository
public class UsuarioDAOImpl  extends GenericDAOImpl<Usuario, String> implements UsuarioDAO{

	private static final Logger logger = LoggerFactory.getLogger(UsuarioDAOImpl.class);
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public UsuarioDAOImpl(){
		super(Usuario.class);
		
	}

}
