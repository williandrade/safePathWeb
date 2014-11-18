package com.up.model;

import java.io.Serializable;

import javax.persistence.*;

import com.up.util.BaseDAO;


/**
 * The persistent class for the cidade_bairro database table.
 * 
 */
@Entity
@Table(name="cidade_bairro")
public class CidadeBairro extends BaseDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CIDADE_BAIRRO_ID")
	private int cidadeBairroId;

	@Column(name="BAIRRO_NOME")
	private String bairroNome;

	public CidadeBairro() {
	}

	public int getCidadeBairroId() {
		return this.cidadeBairroId;
	}

	public void setCidadeBairroId(int cidadeBairroId) {
		this.cidadeBairroId = cidadeBairroId;
	}

	public String getBairroNome() {
		return this.bairroNome;
	}

	public void setBairroNome(String bairroNome) {
		this.bairroNome = bairroNome;
	}

}