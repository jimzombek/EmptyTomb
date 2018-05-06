package com.jmzombek;

import java.lang.String;
import java.lang.Exception;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class App {

	@RequestMapping("/")
	String home() {
		return "Hello JimZ";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}