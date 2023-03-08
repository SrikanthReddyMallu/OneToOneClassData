package com.onetoone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonAdharMain
{
public static void main(String[] args) 
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
	Person person = (Person) applicationContext.getBean("myperson");
	
	
   System.out.println(person.getId());
   System.out.println(person.getName());
   System.out.println(person.getAge());
   System.out.println(person.getGender());
   System.out.println(person.getPhno());
   System.out.println(person.getCard().getId());
   System.out.println(person.getCard().getAddress());
}
}
