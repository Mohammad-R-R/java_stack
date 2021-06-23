package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.demo.models.model;
import com.example.demo.repo.Langurepo;

@Service
public class LanguageServices {
	private final Langurepo langurepo;

	
	public LanguageServices(Langurepo langurepo) {
		this.langurepo = langurepo;
	}
	
	public List<model> finaAllSongs(){
		return this.langurepo.findAll();
	}
	
	public model create(model m) {
		return langurepo.save(m);
		
	}
	
	public void delete(long id) {
		langurepo.deleteById(id);
	}
	
	public model findLanguage(long id) {
		return langurepo.findById(id).orElse(null);
	}
	
	public model updateLanguage(model lang) {
		return langurepo.save(lang);
	}
	
}
