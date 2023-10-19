package com.example.RegisterLoginLogout.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegisterLoginLogout.security.entity.ERole;
import com.example.RegisterLoginLogout.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
