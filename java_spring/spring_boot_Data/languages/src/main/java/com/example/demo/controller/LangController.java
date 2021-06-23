package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.model;
import com.example.demo.services.LanguageServices;


@Controller
public class LangController {
	
private final LanguageServices languageServices;
	
	public LangController(LanguageServices languageServices) {
		this.languageServices = languageServices;
	}
	
	
	@RequestMapping("/")
	public String show(Model model){
		
		model.addAttribute("model",languageServices.finaAllSongs());
		
		return "welcome.jsp";
	}
	
	@RequestMapping(value="/getinf",method=RequestMethod.POST)
	public String post(@RequestParam("name") String name , @RequestParam("creator") String creator,@RequestParam("version") double ver,Model mm){
		model model = new model(name, creator, ver);
		languageServices.create(model);
		
		return "redirect:/num";
	}
	
	@RequestMapping("/num")
	public String show2(Model model){
		
		return "redirect:/";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable("id")Long id ) {
		languageServices.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model,@ModelAttribute("language") model language) {
	        model.addAttribute("lang", languageServices.findLanguage(id));
	        return "edit.jsp";
	    }
	 
	 @RequestMapping(value="/hello/{id}", method=RequestMethod.PUT)
		public String Update(@Valid @ModelAttribute("language") model lang, BindingResult result) {
			if(result.hasErrors())
				return "edit.jsp";
			languageServices.updateLanguage(lang);
			return "redirect:/";
		}
	 
	 @RequestMapping("show/{id}")
		public String show(@PathVariable("id")Long id ,Model model) {
			
			model.addAttribute("add",languageServices.findLanguage(id) );
			return "show.jsp";
		}

}
