package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.ioc.Connection;
import com.ust.ioc.Login;
import com.ust.iocautowiring.B;

public class TestDrawing {
public static void main(String[] args) {
	
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	B b = (B) context.getBean("b");
	System.out.println(b);
	context.registerShutdownHook();
	

//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
//	Object obj = factory.getBean("line");
//	 
//	
//	
//	Line li = (Line)obj;
//	li.drawLine(); 
	
	//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	context.registerShutdownHook();
//	boolean exists = context.containsBean("line");
//	System.out.println(exists);
//	if(exists)
//	{
//		Object object = context.getBean("line");
//		if(object instanceof Line)
//		{
//			Line line = (Line) object;
//			line.drawLine();
//		}
//		
//	}
//		
//	boolean type = context.isSingleton("line");
//	System.out.println(type);
//	Object object = context.getBean("line");
//	Object object2 = context.getBean("line");
//	if( object.hashCode() == object2.hashCode())
//	{
//		System.out.println("Line is singleton");
//	}
//	else
//	{
//		System.out.println("Line is not singleton");
//	}
	/*
	 * Line line1 = (Line)context.getBean("line"); Line line2 =
	 * (Line)context.getBean("line"); if( line1.hashCode() == line2.hashCode()) {
	 * System.out.println("Line is singleton"); } else {
	 * System.out.println("Line is not singleton"); }
	 */
}
}
			

