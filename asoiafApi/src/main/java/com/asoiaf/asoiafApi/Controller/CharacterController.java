package com.asoiaf.asoiafApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asoiaf.asoiafApi.Repository.CharacterRepository;

@RestController
@RequestMapping("/characters")
public class CharacterController {
	@Autowired
	private CharacterRepository characterRepository;
	
	@GetMapping
	public List<Character_> list(){		
		return characterRepository.findAll();
		}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Character_ add(@RequestBody Character_ character){
		return characterRepository.save(character);
	}

}
