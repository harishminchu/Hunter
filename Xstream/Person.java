package com.nth.test;

public class Person {

	int age ;
	String Address;

	 public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String string) {
		this.Address = string;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	public void Change(Person person){
		person.setAddress("nanana");
	}
	
	public void ChangeAge(int age){
		
		age= 5;
		
	}

}
