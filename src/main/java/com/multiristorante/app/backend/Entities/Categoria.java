package com.multiristorante.app.backend.Entities;

import lombok.Data;

import javax.persistence.*;

import java.util.List;

@Entity
@Data
@Table(name = "categoria")
public class Categoria {

	@Id
	private Integer categoria_id;
	@Column(nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy="categoria_id")
	private List<Restaurante> restaurante;
	
}
