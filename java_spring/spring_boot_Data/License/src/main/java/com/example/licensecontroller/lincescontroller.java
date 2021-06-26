package com.example.licensecontroller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lincesservices.Lincesservices;
import com.example.lincesservices.Personservices;
import com.example.models.License;
import com.example.models.Person;
@Controller
public class lincescontroller {
	private final Lincesservices lincesservices;
	private final Personservices personservices;

	public lincescontroller(Personservices personservices,Lincesservices lincesservices) {
		
		this.personservices = personservices;
		this.lincesservices=lincesservices;
	}


	
	
	
	@RequestMapping("/show/line")
	public String show(Model model,@ModelAttribute("License")License l,HttpSession session) {
		
		List<Person> x=personservices.showall();
		model.addAttribute("x",x);
		
		return "newline.jsp";
	}
	
	@RequestMapping(value="/tocreate/line",method=RequestMethod.POST)
	public String topost(@Valid @ModelAttribute("License") License l ,BindingResult result) {
		
		if (result.hasErrors()) {
	        return "newline.jsp";
	    } else {
	    	lincesservices.create(l);
			return "redirect:/person";
	    }

		  }
		
	
	
	@RequestMapping("/m/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", personservices.findById(id));
		return "la.jsp";
	}
	
	
	

}
