package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	
	List<Ticket> findByUserid(Long userid);
	Ticket findByBanner(String banner);
}
