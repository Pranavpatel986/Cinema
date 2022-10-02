package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Ticket;
import com.simplilearn.repository.TicketRepository;
import com.simplilearn.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
@Autowired
TicketRepository ticketRepo;
	
	@Override
	public Ticket addTicket(Ticket ticket) {
		
		return ticketRepo.save(ticket);
	}

	@Override
	public Ticket findByid(Long id) {
		Optional<Ticket> ticket = ticketRepo.findById(id);
		if(ticket.isPresent()) {
			return ticket.get();
		}
		return null;
	}

	

	@Override
	public List<Ticket> findByUserid(Long userid) {
		// TODO Auto-generated method stub
		return ticketRepo.findByUserid(userid);
	}

	@Override
	public Ticket deleteTicket(Long id) {
		
		ticketRepo.deleteById(id);
		return null;
	}

	@Override
	public Ticket findByBanner(String banner) {
		
		return ticketRepo.findByBanner(banner);
	}

}
