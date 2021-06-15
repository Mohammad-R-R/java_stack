package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHuman1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloHuman1Application.class, args);
		System.out.println("got othe website");
	}
	@RequestMapping("/h")
	public String first() {
		return "Hello Human \n Welcome to Spring boot! ";
		
	}
	@RequestMapping("/")
	 public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery==null) {
			return "write something bb in url after ?q= here";
			
		}
	        return "Hello " + searchQuery;
	    }

}
