package com.up.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView cadastrar(@RequestParam(value="email")String email,
								  @RequestParam(value="senha")String senha,
								  @RequestParam(value="login")String login,
								  @RequestParam(value="primeiroNome")String primeiroNome,
								  @RequestParam(value="segundoNome")String segundoNome){
		Usuario user = new Usuario();

		user.setUserNome(primeiroNome + segundoNome);
		user.setUserEmail(email);
		user.setUserLogin(login);
		user.setUserPass(senha);
		
		usuarioService.addUsuario(user);
		
		ModelAndView model = new ModelAndView("Principal");
		model.addObject("usuario", user);
		
		return model;
	}
}
