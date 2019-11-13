package com.fr.adaming.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fr.adaming.entity.Employe;


@Repository
public interface EmployeDao extends JpaRepository<Employe, Integer> {

	public Employe findByEmail(String email);
	
	public Employe getByEmailAndPwd (String email, String pwd);

	public List<Employe> getByFonction(String fonction);

	public List<Employe> findByEmailIn(String... email);
	
	@Query(value = "select * from employe where deleted = false", nativeQuery = true)
	public List<Employe> getNotDelete();
	
	@Transactional
	@Modifying
	@Query(value = "update employe set deleted = true where id like :xId", nativeQuery = true ) //Par défaut requete hql
	public void deleteAnEmploye(@Param(value = "xId") int id);
	
	@Transactional
	@Modifying
	@Query(value = "update employe set deleted = true where nom like :xNom", nativeQuery = true ) //Par défaut requete hql
	public void deleteAnEmployeByNom(@Param(value = "xNom") String nom);

}
