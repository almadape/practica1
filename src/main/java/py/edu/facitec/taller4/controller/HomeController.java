package py.edu.facitec.taller4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//indica a Spring que se trata 
@Controller

public class HomeController {
	
	// lo que se escribe en el navegador
	@RequestMapping("/")
	
	public String index(){
		
		System.out.println("carge la pagina");
		// pagina  a responder
		return "pagina_home";
	}
	

}
