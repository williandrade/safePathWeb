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
public class LoginController {
	
	@Autowired
    private UsuarioService usuarioService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request,HttpServletResponse res) {
		String usuario = request.getParameter("usuario");  
        String senha   = request.getParameter("senha");  
        ModelAndView model = new ModelAndView("Principal");
		
		if(usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")){
			Usuario atual = new Usuario();
			
			atual.setEmail("admin@admin.com.br");
			atual.setLogin("admin");
			atual.setSenha("admin");
			atual.setNome("Admin");
			
			model.addObject("usuario", atual);
		}
		
        return model;
    }
	
}
