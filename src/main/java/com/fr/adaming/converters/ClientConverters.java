package com.fr.adaming.converters;

import java.util.List;

import com.fr.adaming.controller.dto.LoginDto;
import com.fr.adaming.entity.Client;

public class ClientConverters {
	
	public Client convert(LoginDto dto) {
		Client client = new Client();
		client.setNom(dto.getNom());
		client.setPrenom(dto.getPrenom());
		client.setEmail(dto.getEmail());
		client.setDomaine(dto.getDomaine());
		return client;
	}
	
	public LoginDto convert(Client client) {
		LoginDto dto = new LoginDto();
		dto.setNom(client.getNom());
		dto.setPrenom(client.getPrenom());
		dto.setEmail(client.getEmail());
		dto.setDomaine(client.getDomaine());
		return dto;
	}
	
	
	
	public List<Client> convert2(List<LoginDto> dtos){
		return null;
		
	}
	
	public List<LoginDto> convert(List<Client> clients){
		return null;
	}

}
