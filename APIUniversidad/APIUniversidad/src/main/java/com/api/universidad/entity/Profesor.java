package com.api.universidad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")

public class Profesor {
	//llave primaria
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idprofesor")
		private int idprofesor;
		
		@Column(name = "nombre")
		private String nombre;
		
		@Column(name = "direccion")
		private String direccion;
		
		@Column(name = "genero")
		private char genero;
		
		@Column(name = "profesion")
		private String profesion;

		public int getIdprofesor() {
			return idprofesor;
		}

		public void setIdprofesor(int idprofesor) {
			this.idprofesor = idprofesor;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public char getGenero() {
			return genero;
		}

		public void setGenero(char genero) {
			this.genero = genero;
		}

		public String getProfesion() {
			return profesion;
		}

		public void setProfesion(String profesion) {
			this.profesion = profesion;
		}
}
