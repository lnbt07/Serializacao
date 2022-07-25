package br.com.carolinabartoli.bean;

import java.io.Serializable;

public class Cliente implements Serializable {
		
	private static final long serialVersionUID = -1243662610490344431L;

	private String nome;
	
	private int id;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
