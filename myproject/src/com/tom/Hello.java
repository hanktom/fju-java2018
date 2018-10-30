package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int a = 1;
		while(a > 0){
			System.out.println("AAAA");
			a = a - 1;
		}
		
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		float n = 10.6646677f;
		String nick = "Tom";
		System.out.printf("Hi, %s, Your age: %.2f\n",  nick, n );
		
		double c = 24;
		System.out.println(c*(9/5)+32);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name:");
		String name = scanner.nextLine();
		System.out.println(name);
		
		
		Student stu = new Student("Hank", 70, 90);
		stu.print();
		System.out.println(3 <= 5);
		String s = new String("abc");
		System.out.println(s);
		String s2 = "abc";
		System.out.println(s == s2);
		
		Student jack = new Student();
		/*stu.name = "Hank";
		stu.english = 70;
		stu.math = 90;*/
		
		Person p = new Person(65.5f, 1.7f);
		System.out.println(p.bmi());
		p.hello();
		
//		p.weight = 65.5f;
//		p.height = 1.7f;
		
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
