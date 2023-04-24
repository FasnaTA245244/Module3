package com.ust.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/test")
public class FirstbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootappApplication.class, args);
	}
	
	@GetMapping("/first")
	//@RequestMapping("/first")
	public String respond()
	{
		return "My first REST Controller";
	}
	
	
	@GetMapping("/second")
	//@RequestMapping("/second")
	public String message()
	{
		return "Naaj, Sree, Anwar, Megh";
	}
	
	@GetMapping("/third/{custname}")
	public String greetings(@PathVariable  String custname)
	{
		return "Hello Dear " + custname;
	}
	
	@GetMapping("/fourth/{custname}/gender/{gen}")
	public String greetings(@PathVariable  String custname, @PathVariable String gen)
	{
		if(gen.equals("male"))
		{
			return "Hello Mr. " +custname;
		}
		else if(gen.equals("female"))
		{
			return "Hello Mrs. "+ custname;
		}
		else
		{
			return "Hello" + custname;
		}
	}
	


}
