package com.up.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.up.util.BaseDAO;


@Entity
@Table(name = "USUARIO")
public class Usuario extends BaseDAO{

	@Id
	@Column(name="USER_LOGIN")
	private String login;
	
	@Column(name="USER_NOME")
	private String nome;

	@Column(name="USER_PASS")
	private String senha;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_FACEBOOK")
	private String facebook;

	@Column(name="USER_GOOGLE")
	private String google;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getGoogle() {
		return google;
	}

	public void setGoogle(String google) {
		this.google = google;
	}

}
