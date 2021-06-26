package com.example.licensecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lincesservices.Personservices;
import com.example.models.Person;
@Controller
public class personcontroller {
	private final Personservices personservices;

	public personcontroller(Personservices personservices) {
		super();
		this.personservices = personservices;
	}
	
	@RequestMapping("/")
	public String show(@ModelAttribute("Person") Person p) {
		return "newper.jsp";
	}
	
	@RequestMapping(value="/tocreate",method=RequestMethod.POST)
	public String topost(@ModelAttribute("Person") Person x  ) {
		
		personservices.create(x);
		return "redirect:/show/line";
	}

}
