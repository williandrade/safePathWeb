package com.up.model;

import java.io.Serializable;

import javax.persistence.*;

import com.up.util.BaseDAO;


/**
 * The persistent class for the veiculo_tipo database table.
 * 
 */
@Entity
@Table(name="veiculo_tipo")
public class VeiculoTipo extends BaseDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VEICULO_ID")
	private int veiculoId;

	@JoinColumn(name="ASSALTO_TIPO_ID")
	private AssaltoTipo assaltoTipoId;

	@Column(name="VEICULO_MODELO")
	private String veiculoModelo;

	public VeiculoTipo() {
	}

	public int getVeiculoId() {
		return this.veiculoId;
	}

	public void setVeiculoId(int veiculoId) {
		this.veiculoId = veiculoId;
	}

	public AssaltoTipo getAssaltoTipoId() {
		return this.assaltoTipoId;
	}

	public void setAssaltoTipoId(AssaltoTipo assaltoTipoId) {
		this.assaltoTipoId = assaltoTipoId;
	}

	public String getVeiculoModelo() {
		return this.veiculoModelo;
	}

	public void setVeiculoModelo(String veiculoModelo) {
		this.veiculoModelo = veiculoModelo;
	}

}