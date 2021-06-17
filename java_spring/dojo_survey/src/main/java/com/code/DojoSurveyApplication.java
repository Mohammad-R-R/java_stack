package com.code;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DojoSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home () {
		return "home.jsp";
	}
	
	
	@RequestMapping("/submit")
	public String home2 (Model models,@RequestParam(value="name")String name , @RequestParam(value="combo")String location,@RequestParam(value="lang")String lang,HttpSession s1,@RequestParam(value="comment")String comment) {
		s1.setAttribute("name", name);
		s1.setAttribute("loc", location);
		s1.setAttribute("lang", lang);
		s1.setAttribute("comment", comment);
		models.addAttribute(s1);
		return "redirect:/show";
	}
	@RequestMapping("/show")
	public String show () {
		return "show.jsp";
	}
	
	

}
