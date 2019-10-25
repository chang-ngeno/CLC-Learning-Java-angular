package com.javahelps.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.User;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByName(@Param("name") String name);
}