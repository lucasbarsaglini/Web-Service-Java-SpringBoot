package com.example.web.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String decription;
	private Double price;
	private String imgUrl;
	
	@Transient
	private Set<Category> categories = new HashSet<>();
	
	public Product() {
	}

	public Product(Long id, String name, String decription, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.decription = decription;
		this.price = price;
		this.imgUrl = imgUrl;
	}

}
