package com.up.model;

import java.io.Serializable;

import javax.persistence.*;

import com.up.util.BaseDAO;


/**
 * The persistent class for the assalto_cidade database table.
 * 
 */
@Entity
@Table(name="assalto_cidade")
public class AssaltoCidade extends BaseDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AssaltoCidadePK id;

	@Column(name="CIDADE_ESTADO")
	private String cidadeEstado;

	@Column(name="CIDADE_NOME")
	private String cidadeNome;

	@Column(name="CIDADE_REGIAO")
	private String cidadeRegiao;

	public AssaltoCidade() {
	}

	public AssaltoCidadePK getId() {
		return this.id;
	}

	public void setId(AssaltoCidadePK id) {
		this.id = id;
	}

	public String getCidadeEstado() {
		return this.cidadeEstado;
	}

	public void setCidadeEstado(String cidadeEstado) {
		this.cidadeEstado = cidadeEstado;
	}

	public String getCidadeNome() {
		return this.cidadeNome;
	}

	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}

	public String getCidadeRegiao() {
		return this.cidadeRegiao;
	}

	public void setCidadeRegiao(String cidadeRegiao) {
		this.cidadeRegiao = cidadeRegiao;
	}

}