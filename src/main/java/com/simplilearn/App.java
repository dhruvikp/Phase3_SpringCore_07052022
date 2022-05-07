package com.simplilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

		Employee e = (Employee) context.getBean("e1");
		System.out.println(e);
	}
}
