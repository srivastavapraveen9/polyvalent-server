package com.org.polyvalent.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {
	
    @RequestMapping(value="/hi",method= RequestMethod.GET)
	public String hi() {
		return "Hello World from Restful API";
	}
}
