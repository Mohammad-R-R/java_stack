package com.example.ninjaRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.models.Dojo;


public interface dojoRepo extends CrudRepository<Dojo, Long>  {
	List<Dojo> findAll();
	Optional<Dojo> findById( Long id);
}
