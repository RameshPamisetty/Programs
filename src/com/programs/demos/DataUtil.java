package com.programs.demos;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public List<Student> getStudentDetails() {
		Student student1 = new Student(101, "Ramesh", "Male", 10000, 10000, "SpringBoot");
		Student student2 = new Student(102, "Roja", "Female", 12000, 8000, "Spring");
		Student student3 = new Student(103, "Rakesh", "Male", 8000, 10000, "Core Java");
		Student student4 = new Student(104, "Divya", "Female", 5000, 15000, "SpringBoot");
		Student student5 = new Student(105, "Rajesh", "Male", 2000, 18000, "Microservices");
		Student student6 = new Student(106, "Suresh", "Male", 15000, 5000, "Core Java");
		Student student7 = new Student(107, "Shiri", "Female", 12000, 8000, "Spring");
		Student student8 = new Student(108, "Satish", "Male", 7000, 13000, "Microservices");

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		list.add(student8);

		return list;

	}
}
