package com.eb.SpringSecurity.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
	
	private String username;
	private String password;


}
