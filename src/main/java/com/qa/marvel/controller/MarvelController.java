package com.qa.marvel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.marvel.domain.Marvel;

@RestController
public class MarvelController {
	
	private List<Marvel> marvelList = new ArrayList<>();
	
	@GetMapping("/getAll")
	public List<Marvel> getMarvel(){
	return this.marvelList;
	}
	
	@PostMapping("/create")
	public void createCharacter(@RequestBody Marvel marvel) {
		this.marvelList.add(marvel);
	}
	
	@GetMapping("/getOne/{id}")
	public Marvel gerCharacterbyID(@PathVariable int id) {
	return this.marvelList.get(id);
	}
	
	@DeleteMapping("/remove/{id}")
	public Marvel removeCharacter(@PathVariable int id) {
		return this.marvelList.remove(id);
	}
	
	
	
}
