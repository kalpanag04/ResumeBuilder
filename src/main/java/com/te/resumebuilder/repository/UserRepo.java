package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.resumebuilder.entity.MyUser;

public interface UserRepo extends JpaRepository<MyUser, Integer> {
	MyUser findByUsername(String username);
}
