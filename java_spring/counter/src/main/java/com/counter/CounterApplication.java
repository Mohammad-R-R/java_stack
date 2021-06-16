package com.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class CounterApplication {
static int c=0;
	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
		System.out.println("got to the web site");
	}
	
	@RequestMapping("")
	public String home() {
		return "homepage.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int cs=(int) session.getAttribute("count");
			cs++;
			session.setAttribute("count", cs);
		}
		


        
        
       
		
		return "counter.jsp";
	}
	
	
	@RequestMapping("/counter2")
	public String counterwith2(HttpSession session) {
		
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int cs=(int) session.getAttribute("count");
			cs+=2;
			session.setAttribute("count", cs);
		}
		


        
        
       
		
		return "count_plus_2.jsp";
	}

}
