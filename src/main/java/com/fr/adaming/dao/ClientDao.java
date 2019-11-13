package com.fr.adaming.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entity.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
	
	public Client findByEmail(String email);
	
}
