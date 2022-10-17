package com.lex.demo.userapp.repo;

import com.lex.demo.userapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
