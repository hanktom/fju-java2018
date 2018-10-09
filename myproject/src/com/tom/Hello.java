package com.tom;

public class Hello {

	public static void main(String[] args) {
		Person p = new Person(65.5f, 1.7f);
//		p.weight = 65.5f;
//		p.height = 1.7f;
		System.out.println(p.bmi());
		p.hello();
//		Person hank = new Person();
//		Person jack = null;
//		jack.hello();
		/*System.out.println("Hello world");
		int age = 20;
		float weight = 65.5f;
		float height = 1.7f;
		String name = "Hank";
		int schoolYear = 107;
		System.out.println(age);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(name);
		float bmi = weight / (height * height); 
		System.out.println(bmi);
		age = age + 1;
		System.out.println(age);
		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println(f);*/
	}

}
