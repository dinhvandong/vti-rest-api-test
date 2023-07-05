package com.vti.demorestfulapi.repository;

import com.vti.demorestfulapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
