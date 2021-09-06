package com.myprojects.wheelspin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageUpController {
	
	@RequestMapping(value="/playWheelSpin")
	public String mainPage() {
		return "main";
	}
}
