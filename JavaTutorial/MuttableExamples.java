package com.nth.test;

public class MuttableExamples {
	public static void main(String[] args) {

		Person person = new Person();

		person.setAddress("harish");
		System.out.println(person.getAddress());
		person.Change(person);
		System.out.println(person.getAddress());

		FourWheelvehicle fourWheelvehicle = new FourWheelvehicle("seetring");

		System.out.println("Seetinrg " + fourWheelvehicle);

		fourWheelvehicle = fourWheelvehicle.changeSteering("powerseetring");

		System.out.println("Seetinrg " + fourWheelvehicle);

	}

}
