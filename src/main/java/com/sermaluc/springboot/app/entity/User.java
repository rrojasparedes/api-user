package com.sermaluc.springboot.app.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Users")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	private Date created;
	private Date modified;
	private boolean isactive;
	private String token;
	private Date lastLogin;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Phones> phones;
	
	@PrePersist
	public void prePersist() {
		created = new Date();
		modified = new Date();
		lastLogin = new Date();
		token = UUID.randomUUID().toString();
	}

}
