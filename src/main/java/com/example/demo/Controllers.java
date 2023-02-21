package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controllers {
	private String StudentName="IamNeo";
	@GetMapping("/cont")
	public String getName() {
		return "Welcome "+StudentName;
	}

}