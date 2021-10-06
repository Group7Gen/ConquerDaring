package org.grupo7.conquerdaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios" )
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario;
	
	@NotNull
	@Size(min = 2, max = 50, message = "O atributo nome é obrigatório, deve conter no minimo 02 e no maximo 100 caracteres")
	private String nome_completo;
	
	@NotNull
	@Size(min = 2, max = 50, message = "O atributo nome é obrigatório, deve conter no minimo 02 e no maximo 100 caracteres")
	private String email;
	
	@NotNull
	@Size(min = 5, max = 10, message = "O atributo nome é obrigatório, deve conter no minimo 05 e no maximo 10 caracteres")
	private String senha;

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	/*
	public void setSenha(String senha) {
		this.senha = senha;
	}
	*/
}