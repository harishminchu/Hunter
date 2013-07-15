package com.nth.test;

public class Triangle {
	public static void main(String[] args) {
		int a=4;
		int b=4;
		int c=5;
		
		System.out.println((c^2)==(a^2+b^2)?"Right angled triangle":((c^2)<(a^2+b^2)?"Acute angled triangle":((c^2)>(a^2+b^2)?"Obtuse angled triangle":"")));
		System.out.println(a==b&&a==c?"Equilateral Triangle":(a==b||a==c||b==c?"Isoceles triangle":""));
		
		}}
	

