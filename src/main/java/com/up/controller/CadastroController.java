package com.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.up.dto.UsuarioDto;
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
	
	@RequestMapping(value="/Cadastro", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String cadastrar(@RequestParam(value="email")String email,
						   @RequestParam(value="senha")String senha,
						   @RequestParam(value="login")String login,
						   @RequestParam(value="primeiroNome")String primeiroNome,
						   @RequestParam(value="segundoNome")String segundoNome){
		UsuarioDto user = new UsuarioDto();

		user.setUserNome(primeiroNome+" "+segundoNome);
		user.setUserEmail(email);
		user.setUserLogin(login);
		user.setUserPass(senha);
		
		UsuarioDto novo = usuarioService.addUsuario(user);
		Gson gson = new Gson();
		
		String retorno = gson.toJson(novo);
		
		return retorno;
	}
}
