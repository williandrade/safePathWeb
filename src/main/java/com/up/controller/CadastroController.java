package com.up.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {

	@RequestMapping("/Cadastro")
	public ModelAndView init(){
		ModelAndView model = new ModelAndView("Cadastro");
		
		return model;
	}
}
