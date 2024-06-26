package com.example.sec_jwt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Members {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mno;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	private String nickname;
	private String role;
}