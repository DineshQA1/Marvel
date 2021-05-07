package com.qa.marvel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarvelController {
	
	private List<Marvel> marvelList = new ArrayList<>();
	
	@GetMapping("/getMarvel")
	public List<Marvel> getMarvel(){
	return this.marvelList;
}
	
}

