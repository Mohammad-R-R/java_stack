package nada.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	@RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Hello client! how are u doing ?";
    }
	
	@RequestMapping("/random")
    // 3. Method that maps to the request route above
    public String wel() { // 3
            return "spring boot is great! so easy to just respond with string";
    }

}
