package com.myprojects.wheelspin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.myprojects.wheelspin","com.myprojects.wheelspin.controllers"})
public class WheelspinApplication {

	public static void main(String[] args) {
		SpringApplication.run(WheelspinApplication.class, args);
	}

}
