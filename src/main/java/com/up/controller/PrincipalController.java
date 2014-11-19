package com.up.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.up.model.Feedback;
import com.up.model.Usuario;
import com.up.service.FeedBackService;
import com.up.service.UsuarioService;
import com.up.validador.Locais;

@Controller
public class PrincipalController {

	@Autowired
	private FeedBackService feedBackService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/Principal")
	public ModelAndView init(){
		ModelAndView model = new ModelAndView("Principal");
		
		return model;
	}
	
	@RequestMapping(value="/Principal", method=RequestMethod.GET)
	public ModelAndView doGet(@RequestParam(value="usuario")String usuario){
		ModelAndView model = new ModelAndView("Principal");
		
		Gson gson = new Gson();
		Usuario retorno = gson.fromJson(usuario, Usuario.class);
		
		model.addObject("usuario", retorno);
		
		return model;
	}

	@RequestMapping(value="/feedBack", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String feedBack(@RequestParam(value="feedbackText")String feedbackText,
						   @RequestParam(value="usuario")String usuario){

		Usuario feedbackUser = usuarioService.getUsuarioById(usuario);
		
		Feedback feed = new Feedback();
		feed.setFeedbackText(feedbackText);
		feed.setFeedbackUser(feedbackUser);
		
		Feedback retorno = feedBackService.addFeedBack(feed);
		
		return null;
	}
	
	@RequestMapping(value= "/getLocais", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getLocais(){
		List<Locais> tudo = new ArrayList<Locais>();
		
		StringBuffer html = new StringBuffer();
		
		html.append("<div class='row'>");
		html.append("<div class='col-md-12'>");
		html.append("Assalto de Carro");
		html.append("<hr style='margin-top: 0px;'>");
		html.append("</div>");
		html.append("<div class='col-md-10'>");
		html.append("<span class='label label-danger' style='margin: 5px;'>Carteira</span>");
		html.append("<span class='label label-danger' style='margin: 5px;'>Celular</span>");
		html.append("</div>");
		html.append("<div class='col-md-1'>");
		html.append("<span class='glyphicon glyphicon glyphicon-chevron-right' aria-hidden='true'></span>");
		html.append("</div>");
		html.append("</div>");
		
		tudo.add(new Locais("William", -25.472958, -49.125149, html.toString()));
		
		Gson gson = new Gson();
		
		String retorno = gson.toJson(tudo);
		
		return retorno;
	}

}
