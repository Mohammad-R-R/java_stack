package com.example.ninjaRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.models.Ninja;

public interface ninjaRepo extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}
