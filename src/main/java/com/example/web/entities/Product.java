package com.example.web.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;

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

	@ManyToMany
	@Getter
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories = new HashSet<>();
	
	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> items = new HashSet<>();

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

	@JsonIgnore
	public Set<Order> getOrders(){
		Set<Order> set = new HashSet<>();
		for (OrderItem x : items) {
			set.add(x.getOrder());
		}
		return set;
	}
}
