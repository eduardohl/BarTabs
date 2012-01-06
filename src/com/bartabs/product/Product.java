package com.bartabs.product;

import java.util.Collection;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.bartabs.person.Person;

public class Product {

	private Integer id;
	private String name;
	private String imagePath;
	private Double price;
	private Collection<Person> eaters;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public Collection<Person> getEaters() {
		return eaters;
	}
	public void setEaters(Collection<Person> eaters) {
		this.eaters = eaters;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(id)
		.append(name)
		.append(price)
		.append(imagePath)
		.toHashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		} else if (o instanceof Product) {
			Product other = (Product) o;
			return new EqualsBuilder()
			.append(id, other.getId())
			.append(name, other.getName())
			.append(price, other.getPrice())
			.append(imagePath, other.getImagePath())
			.isEquals();
		}
		return false;
	}
}
