package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.Dojo;
import com.example.models.Ninja;
import com.example.ninjaRepo.ninjaRepo;
@Service
public class ninjaservices {
	
	private final	ninjaRepo ninjarepo;
	public ninjaservices(ninjaRepo ninjarepo) {
		this.ninjarepo=ninjarepo;
		
	}
	
	public  List<Ninja> findAll(){
		return ninjarepo.findAll();
		
	}
	
	public Ninja create(Ninja j) {
		return ninjarepo.save(j);
	}

}
