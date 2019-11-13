package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.EmployeDao;
import com.fr.adaming.entity.Employe;



@Service
public class EmployeService {

	@Autowired
	private EmployeDao daoE;

	public Employe login(String email, String pwd) {

		return daoE.getByEmailAndPwd(email, pwd);
	}
	
	public List<Employe> getAll(){
		return daoE.findAll();
	}
	
	public List<Employe> getAllNotDelete(){
		return daoE.getNotDelete();
	}
	
	public Employe register (Employe employe) {
		return daoE.save(employe);
	}
	
	public void updateEmploye(Employe employe) {
		daoE.save(employe);
	}
	
	public Employe getById(int id) {
		return daoE.findById(id).get(); 
	}
	
	public List<Employe> getByFonction(String fonction){
		return daoE.getByFonction(fonction);
	}
	
	public void deleteByNom(String nom) {
		daoE.deleteAnEmployeByNom(nom);
	}
	
	public void deleteById(int id) {
		daoE.deleteAnEmploye(id);
	}
	
	
	

}
