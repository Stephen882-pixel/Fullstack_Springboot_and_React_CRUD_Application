package com.example.my_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.my_app.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
