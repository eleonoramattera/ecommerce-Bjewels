package com.bjewels.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjewels.security.entity.ERole;
import com.bjewels.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
