package com.kosa.dto;

import java.util.Collection;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private String uId, pwd;
	private Date regdate;


}
