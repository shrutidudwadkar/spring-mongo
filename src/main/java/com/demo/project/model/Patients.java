package com.demo.project.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Patients {

	
	@Id
	 public ObjectId _id;
	 public String name;
	 public int id;
	 public String city;
	 
	 
	 public Patients() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	 
	public Patients(ObjectId _id, String name, int id, String city) {
		super();
		this._id = _id;
		this.name = name;
		this.id = id;
		this.city = city;
	}



	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 
	 
	 
}
