package com.nth.test;

public class Person {

	int age =1;
	String Address;

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
