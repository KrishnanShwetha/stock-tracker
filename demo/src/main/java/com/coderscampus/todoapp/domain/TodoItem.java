package com.coderscampus.todoapp.domain;

public class TodoItem {
	
	private Integer id; 
	private String email;
	private String name;
	
	public String geEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	private Boolean isDone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	} 
	
	
		
		
}

