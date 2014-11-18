package com.up.model;

import java.io.Serializable;

import javax.persistence.*;

import com.up.util.BaseDAO;


/**
 * The persistent class for the assalto_tipo database table.
 * 
 */
@Entity
@Table(name="assalto_tipo")
public class AssaltoTipo extends BaseDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ASSALTO_TIPO_ID")
	private int assaltoTipoId;

	@Column(name="ASSALTO_TIPO_NOME")
	private String assaltoTipoNome;

	public AssaltoTipo() {
	}

	public int getAssaltoTipoId() {
		return this.assaltoTipoId;
	}

	public void setAssaltoTipoId(int assaltoTipoId) {
		this.assaltoTipoId = assaltoTipoId;
	}

	public String getAssaltoTipoNome() {
		return this.assaltoTipoNome;
	}

	public void setAssaltoTipoNome(String assaltoTipoNome) {
		this.assaltoTipoNome = assaltoTipoNome;
	}

}