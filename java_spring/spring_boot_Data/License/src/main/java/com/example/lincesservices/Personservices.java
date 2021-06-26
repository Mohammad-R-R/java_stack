package com.example.lincesservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.linceserepo.Perrepo;
import com.example.models.License;
import com.example.models.Person;
@Service
public class Personservices {
	private final Perrepo perrepo;
	
	public Personservices(Perrepo perrepo) {
		
		this.perrepo = perrepo;
	}

	public List<Person> showall() {
		return	perrepo.findAll();
		
	}
	
	public Person create(Person pro) {
		return perrepo.save(pro);	
	}
	
	
	public Person findById(Long id) {
		 return perrepo.findById(id).orElse(null);
		}

}
