package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class frtcls 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		
		University un=(University) context.getBean("ab");
		System.out.println(un);
		
		
	}
}