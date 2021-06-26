package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.Country;
import com.example.repos.Therep;
import com.example.repos.cityReop;
import com.example.repos.languageRepo;



@Service
public class countriesService {
private final Therep CoR;
private final cityReop CiR;
private final languageRepo CiR2;

public countriesService(Therep coR, cityReop ciR, languageRepo ciR2) {
	super();
	CoR = coR;
	CiR = ciR;
	CiR2 = ciR2;
}
public List<Object[]> joinCountriesAndLanguagesWhereLanguage(){
	return CoR.solvene();
}
public List<Object[]> countcountries(){
	return CoR.countCountries();
}
public List<Object[]> mexicopop(){
	return CoR.mexico();
}
public List<Object[]> precentage(){
	return CoR.lang();
}
public List<Object[]> surface(){
	return CoR.below501();
}
public List<Object[]> lifecapital(){
	return CoR.lifeExpectancy();
}
public List<Object[]> pop(){
	return CoR.argentinaInsideTheBuenosAires();
}
public List<Object[]> region(){
	return CoR.numberOfCountriesInEachRegion();
}
}