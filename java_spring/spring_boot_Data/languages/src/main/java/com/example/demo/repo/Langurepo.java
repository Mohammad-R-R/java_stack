package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.model;

public interface Langurepo extends CrudRepository<model, Long> {
	List <model> findAll();

}
