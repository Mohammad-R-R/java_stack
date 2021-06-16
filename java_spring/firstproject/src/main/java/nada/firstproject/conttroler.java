package nada.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class conttroler {
	@RequestMapping("/")
    public String index() {
        return "index.jsp";

}
}
