package com.sermaluc.springboot.app.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserResponseDTO {
	
    private Long id;
    private Date created;
    private Date modified;
    private Date lastLogin;
    private String token;
    private boolean isActive;
}