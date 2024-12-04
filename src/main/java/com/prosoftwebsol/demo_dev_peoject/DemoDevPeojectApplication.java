package com.prosoftwebsol.demo_dev_peoject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDevPeojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevPeojectApplication.class, args);
	}
    @GetMapping("/hello")
    public String hello() {
      return String.format(" <h1>Hello There !!! , Welcome to my project </h1> ");
    }

}
