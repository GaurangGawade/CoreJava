package com.eb.SpringSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.SpringSecurity.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>{
	
	Optional<UserInfo>findByName(String username);	
	
}
