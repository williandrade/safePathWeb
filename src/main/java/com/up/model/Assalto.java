package com.up.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ASSALTO")
public class Assalto {

	@Id
    @Column(name="ASSALTO_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name="ASSALTO_USER_LOGIN")
	private Usuario usuario;
	
	@Column(name="ASSALTO_OBS")
	private String observacao;
	
	@Column(name="ASSALTO_DATE")
	private Date data;
	
	@Column(name="ASSALTO_LATITUDE")
	private double latitude;
	
	@Column(name="ASSALTO_LONGITUDE")
	private double longitude;
	
	@Column(name="ASSALTO_TITULO")
	private String titulo;
	
}
