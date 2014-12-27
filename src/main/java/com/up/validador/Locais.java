package com.up.validador;

public class Locais {

	private String nome;
	private double latitude;
	private double longitude;
	private int prioridade;

	public Locais(String nome, double latitude, double longitude, int prioridade) {
		super();
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.prioridade = prioridade;
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
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	
}
