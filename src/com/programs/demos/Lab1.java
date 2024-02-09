package com.programs.demos;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lab1 {

	public static void main(String[] args) {

		DataUtil util = new DataUtil();

		List<Student> list = util.getStudentDetails();

		list.stream().filter(stu -> stu.getFeeBal() >= 10000).distinct().collect(Collectors.toSet())
				.forEach(System.out::println);
		System.out.println("---------------------");

		list.stream().filter(stu -> stu.getGender() == "Female")
				.sorted((stu1, stu2) -> stu1.getStuName().compareToIgnoreCase(stu2.getStuName()))
				.forEach(System.out::println);

		System.out.println("---------------------");
		list.stream().filter(stu1 -> stu1.getFeeBal() >= 12000)
				.sorted((stu1, stu2) -> stu2.getStuName().compareTo(stu1.getStuName())).forEach(System.out::println);

		System.out.println("---------------------");

		list.stream().filter(stu1 -> stu1.getFeeBal() >= 12000)
				.sorted((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid())).forEach(System.out::println);

		System.out.println("---------------------");

		list.stream().filter(stu1 -> stu1.getCourseName().equalsIgnoreCase("Springboot"))
				.sorted((stu1, stu2) -> stu1.getStuName().compareTo(stu2.getStuName())).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("---------------------");

		long count = list.stream().filter(stu1 -> stu1.getCourseName().equalsIgnoreCase("Springboot"))
				.sorted((stu1, stu2) -> stu1.getStuName().compareTo(stu2.getStuName())).collect(Collectors.counting());

		System.out.println(count);

		System.out.println("---------------------");

		long count1 = list.stream().filter(stu1 -> stu1.getCourseName().equalsIgnoreCase("Springboot"))
				.filter(stu1 -> stu1.getFeeBal() > 12000)
				.sorted((stu1, stu2) -> stu1.getStuName().compareTo(stu2.getStuName())).collect(Collectors.counting());

		System.out.println(count1);

		System.out.println("---------------------");

		Optional<Student> opStu = list.stream().max((stu1, stu2) -> (int) (stu1.getFeeBal() - stu2.getFeeBal()));

		opStu.ifPresent(System.out::println);
		
		System.out.println("---------------------");

		Optional<Student> opStu1 = list.stream().min((stu1, stu2) -> (int) (stu1.getFeeBal() - stu2.getFeeBal()));

		opStu1.ifPresent(System.out::println);
		
		System.out.println("---------------------");
		
		Map<String, List<Student>> map= list.stream().collect(Collectors.groupingBy(Student::getGender));
		
		for(String gen:map.keySet()) {
			List<Student> mylist= map.get(gen);
			System.out.println("Student Gender :"+ gen);
			mylist.forEach(System.out::println);
		}
		
		System.out.println("---------------------");
		
		map= list.stream()
				.sorted((stu1,stu2) -> stu1.getStuName().compareTo(stu2.getStuName()))
				.collect(Collectors.groupingBy(Student::getCourseName));
		
		for(String cName:map.keySet()) {
			List<Student> my= map.get(cName);
			System.out.println("Student CourseName Details of Joining :" + cName);
			my.forEach(System.out::println);
		}
		
		System.out.println("---------------------");
		
		double totalFeePaid=list.stream().collect(Collectors.summingDouble(Student::getFeePaid));
		System.out.println(totalFeePaid);
		
		System.out.println("---------------------");
		
		//list.stream().collect(Collectors.groupingBy(Student::getFeeBal,Coll))
	}

}
