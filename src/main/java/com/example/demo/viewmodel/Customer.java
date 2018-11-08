package com.example.demo.viewmodel;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@EqualsAndHashCode (callSuper = true)
public class Customer extends BaseModel{
	
	private static final long serialVersionUID = -338470709597595899L;
	//@Id ObjectId id;
	 @Id int id;

	private String firstname;
	private String lastname;
	private String country;
	private int age;
	private boolean active;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Customer() {
	}
 
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAge(int age) {
		this.age = age;
	}
 
	public int getAge() {
		return this.age;
	}
 
	public boolean isActive() {
		return active;
	}
 
	public void setActive(boolean active) {
		this.active = active;
	}
 
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Customer [ firstname=" + firstname + ", lastname=" + lastname+ ", age=" + age + ", country=" + country + ", active=" + active + "]";
	}
}
