package com.lex.demo.userapp.repo;

import com.lex.demo.userapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
