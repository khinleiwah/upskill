package com.upskill.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskill.user.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
