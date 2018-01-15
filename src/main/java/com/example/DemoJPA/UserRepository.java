package com.example.DemoJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DemoJPA.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
