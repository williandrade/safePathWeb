package com.up.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the assalto_cidade database table.
 * 
 */
@Embeddable
public class AssaltoCidadePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CIDADE_ID")
	private int cidadeId;

	@Column(name="CIDADE_BAIRRO_ID")
	private int cidadeBairroId;

	public AssaltoCidadePK() {
	}
	public int getCidadeId() {
		return this.cidadeId;
	}
	public int getCidadeBairroId() {
		return this.cidadeBairroId;
	}
	public void setCidadeBairroId(int cidadeBairroId) {
		this.cidadeBairroId = cidadeBairroId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AssaltoCidadePK)) {
			return false;
		}
		AssaltoCidadePK castOther = (AssaltoCidadePK)other;
		return 
			(this.cidadeId == castOther.cidadeId)
			&& (this.cidadeBairroId == castOther.cidadeBairroId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cidadeId;
		hash = hash * prime + this.cidadeBairroId;
		
		return hash;
	}
}