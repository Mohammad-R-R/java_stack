package com.display_date;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
		System.out.println("go to website");
	}
	  
	
		  @RequestMapping("")
		  public String index() {
		        return "home.jsp";
		    }
		  @RequestMapping("/date")
		    public String index2(Model model) {
			  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
			   LocalDateTime now = LocalDateTime.now();  
			   model.addAttribute("date", dtf.format(now));
		        return "date.jsp";
		    }
		  @RequestMapping("/time")
		    public String time(Model model) {
			  DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:mm:am");  
			   LocalDateTime now = LocalDateTime.now();  
			   model.addAttribute("date", dtf.format(now));
		        return "time.jsp";
		    }
		  
	  
	    

}
