package com.myprojects.wheelspin.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserPrize {
	
	@RequestMapping(value = "/getUserPrize")
	public String getPrize() {
		return "Congratulations you have won";
	}
}
