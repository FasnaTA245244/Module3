module IOC {
	exports com.ust.ioc;
	exports com.ust.ioc2;
	exports com.ust.iocautowiring;
	exports com.ust.javaconfig;
	
	requires spring.beans;
	requires spring.core;
	requires java.sql;
	requires spring.context;
	requires java.annotation;
	
	opens com.ust.javaconfig to spring.core;
}