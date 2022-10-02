package com.simplilearn.entity;


import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=(GenerationType.IDENTITY))
	private Long id;
	private String name;
	private String lang;
	private String info;
	private String genre;
	private String time;
	private String banner;
	private String bg_banner;
	private String status;
	private Long price;
	
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getBg_banner() {
		return bg_banner;
	}
	public void setBg_banner(String bg_banner) {
		this.bg_banner = bg_banner;
	}
	
	
	public Movie(Long id, String name, String lang, String info, String genre, String time, String banner,
			String bg_banner, String status, Long price) {
		super();
		this.id = id;
		this.name = name;
		this.lang = lang;
		this.info = info;
		this.genre = genre;
		this.time = time;
		this.banner = banner;
		this.bg_banner = bg_banner;
		this.status = status;
		this.price = price;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
