package com.up.model;

import java.io.Serializable;

import javax.persistence.*;

import com.up.util.BaseDAO;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
public class Usuario extends BaseDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_FACEBOOK")
	private String userFacebook;

	@Column(name="USER_GOOGLE")
	private String userGoogle;

	@Column(name="USER_NOME")
	private String userNome;

	@Column(name="USER_PASS")
	private String userPass;

	public Usuario() {
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFacebook() {
		return this.userFacebook;
	}

	public void setUserFacebook(String userFacebook) {
		this.userFacebook = userFacebook;
	}

	public String getUserGoogle() {
		return this.userGoogle;
	}

	public void setUserGoogle(String userGoogle) {
		this.userGoogle = userGoogle;
	}

	public String getUserNome() {
		return this.userNome;
	}

	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

}