package IFRN.PI.Eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import IFRN.PI.Eventos.models.Evento;
import IFRN.PI.Eventos.repositories.EventoRepository;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventosController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEvento";
	}
	@PostMapping("/eventos")
	//@RequestMapping(path = "/eventos", method = RequestMethod.POST )
	public String adicionar(Evento eventos) {
		
	System.out.println(eventos);
	er.save(eventos);
	
		return "eventos/evento-adicionado";
	}

}
