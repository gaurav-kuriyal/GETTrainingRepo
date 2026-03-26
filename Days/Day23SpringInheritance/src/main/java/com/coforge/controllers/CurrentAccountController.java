package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.CurrentAccount;
import com.coforge.repositories.CurrentAccountRepository;

@RestController
public class CurrentAccountController {
	@Autowired
	CurrentAccountRepository currentAccountRepository;
	
	@GetMapping("/")
	public List<CurrentAccount> findAll(){
		return currentAccountRepository.findAll();
	}

	@PostMapping("/")
	public CurrentAccount save(@RequestBody CurrentAccount c){
		return currentAccountRepository.save(c);
	}
}
