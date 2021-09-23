package com.friday.fridayexercise.controller;

// Spring imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.friday.fridayexercise.services.DayCalculator;

@Controller
@SpringBootApplication
public class FridayexerciseApplication {

DayCalculator calculator = new DayCalculator();
	public static void main(String[] args) {
		SpringApplication.run(FridayexerciseApplication.class, args);
	}

	// Exercise 1.1
	/*
	 * Spring returns the index.html template as a view for the / route.
	 */

	// Exercise 1.2
	// Endpoint returns a Hello + name query
	@GetMapping("/hello")
	public String hello(@RequestParam(name="name", defaultValue="Erik") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	// Exercise 1.3 
	// Endpoint tells whether its friday or not, experimenting with Thymeleaf to make the page more dynamic with conditions etc.
	@GetMapping("/friday")
	public String isItFriday(Model model) {
		boolean isItFriday = calculator.isItFriday();


		model.addAttribute("friday", isItFriday);
		return "friday";
	}
}

