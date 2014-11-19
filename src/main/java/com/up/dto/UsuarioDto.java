package com.up.dto;

import javax.persistence.Column;

public class UsuarioDto {

	private String userLogin;

	private String userEmail;

	private String userFacebook;

	private String userGoogle;

	private String userNome;

	private String userPass;

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFacebook() {
		return userFacebook;
	}

	public void setUserFacebook(String userFacebook) {
		this.userFacebook = userFacebook;
	}

	public String getUserGoogle() {
		return userGoogle;
	}

	public void setUserGoogle(String userGoogle) {
		this.userGoogle = userGoogle;
	}

	public String getUserNome() {
		return userNome;
	}

	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	
	
}
