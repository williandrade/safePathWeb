package com.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.up.model.Usuario;
import com.up.service.UsuarioService;
import com.up.validador.Login;

@Controller
public class LoginController {
	
	@Autowired
    private UsuarioService usuarioService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
    public String login(@ModelAttribute Login novo, Model model) {
		
		if(novo.getUsuario().equalsIgnoreCase("admin") && novo.getSenha().equalsIgnoreCase("admin")){
			Usuario atual = usuarioService.getUsuarioById(novo.getUsuario());
			
			model.addAttribute("usuario", atual);
		}
		
        return "principal";
    }
	
}
