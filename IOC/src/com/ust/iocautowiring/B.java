package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
public B()
{
	
}
	public B(A a)
	{
		this.a = a;
		System.out.println("from B() constructor...");
	}
	
	@Qualifier("a")
	public void  setA(A a)
	{
		//byName byType will use setter injection
		System.out.println("setA() called...");
		this.a = a;
	}
	
	
	
	@PostConstruct  // this annotation  treats the following method as init()
	public void setUp()
	{
		System.out.println("from setup()...");
	}
	
	@PreDestroy
	public void windp()
	{
		System.out.println("from windup()...");
	}

}
