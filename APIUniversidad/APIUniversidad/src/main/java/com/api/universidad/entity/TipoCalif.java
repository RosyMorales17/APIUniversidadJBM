package com.api.universidad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipocalif")

public class TipoCalif {
	//llave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcalif")
	private int idcalif;
	
	@Column(name = "descripcion")
	private String descripcion;

	public int getIdcalif() {
		return idcalif;
	}

	public void setIdcalif(int idcalif) {
		this.idcalif = idcalif;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
