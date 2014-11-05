package com.up.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.up.model.Usuario;
import com.up.service.UsuarioService;

@Controller
public class CadastroController {
	
	@Autowired
    private UsuarioService usuarioService;

	@RequestMapping("/Cadastro")
	public ModelAndView init(){
		ModelAndView model = new ModelAndView("Cadastro");
		
		return model;
	}
	
	@RequestMapping(value="/Cadastro", method=RequestMethod.POST)
	public ModelAndView cadastrar(HttpServletRequest request,HttpServletResponse res){
		Usuario user = new Usuario();

		user.setNome(request.getParameter("nome"));
		user.setEmail(request.getParameter("email"));
		user.setSenha(request.getParameter("senha"));
		user.setLogin(request.getParameter("usuario"));
		
		usuarioService.addUsuario(user);
		
		ModelAndView model = new ModelAndView("Principal");
		model.addObject("usuario", user);
		
		return model;
	}
}
