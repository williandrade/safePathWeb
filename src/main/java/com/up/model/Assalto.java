package com.up.model;

import java.io.Serializable;

import javax.persistence.*;

import com.up.util.BaseDAO;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the assalto database table.
 * 
 */
@Entity
public class Assalto extends BaseDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ASSALTO_ID")
	private int assaltoId;

	@Column(name="ASSALTO_CIDADE_CIDADE_BAIRRO_ID")
	private int assaltoCidadeCidadeBairroId;

	@Column(name="ASSALTO_CIDADE_CIDADE_ID")
	private int assaltoCidadeCidadeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ASSALTO_DATE")
	private Date assaltoDate;

	@Column(name="ASSALTO_LATITUDE")
	private BigDecimal assaltoLatitude;

	@Column(name="ASSALTO_LONGITUDE")
	private BigDecimal assaltoLongitude;

	@Lob
	@Column(name="ASSALTO_OBS")
	private String assaltoObs;

	@Column(name="ASSALTO_TIPO_ID")
	private int assaltoTipoId;

	@Column(name="ASSALTO_TITULO")
	private String assaltoTitulo;

	@JoinColumn(name="USUARIO_USER_LOGIN")
	private Usuario usuarioUserLogin;

	public Assalto() {
	}

	public int getAssaltoId() {
		return this.assaltoId;
	}

	public void setAssaltoId(int assaltoId) {
		this.assaltoId = assaltoId;
	}

	public int getAssaltoCidadeCidadeBairroId() {
		return this.assaltoCidadeCidadeBairroId;
	}

	public void setAssaltoCidadeCidadeBairroId(int assaltoCidadeCidadeBairroId) {
		this.assaltoCidadeCidadeBairroId = assaltoCidadeCidadeBairroId;
	}

	public int getAssaltoCidadeCidadeId() {
		return this.assaltoCidadeCidadeId;
	}

	public void setAssaltoCidadeCidadeId(int assaltoCidadeCidadeId) {
		this.assaltoCidadeCidadeId = assaltoCidadeCidadeId;
	}

	public Date getAssaltoDate() {
		return this.assaltoDate;
	}

	public void setAssaltoDate(Date assaltoDate) {
		this.assaltoDate = assaltoDate;
	}

	public BigDecimal getAssaltoLatitude() {
		return this.assaltoLatitude;
	}

	public void setAssaltoLatitude(BigDecimal assaltoLatitude) {
		this.assaltoLatitude = assaltoLatitude;
	}

	public BigDecimal getAssaltoLongitude() {
		return this.assaltoLongitude;
	}

	public void setAssaltoLongitude(BigDecimal assaltoLongitude) {
		this.assaltoLongitude = assaltoLongitude;
	}

	public String getAssaltoObs() {
		return this.assaltoObs;
	}

	public void setAssaltoObs(String assaltoObs) {
		this.assaltoObs = assaltoObs;
	}

	public int getAssaltoTipoId() {
		return this.assaltoTipoId;
	}

	public void setAssaltoTipoId(int assaltoTipoId) {
		this.assaltoTipoId = assaltoTipoId;
	}

	public String getAssaltoTitulo() {
		return this.assaltoTitulo;
	}

	public void setAssaltoTitulo(String assaltoTitulo) {
		this.assaltoTitulo = assaltoTitulo;
	}

	public Usuario getUsuarioUserLogin() {
		return this.usuarioUserLogin;
	}

	public void setUsuarioUserLogin(Usuario usuarioUserLogin) {
		this.usuarioUserLogin = usuarioUserLogin;
	}

}