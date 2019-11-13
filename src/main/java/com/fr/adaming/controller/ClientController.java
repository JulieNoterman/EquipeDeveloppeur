package com.fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.controller.dto.LoginDto;
import com.fr.adaming.entity.Client;
import com.fr.adaming.service.ClientService;

@RestController
@RequestMapping(path = "api/client")
public class ClientController {
	
	@Autowired
	private ClientService service;

	@PostMapping(path = "/login")
	public String save(@RequestBody LoginDto dto) {
		if(service.save( new Client(dto)) != null) {
			return "SUCCESS";
		}else {
			return "FAIL";
		}
	}

	@GetMapping(path = "/getall")
	public List<Client> findAll() {
		return service.findAll();
	}

	@RequestMapping(path = "/update", method=RequestMethod.PUT)
	public boolean updateClient(@RequestBody LoginDto dto) {
		return service.updateClient(new Client(dto));
	}

	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public Client deleteClient(@RequestBody LoginDto dto) {
		return service.deleteClient(new Client(dto));
	}
	
	

}
