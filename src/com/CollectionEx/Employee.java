package com.CollectionEx;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private String phone;
	private int id;
	
	
	public int compareTo(Employee o) {
		
		//return this.id-o.id;
		
		//return this.phone.compareTo(o.phone);
		
		return this.name.compareTo(o.name);
	}
	
	
	public Employee(String name, String phone, int id) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", id=" + id + "]";
	}
	
	
	
	
	

}
