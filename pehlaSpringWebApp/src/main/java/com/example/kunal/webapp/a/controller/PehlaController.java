package com.example.kunal.webapp.a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PehlaController {
	
	@GetMapping()
	public String getHelloSpringHomePage()
	{
		return "Hello without/search";
	}
	@GetMapping("search")
	public String getName()
	{
		return "Hello Spring";
	}
	@GetMapping("searching")
	public String searchParametre(@RequestParam(name ="q") String value)
	{
		return value;
	}
	@GetMapping("searchingpath/{celebrity_name}")
	public String searchPath(@PathVariable(name ="celebrity_name") String value)
	{
		return value;
	}
	@PostMapping(path="post")
	public void postkro()
	{
		System.out.println("running post");
	}

}
