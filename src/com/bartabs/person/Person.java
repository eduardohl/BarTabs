package com.bartabs.person;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


public class Person {

	private Integer id;
	private String name;
	private String imagePath;
	private Double total;
	
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
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(id)
		.append(name)
		.append(imagePath)
		.append(total)
		.toHashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		} else if (o instanceof Person) {
			Person other = (Person) o;
			return new EqualsBuilder()
			.append(id, other.getId())
			.append(name, other.getName())
			.append(imagePath, other.getImagePath())
			.append(total, other.getTotal())
			.isEquals();
		}
		return false;
	}
}
