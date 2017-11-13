package com.teksystems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.context.annotation.Bean;

@XmlRootElement(name="ToDo")
@Entity()
public class ToDo {
	
	@Id
	private int id;
	
	private String text;
	private boolean completed;

	public ToDo() {}
	
	public ToDo(int id, String text, boolean completed) {
		this.id = id;
		this.text = text;
		this.completed = completed;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
}
