package IFRN.PI.Eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import IFRN.PI.Eventos.models.Evento;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	@PostMapping("/eventos")
	//@RequestMapping(path = "/eventos", method = RequestMethod.POST )
	public String adicionar(Evento evento) {
		
	System.out.println(evento);
	
		return "evento-adicionado";
	}

}
