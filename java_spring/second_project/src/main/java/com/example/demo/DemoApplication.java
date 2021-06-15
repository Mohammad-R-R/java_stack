package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello ");
	}
	@RequestMapping(value="/coding",method=RequestMethod.GET)
    
    public String hello() { 
            return "Hello coding dojo";
    }
	
	@RequestMapping("/coding/python")
   
    public String wel() { 
            return " python/django was awesome";
    }
	@RequestMapping("/coding/java")
	public String rd() { 
        return " java/spring is better!";
}
	@RequestMapping("/")
    public String index(@RequestParam(value="q",required = false)  String searchQuery) {
        return "You searched for: " + searchQuery;
    }
	
    @RequestMapping("/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String trac, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + trac + ", Module: " + module + ", Lesson: " + lesson;
    
    }
    
    @RequestMapping ("/{str}")
	public String dojo(@PathVariable("str") String k){
		return "the "+k+" is awesome";
	}
    
    @RequestMapping("/second/{roar}")
    public String locate(@PathVariable("roar") String s1) {
    	return s1+" located in south clifornia";
    	
    }
    @RequestMapping("/m/{japan}")
    public String jep(@PathVariable("japan") String s2 ) {
//    	String []s1 ;
//    	s1=s2.split("-");
//    	int i =0;
//    	String [] c = null;
//    	StringBuffer x2 = null;
//    	
//    	  for (String a : s1) {
//    		  char x =a.charAt(0);
//    		  
//    		  
//    		  System.out.println(x);
//              System.out.println(a);
//              c[i] = ""+x;
//              i++;
//               x2 = new StringBuffer().append(x); 
//              
//      }
//    	 
//    	  System.out.println("this is the "+c[0]);
    	return "Sj dojo is the ";
    	
    }

}
