package com.boot.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "amount")
	private Double amount;

    @Column(name="explanation")
    private String explanation;
//    

	public Inventory() {

	}

	public Inventory(Long id, String name, Double amount, String explanation) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.explanation = explanation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getExplanation() { return explanation; }
	
	public void setExplanation(String explanation) { this.explanation =
	  explanation; }
	 

}
