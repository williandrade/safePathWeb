package com.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.up.service.UsuarioService;
import com.up.validador.Login;

@Controller
public class LoginController {
	
	@Autowired
    private UsuarioService usuarioService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam(value="usuario")String nome, 
							  @RequestParam(value="senha")String senha) {
		
		ModelAndView model = new ModelAndView("Principal");
		
		return model;
    }
	
}
