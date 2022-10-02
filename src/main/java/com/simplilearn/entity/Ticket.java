package com.simplilearn.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy=(GenerationType.IDENTITY))
	private Long id;
	private Long userid;
	private Long movieid;
    private String moviename;
    private Date date;
    private String showtime;
    private Long seats;
    private Long price;
    private String banner;
    
    
	public Long getMovieid() {
		return movieid;
	}
	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public Long getSeats() {
		return seats;
	}
	public void setSeats(Long seats) {
		this.seats = seats;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(Long id, Long userid, Long movieid, String moviename, Date date, String showtime, Long seats,
			Long price, String banner) {
		super();
		this.id = id;
		this.userid = userid;
		this.movieid = movieid;
		this.moviename = moviename;
		this.date = date;
		this.showtime = showtime;
		this.seats = seats;
		this.price = price;
		this.banner = banner;
	}
	
	
	

}
