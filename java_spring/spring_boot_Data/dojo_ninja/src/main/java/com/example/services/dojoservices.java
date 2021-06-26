package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.models.Dojo;
import com.example.ninjaRepo.dojoRepo;
@Service
public class dojoservices {
	private final	dojoRepo dojorepo;
	public dojoservices(dojoRepo dojorepo) {
		this.dojorepo=dojorepo;
		
	}
	
	public List<Dojo> findAll(){
		return dojorepo.findAll();
		
	}
	
	public Dojo create(Dojo j) {
		return dojorepo.save(j);
	}

	public Optional<Dojo> findbyid(long id) {
		// TODO Auto-generated method stub
		return dojorepo.findById(id);
	}
	

}
