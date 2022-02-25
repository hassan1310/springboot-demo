package com.springboot.test.springbootdemo.dao;

public class Book {
	
	private long id;
	String name;
	String Auther;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return Auther;
	}
	public void setAuther(String auther) {
		Auther = auther;
	}
	public Book(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		Auther = auther;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", Auther=" + Auther + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAuther()=" + getAuther() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
