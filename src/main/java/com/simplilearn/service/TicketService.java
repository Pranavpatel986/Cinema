package com.simplilearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Ticket;

@Service
public interface TicketService {
	Ticket addTicket (Ticket ticket);
	
 Ticket findByid(Long id);
 
 List<Ticket> findByUserid(Long userid);
 Ticket findByBanner(String banner);
 Ticket deleteTicket (Long id);
 
	
}
