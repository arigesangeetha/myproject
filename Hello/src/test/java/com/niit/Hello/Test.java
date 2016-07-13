package com.niit.Hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
	con.scan("com.niit.Hello");
	con.refresh();
	Category c = (Category) con.getBean("category");
	Product p =(Product) con.getBean("product");
	System.out.println("successfully");
	p.setId("1234");
	p.setName("sumsung");
	p.setQuality("good");
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getQuality());
	
	
	
}
}
