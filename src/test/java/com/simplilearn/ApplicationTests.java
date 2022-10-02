package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simplilearn.entity.Admin;
import com.simplilearn.entity.Movie;
import com.simplilearn.entity.Ticket;
import com.simplilearn.entity.User;
import com.simplilearn.repository.AdminRepository;
import com.simplilearn.repository.MovieRepository;
import com.simplilearn.repository.TicketRepository;
import com.simplilearn.repository.UserRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ApplicationTests {
 @Autowired
 AdminRepository adminRepo;
 
 @Autowired
 MovieRepository movieRepo;
 
 @Autowired
 UserRepository userRepo;
 
 @Autowired
 TicketRepository ticketRepo;
 
	@Test
	void contextLoads() {
	}

	@Test
	@Order(1)
	public void readadmin() {
	}
	
	@Test
	@Order(2)
	public void addmovie() {
		Movie movie = new Movie(null,"Chandramukhitest","Marathi","Blockbuster","comedy",
				"2hr","chandramukhi.avif","bg-chandramukhi.avif","enabled",(long) 240);
		Movie savedmovie= movieRepo.save(movie);
		
		assertNotNull(savedmovie.getId());
		
	}
	
	@Test
	@Order(3)
	public void allmovies() {
		List<Movie> movie =movieRepo.findAll();
	assertNotNull(movie.size());
	}
	
	@Test
	@Order(4)
	public void idmovie() {
		Movie movie1 = movieRepo.findByName("Chandramukhitest");
		
	Optional<Movie> movie = movieRepo.findById(movie1.getId());
	if(movie.isPresent()) {
		
		assertEquals(movie.get().getPrice(), (long)240);
	}
	else {
		System.out.println("is not present");
		assertFalse(movie.isPresent());
	}
	}
	
	@Test
	@Order(5)
	public void updatemovies() {
		Movie movie1 = movieRepo.findByName("Chandramukhitest");
		
		movie1.setPrice((long)500);
		
		movieRepo.save(movie1);
		Movie movie= movieRepo.findByName("Chandramukhitest");
		assertNotEquals(movie.getPrice(), (long)240);
		
	}
	@Test
	@Order(6)
	public void deletemovie() {
		Movie movie1 = movieRepo.findByName("Chandramukhitest");
		movieRepo.deleteById(movie1.getId());
		Movie movie2 = movieRepo.findByName("Chandramukhitest");
		assertNull(movie2);
	}
	
	@Test
	@Order(7)
	public void adduser() {
		User user = new User((long)99,"vishal","shibe",(long) 963750310, "Pune, "
				+ "Maharastra","vishal@gmail.com","imvishal", "passwordtest");
		User saveduser =userRepo.save(user);
		assertNotNull(saveduser.getId());
		
	}
	@Test
	@Order(8)
	public void allusers() {
		List<User> user =userRepo.findAll();
	assertNotNull(user.size());
	}
	
	@Test
	@Order(9)
	public void userByName() {
		List<User> user =userRepo.findByUsername("imvishal");
	assertNotNull(user.size());
	}
	
	@Test
	@Order(10)
	public void iduser() {
		User user1 = userRepo.findByPassword("passwordtest");
	Optional<User> user = userRepo.findById(user1.getId());
	if(user.isPresent()) {
		
		assertEquals(user.get().getUsername(), "imvishal");
	}
	else {
		System.out.println("is not present");
		assertFalse(user.isPresent());
	}
	}
	@Test
	@Order(11)
	public void updateuser() {
		User user1 = userRepo.findByPassword("passwordtest");
		
		user1.setUsername("vishalvshibe");
		
		userRepo.save(user1);
		User user=userRepo.findByPassword("passwordtest");
		assertNotEquals(user.getUsername(), "imvishal");
		
	}
	@Test
	@Order(12)
	public void deleteuser() {
		User user1 = userRepo.findByPassword("passwordtest");
		userRepo.deleteById(user1.getId());
		User user = userRepo.findByPassword("passwordtest");
		assertNull(user);
	}
	@Test
	@Order(13)
	public void addTicket() {
		Ticket ticket = new Ticket((long)99, (long)1, (long)1,"Chandramukhi", null, "3.15pm",(long)2 ,
				(long)240, "chandramukhitest.avif");
		ticketRepo.save(ticket);
		assertNotNull(ticket.getId());
	}
	
	@Test
	@Order(14)
	public void allTicket() {
		List<Ticket> ticket =ticketRepo.findAll();
	assertNotNull(ticket.size());
	}

	
	@Test
	@Order(15)
	public void idticket() {
		Ticket ticket1 = ticketRepo.findByBanner("chandramukhitest.avif");
	Optional<Ticket> ticket = ticketRepo.findById(ticket1.getId());
	if(ticket.isPresent()) {
		
		assertEquals(ticket.get().getPrice(), (long)240);
	}
	else {
		System.out.println("is not present");
		assertFalse(ticket.isPresent());
	}
	}
	
	@Test
	@Order(16)
	public void updateTicket() {
		Ticket ticket1 = ticketRepo.findByBanner("chandramukhitest.avif");
		
		ticket1.setPrice((long)500);
		ticketRepo.save(ticket1);
		assertNotEquals(240,ticket1.getPrice());
		
	}
	@Test
	@Order(17)
	public void deleteTicket() {
		Ticket ticket1 = ticketRepo.findByBanner("chandramukhitest.avif");
		ticketRepo.deleteById(ticket1.getId());
		Ticket ticket = ticketRepo.findByBanner("chandramukhitest.avif");
		assertNull(ticket);
	}
	@Test
	@Order(18)
	public void addAdmin() {
		Admin admin = new Admin("admin1","admin1");
		adminRepo.save(admin);
		assertNotNull(admin.getId());
	}
	@Test
	@Order(19)
	public void ReadAdmin() {
		Admin admin1 = adminRepo.findByName("admin1");
		Optional<Admin> admin = adminRepo.findById(admin1.getId());
		if(admin.isPresent()) {
			assertEquals(admin.get().getPassword(), "admin1");
		}
		else {
			System.out.println("is not present");
			assertFalse(admin.isPresent());
		}
	}
	@Test
	@Order(20)
	public void deleteAdmin() {
		Admin admin1 = adminRepo.findByName("admin1");
		adminRepo.deleteById(admin1.getId());
		Admin admin = adminRepo.findByName("admin1");
	assertNull(admin);
	}
	
}
