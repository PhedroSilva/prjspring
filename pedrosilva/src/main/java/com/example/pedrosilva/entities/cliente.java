package com.example.pedrosilva.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class cliente {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(name = "NCliente")
	private String nCliente;
	
	@Column(name = "telefone")
	private String fone;

	public Long GetId() {
		return idCliente;
	}
	
	public void setId(Long id) {
		this.idCliente = id;
	}
	
	public String getCliente() {
		return nCliente;
	}
	
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
}
