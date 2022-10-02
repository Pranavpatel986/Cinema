package com.simplilearn;

import com.simplilearn.entity.Admin;
import com.simplilearn.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//@Component
//class DemoCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private AdminRepository adminRepository;
//	public void saveAdmin() {
//		Admin admin=new Admin();
//		admin.setName("pranavpatel");
//		admin.setPassword("1234");
//
//		adminRepository.save(admin);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		saveAdmin();
//	}
//}
