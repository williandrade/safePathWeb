package com.up.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.up.validador.Locais;

@Controller
public class PrincipalController {

	@RequestMapping("/Principal")
	public ModelAndView init(){
		ModelAndView model = new ModelAndView("Principal");
		
		return model;
	}
	
	@RequestMapping(value= "/getLocais", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Locais getLocais(){
		Locais novo = new Locais("William", -25.472958, -49.124149, 1);
		return novo;
	}
   
}
