package com.fr.adaming.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginDto {
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String nom;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String prenom;
	
	@Email
	@NotNull
	@NotEmpty
	@NotBlank
	private String email;
	
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String domaine;

}
