package com.example.BookOrderSpringApp;

import com.example.BookOrderSpringApp.utils.BootStrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BookOrderSpringAppApplication {

	private BootStrap bootStrap;

	public BookOrderSpringAppApplication(BootStrap bootStrap) {
		this.bootStrap = bootStrap;
	}

	@PostConstruct
	public void initializeDatabase(){
		bootStrap.initializeDatabase();
	}

	public static void main(String[] args) {
		SpringApplication.run(BookOrderSpringAppApplication.class, args);
	}

}
