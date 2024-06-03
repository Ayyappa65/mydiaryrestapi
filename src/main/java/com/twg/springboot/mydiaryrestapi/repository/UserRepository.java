package com.twg.springboot.mydiaryrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springboot.mydiaryrestapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);

}
