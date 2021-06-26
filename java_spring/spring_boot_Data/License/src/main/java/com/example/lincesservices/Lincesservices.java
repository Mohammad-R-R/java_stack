package com.example.lincesservices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.linceserepo.Lincrepo;
import com.example.models.License;
import com.example.models.Person;
@Service
public class Lincesservices {
	private final Lincrepo lincrepo;

	public Lincesservices(Lincrepo lincrepo) {
		
		this.lincrepo = lincrepo;
	}
	
	public List<License> showlins(){
		return lincrepo.findAll();
	}
	
	public License create(License license) {
		return lincrepo.save(license);	
	}
	
	public License findById(Long id) {
	 return lincrepo.findById(id).orElse(null);
	}

}
