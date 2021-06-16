package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class TheCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
		System.out.println("go to the website boss");
	}
	
	  @RequestMapping(value="/")
	    public String index1() {
	       
	        return "home.jsp";
	    }
    @RequestMapping(value="/check",method=RequestMethod.POST)
    public String index(@RequestParam(value="thecode") String user) {
    	if(user.equals("bushido")) {
    		return "redirect:/code";
    	}else
       
        return "redirect:/createError";
    }
    
    
    @RequestMapping("/code")
    public String code() {
     
        return "code.jsp";
    }
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train hadrder!");
        return "redirect:/";
    }

}
