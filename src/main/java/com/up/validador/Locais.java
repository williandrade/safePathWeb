package com.up.validador;

public class Locais {

	private String nome;
	private double latitude;
	private double longitude;
	private String descricao;

	public Locais(String nome, double latitude, double longitude, String descricao) {
		super();
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.setDescricao(descricao);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double isLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double isLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
