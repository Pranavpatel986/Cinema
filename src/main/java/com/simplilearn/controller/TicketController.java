package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;
import com.simplilearn.entity.Ticket;
import com.simplilearn.service.TicketService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/add")
	//@RequestMapping(value="/add",method = RequestMethod.POST,headers = "Accept=application/json")
	Ticket addTicket (@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
		return ticket;
		
	}
	
	@GetMapping("/userid/{userid}")
	List<Ticket> findByUserid (@PathVariable Long userid){
		return ticketService.findByUserid(userid);
	}
	@GetMapping("/id/{id}")
	Ticket findByid (@PathVariable Long id){
		return ticketService.findByid(id);
	}
	
	@DeleteMapping("/delete/{id}")
	Ticket deleteTicket (@PathVariable Long id) {
		return ticketService.deleteTicket(id);
	}
	

}
