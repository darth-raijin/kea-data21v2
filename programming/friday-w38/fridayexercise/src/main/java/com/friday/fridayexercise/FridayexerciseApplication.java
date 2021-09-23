package com.friday.fridayexercise;

// Spring imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Other imports
import java.time.DayOfWeek;

@RestController
@SpringBootApplication
public class FridayexerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridayexerciseApplication.class, args);
	}

	@RequestMapping(value = "/available")
	public String available() {
	  return "Spring in Action";
	}

	
}
