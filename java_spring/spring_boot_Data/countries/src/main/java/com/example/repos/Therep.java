package com.example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.models.Country;

public interface Therep extends CrudRepository<Country, Integer> {
	
	@Query(value="SELECT countries.name, languages.language, languages.percentage \r\n" + 
			"FROM countries, languages \r\n" + 
			"WHERE languages.country_id = countries.id and language='slovene' order by percentage desc;",nativeQuery=true)
	List <Object[]> solvene();
	
	@Query(value="SELECT countries.name ,COUNT(*) c\r\n"
	 		+ "from cities join countries on countries.id=cities.country_id\r\n"
	 		+ "GROUP BY countries.name HAVING c > 1\r\n"
	 		+ "order by c desc;",nativeQuery=true)
	 	List<Object[]> countCountries();
	 	
 	@Query(value="select cities.name,cities.population , cities.country_id from cities \r\n" + 
 			" JOIN countries ON cities.country_id = countries.id\r\n" + 
 			" where countries.name ='Mexico' and cities.population>500000\r\n" + 
 			" order by population desc;",nativeQuery=true)
 	List<Object[]> mexico();
 	
 	@Query(value="SELECT countries.name, languages.language, languages.percentage \r\n" + 
 			"FROM countries, languages \r\n" + 
 			"WHERE languages.country_id = countries.id and percentage>89 order by percentage desc;",nativeQuery = true)
 	List<Object[]> lang();
 	@Query(value = "SELECT name, surface_area, population \r\n" + 
 			"FROM countries \r\n" + 
 			"WHERE surface_area < 501 and population > 100000;",nativeQuery = true)
 	List<Object[]> below501();
 	
 	@Query(value = "select name,government_form,life_expectancy,capital from countries \r\n" + 
 			"where government_form='Constitutional Monarchy' and capital>200 and life_expectancy>75;",nativeQuery = true)
 	List<Object[]> lifeExpectancy();
 	
 	@Query(value = " select countries.name, cities.name,cities.district,cities.population   from cities \r\n" + 
 			" JOIN countries ON cities.country_id = countries.id\r\n" + 
 			" where countries.name ='Argentina' and cities.district='Buenos Aires' and cities.population>500000\r\n" + 
 			" order by population desc;",nativeQuery = true)
 	List<Object[]> argentinaInsideTheBuenosAires();
 	
 	@Query(value = "SELECT countries.region , COUNT(countries.id) AS countries\r\n" + 
 			" FROM countries\r\n" + 
 			" GROUP BY region\r\n" + 
 			" ORDER BY COUNT(countries.id) desc;",nativeQuery = true)
 	List<Object[]> numberOfCountriesInEachRegion();
	

}
