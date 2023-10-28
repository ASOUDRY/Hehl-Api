package com.soudry.hehlma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soudry.hehlma.entities.CharacterClass;

public interface RoleRepository extends JpaRepository<CharacterClass, String> {
    
}
