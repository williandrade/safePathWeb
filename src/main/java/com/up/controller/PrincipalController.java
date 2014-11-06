package com.up.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.up.model.Feedback;
import com.up.validador.Locais;

@Controller
public class PrincipalController {

	@RequestMapping("/Principal")
	public ModelAndView init(){
		ModelAndView model = new ModelAndView("Principal");
		
		return model;
	}
	
	@RequestMapping(value= "/getLocais", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getLocais(){
		List<Locais> tudo = new ArrayList<Locais>();
		
		tudo.add(new Locais("William", -25.472958, -49.125149, 1));
		tudo.add(new Locais("Maria", -25.472958, -49.124149, 2));
		tudo.add(new Locais("Jose", -25.472958, -49.123149, 3));
		
		Gson gson = new Gson();
		
		String retorno = gson.toJson(tudo);
		
		return retorno;
	}
   
	@RequestMapping(value= "/sendFeedback", method = RequestMethod.POST)
	@ResponseBody
	public void sendFeedBack(HttpServletRequest request,HttpServletResponse res){
		String feedbackText = request.getParameter("feedbackText");  
		Feedback fb = new Feedback(feedbackText, "admin");
		System.out.println("Registrando feedback: " + feedbackText);
		
		Gson gson = new Gson();
		
		String retorno = gson.toJson(fb);
	}
}
