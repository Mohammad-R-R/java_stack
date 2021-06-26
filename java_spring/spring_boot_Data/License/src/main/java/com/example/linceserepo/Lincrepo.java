package com.example.linceserepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.models.License;

public interface Lincrepo extends CrudRepository<License, Long> {
	List<License> findAll();

	
}
