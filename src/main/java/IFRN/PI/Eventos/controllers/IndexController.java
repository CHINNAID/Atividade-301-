package IFRN.PI.Eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		//System.out.println("Chamou  o método index");
		//return "HOME";
		System.out.println("Evento Salvo com Sucessoo");
		System.out.println("bem Vindo");
		return "HOME";
	}
}
