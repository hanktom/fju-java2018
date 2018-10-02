package com.tom;

public class Person {
	float weight;
	float height;
	
	public void hello(){
		System.out.println("Hello");
	}
	
	public float bmi() {
		float bmi = weight / (height * height);
		return bmi;
	}

}
