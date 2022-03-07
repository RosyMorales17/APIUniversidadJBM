package com.api.universidad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")

public class Alumno {
	//llave primaria
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "matricula")
			private int matricula;
			
			@Column(name = "nombre")
			private String nombre;
			
			@Column(name = "direccion")
			private String direccion;
			
			@Column(name = "genero")
			private char genero;
			
			@Column(name = "telefono")
			private char telefono;
			
			@Column(name = "correo")
			private String correo;

			public int getMatricula() {
				return matricula;
			}

			public void setMatricula(int matricula) {
				this.matricula = matricula;
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

			public char getTelefono() {
				return telefono;
			}

			public void setTelefono(char telefono) {
				this.telefono = telefono;
			}

			public String getCorreo() {
				return correo;
			}

			public void setCorreo(String correo) {
				this.correo = correo;
			}
}
