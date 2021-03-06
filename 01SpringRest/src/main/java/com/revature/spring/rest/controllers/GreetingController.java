package com.revature.spring.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	private String template ="Hello Again ";
	private long counter;
	
	@RequestMapping("/greeting")
	@ResponseBody
	public Greeting greeting (@RequestParam(value="name",defaultValue="World") String name) {
		return new Greeting(counter++,template+ name);
	}
}
