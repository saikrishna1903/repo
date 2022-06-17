package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Recipes;
import com.repository.repo;


@Controller
public class ControllerClass {
	@Autowired
	repo re;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homepage() {
		return "adding";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addd(Recipes res) {
		
		re.save(res);
		return "adding";
	}

}
