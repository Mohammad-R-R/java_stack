package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.models.Dojo;
import com.example.models.Ninja;
import com.example.services.dojoservices;
import com.example.services.ninjaservices;
@Controller
public class dojoController {
	private final dojoservices dojoservice;
	private final ninjaservices ninjaservice;
	public dojoController(dojoservices dojoservice, ninjaservices ninjaservice) {
		super();
		this.dojoservice = dojoservice;
		this.ninjaservice = ninjaservice;
	}
	@RequestMapping("/")
	public String creatDojo(Model model,@ModelAttribute("dojo") Dojo d) {
		model.addAttribute("name", dojoservice.findAll());
		return "newDojo.jsp";
	}
	
	@RequestMapping(value="/tocreate",method=RequestMethod.POST)
	public String toCreate(@ModelAttribute("dojo") Dojo d ) {
		
		dojoservice.create(d);
		return "redirect:/";
		
	}
	
	@RequestMapping("/ninja")
	public String ninjaShow(Model model,@ModelAttribute("ninja") Ninja n) {
		model.addAttribute("name", dojoservice.findAll());
		return "ninja.jsp";
	}
	
	@RequestMapping(value="/toCreateNinja",method=RequestMethod.POST)
	public String toCreateNinja(@ModelAttribute("ninja") Ninja n,Model model) {
		
		Ninja d = new Ninja( );
		ninjaservice.create(n);
		return "redirect:/ninja";
		
	}
	
	@RequestMapping("/toshow/{id}")
	public String showlam(@PathVariable("id") long id,Model model,Model model2) {
		Dojo x1= dojoservice.findbyid(id).orElse(null);
		model.addAttribute("name", dojoservice.findAll());
		model2.addAttribute("name2", x1);


		return "toshow.jsp";
	}
	
	
	
	
	
	

	
	

}
