package com.example.demo.model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public abstract class BaseModel implements Serializable{
	private static final long serialVersionUID = 6139774281752467202L;
	 
	
}
