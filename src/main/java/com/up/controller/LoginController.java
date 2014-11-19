package com.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.up.model.Usuario;
import com.up.service.UsuarioService;

@Controller
public class LoginController {
	
	@Autowired
    private UsuarioService usuarioService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam(value="usuario")String nome, 
							  @RequestParam(value="senha")String senha) {
		
		ModelAndView model;
		
		try{
			Usuario atual = usuarioService.getUsuarioById(nome);

			if(atual.getUserPass().equals(senha)){
				model = new ModelAndView("Principal");
				model.addObject("usuario", atual);
			}else{
				model = new ModelAndView("Cadastro");
			}
			
		}catch(Exception e){
			model = new ModelAndView("Cadastro");
		}
		
		return model;
    }
	
}
